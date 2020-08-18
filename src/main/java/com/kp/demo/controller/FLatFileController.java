package com.kp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kp.demo.pojo.FLatFile;
import com.kp.demo.service.FlatFileService;

@RestController
@RequestMapping("/flatfile/api/v1/{tenantId}")
public class FLatFileController {
	@Autowired
	private FlatFileService flatfileService;
	@PostMapping(value = "/file")
	public ResponseEntity<?> saveFile(@RequestBody FLatFile flatfile,@PathVariable ("tenantId")String tenantId){
		FLatFile response = flatfileService.addFile(flatfile, tenantId);
			
		return new ResponseEntity<>(response, null,  HttpStatus.OK);
		
	}
	@GetMapping(value = "/file")
	public ResponseEntity<?> readFiles(@PathVariable ("tenantId") String tenantId){
		List<FLatFile> response = flatfileService.readAllFile(tenantId);
		return new ResponseEntity<>(response, null,  HttpStatus.OK);
		
	}
	@GetMapping(value = "/file/{id}")
	public ResponseEntity<?> readSingleFile(@PathVariable ("id")String id ,@PathVariable ("tenantId")String tenantId){
		FLatFile response = flatfileService.readSingleFile(id, tenantId);
		return new ResponseEntity<>(response, null,  HttpStatus.OK);
		
	}
	@PatchMapping(value = "/file/{id}")
	public ResponseEntity<?> updateSingleFile(@RequestBody FLatFile flatfile,@PathVariable ("tenantId")String tenantId,@PathVariable ("id")String id ){
		FLatFile response = flatfileService.updateFile(flatfile, id, tenantId);
		return new ResponseEntity<>(response, null,  HttpStatus.OK);
	}
}
