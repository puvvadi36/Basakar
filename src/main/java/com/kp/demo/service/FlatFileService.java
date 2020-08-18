package com.kp.demo.service;

import java.util.List;

import com.kp.demo.pojo.FLatFile;

public interface FlatFileService {
	
	public FLatFile addFile(FLatFile flatfile,String tenantID);
	public List<FLatFile> readAllFile(String tentantID);
	public FLatFile readSingleFile(String ID,String tenantID);
	public FLatFile updateFile(FLatFile flatfile,String ID,String tenantID);

}
