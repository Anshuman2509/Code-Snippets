package com.bmw.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class FileHelper {
	private final String FILEPATH="src\\main\\resources\\static\\files";
	
	public void fileUpload(MultipartFile multipartFile) {
		try {
			InputStream inputStream=multipartFile.getInputStream();
			byte[] fileBytes=new byte[inputStream.available()];
			inputStream.read(fileBytes);
			inputStream.close();
			FileOutputStream fileOutputStream=new FileOutputStream(FILEPATH+File.separator+multipartFile.getOriginalFilename());
			fileOutputStream.write(fileBytes);
			fileOutputStream.close();
			
		} catch (Exception e) {
			
		}
		
	}

}
