package com.kp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kp.demo.dao.FlatFileDao;
import com.kp.demo.pojo.FLatFile;

@Service
public class FlatFileServiceImplementation implements FlatFileService {
@Autowired
private FlatFileDao flatFileDao;
	@Override
	public FLatFile addFile(FLatFile flatfile, String tenantID) {
		flatfile.setTenantId(tenantID);
		FLatFile file = flatFileDao.saveFile(flatfile, tenantID);
		return file;
	}

	@Override
	public List<FLatFile> readAllFile(String tentantID) {
		List<FLatFile> file = flatFileDao.findAllFile(tentantID);
		return file;
	}

	@Override
	public FLatFile readSingleFile(String ID, String tenantID) {
    FLatFile file = flatFileDao.findSingleFile(ID, tenantID);
	return file;
	}

	@Override
	public FLatFile updateFile(FLatFile flatfile, String ID, String tenantID) {
		FLatFile file = flatFileDao.UpdateFile(flatfile, ID, tenantID);
		return file;
	}
	

}
