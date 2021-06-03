package com.jachs.mongodb;

import org.bson.Document;
import org.junit.Test;

import com.jachs.mongodb.entity.User;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Demo {
	MongoConfigure mongoConfigure = new MongoConfigure();

	// 添加一条数据
	@Test
	public void test1() {
		User user = new User(1, "Stlve", "123", 15);

		MongoDatabase database = mongoConfigure.initMongoDatabase();

		MongoCollection<Document> collection = database.getCollection("profile");
		Document document = new Document().append("UserId", user.getUserId()).append("UserName", user.getUserName())
				.append("UserPwd", user.getUserPwd()).append("Age", user.getAge());

		collection.insertOne(document);
	}

	@Test
	public void test2() {
		MongoDatabase database = mongoConfigure.initMongoDatabase();

		System.out.println(database.getName());
		MongoIterable<String> mis = database.listCollectionNames();
		for (String str : mis) {
			System.out.println(str);
		}
	}

	// 查询数据
	@Test
	public void test3() {
		MongoDatabase database = mongoConfigure.initMongoDatabase();
		MongoCollection<Document> collection = database.getCollection("profile");
		
		BasicDBObject basicDBObject = new BasicDBObject();
		collection.find(basicDBObject);
		
		FindIterable<Document> iterable = collection.find(basicDBObject);
        for (Document doc : iterable){
        	System.out.println(doc.getInteger("UserId"));
        	System.out.println(doc.getString("UserName"));
        	System.out.println(doc.getString("UserPwd"));
        	System.out.println(doc.getInteger("Age"));
        }
	}
}
