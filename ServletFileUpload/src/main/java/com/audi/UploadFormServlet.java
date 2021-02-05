package com.audi;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadFormServlet extends HttpServlet {
	public static final String UPLOAD_DIRECTORY = "files";
	public static final String DEFAULT_FILENAME = "default.file";

	public static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;// 3MB
	public static final int MAX_FILE_SIZE = 1024 * 1024 * 40;// 40MB
	public static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50;// 50MB

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (ServletFileUpload.isMultipartContent(req)) {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			/*
			 * Set the maximum allowed size (in bytes) before uploads are written to disk.
			 * Uploaded files will still be received past this amount, but they will not be
			 * stored in memory. Default is 10240, according to Commons FileUpload.
			 */
			factory.setSizeThreshold(MEMORY_THRESHOLD);// Sets the size threshold beyond which files are written
														// directly to disk.
			factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

			ServletFileUpload fileUpload = new ServletFileUpload(factory);
			fileUpload.setFileSizeMax(MAX_FILE_SIZE);// Sets the maximum allowed size of a single uploaded file
			fileUpload.setSizeMax(MAX_REQUEST_SIZE);// Sets the maximum allowed size of a complete request

			String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
			System.out.println(uploadPath);

			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}

			try {
				List<FileItem> formItems = fileUpload.parseRequest(req);

				if (formItems != null && formItems.size() > 0) {
					for (FileItem item : formItems) {
						if (!item.isFormField()) {
							String fileName = new File(item.getName()).getName();
							String filePath = uploadPath + File.separator + fileName;
							File storeFile = new File(filePath);
							item.write(storeFile);
							req.setAttribute("message", "File " + fileName + " has uploaded successfully!");
						}
					}
				}
			} catch (Exception ex) {
				req.setAttribute("message", "There was an error: " + ex.getMessage());
			}
			getServletContext().getRequestDispatcher("/result.jsp").forward(req, resp);

		}
	}
}
