package com.bmw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bmw.helper.FileHelper;

@RestController
public class FileUploadController {
	@Autowired
	private FileHelper fileHelper;

	@PostMapping("/fileUpload")
	public ResponseEntity<String> fileUpload(@RequestParam("fileName")MultipartFile multipartFile) {
		System.out.println(multipartFile.getOriginalFilename());
		if(multipartFile.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must include a file");
		}
		try {
			fileHelper.fileUpload(multipartFile);
//			return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/files").path(multipartFile.getOriginalFilename()).toUriString());
			return ResponseEntity.ok().body("File Uploaded successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
}
