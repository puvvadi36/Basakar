package com.kp.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.kp.demo.pojo.FLatFile;
import com.mongodb.client.MongoClients;

@Repository
public class FlatFileDaoImplementation implements FlatFileDao {
	
	@Value("${spring.data.mongodb.host}")
	String mongoHost;

	@Value("${spring.data.mongodb.port}")
	String mongoPort;

	@Override
	public FLatFile saveFile(FLatFile flatfile, String tenantID) {
		MongoTemplate template = getConnection(tenantID);
		FLatFile response = template.save(flatfile);
		return response;
	}

	@Override
	public List<FLatFile> findAllFile(String tenantID) {
		MongoTemplate template = getConnection(tenantID);
		List <FLatFile> li = template.findAll(FLatFile.class);
		return li;
	}

	@Override
	public FLatFile findSingleFile(String ID, String tenantID) {
		MongoTemplate template = getConnection(tenantID);
		FLatFile response = template.findById(ID, FLatFile.class);
		return response;
		
	}
	private MongoTemplate getConnection(String dbName) {
		String mongoConnectionString = "mongodb://"+ mongoHost + ":" + mongoPort;
		MongoTemplate mongoTemplate = new MongoTemplate(MongoClients.create(mongoConnectionString), dbName);
		return mongoTemplate;
	}

	@Override
	public FLatFile UpdateFile(FLatFile flatfile, String id, String tenantID) {
		MongoTemplate template = getConnection(tenantID);
		Query query = new Query();
		Criteria criteria = new Criteria();
		Criteria.where("_id").exists(true);

		if (flatfile.getId()!= null && !flatfile.getId().isEmpty()) {
		criteria.and("_id").is(flatfile.getId());
		}


		query.addCriteria(criteria);

		Update update = new Update();

		if(flatfile.getName()!= null) {
				update.set("name", flatfile.getName());
		}
		

		FLatFile flatFileResponse = template.findAndModify(query, update, new FindAndModifyOptions().returnNew(true),
		FLatFile.class);
		return flatFileResponse;
	}

}
