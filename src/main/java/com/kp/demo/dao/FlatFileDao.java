package com.kp.demo.dao;

import java.util.List;

import com.kp.demo.pojo.FLatFile;

public interface FlatFileDao {
	public FLatFile saveFile(FLatFile flatfile,String tenantID);
	public List<FLatFile> findAllFile(String tentantID);
	public FLatFile findSingleFile(String ID,String tenantID);
	public FLatFile UpdateFile(FLatFile flatfile,String id,String tenantID);
}
