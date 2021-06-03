package com.jachs.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/***
 * 
 * @author zhanchaohan
 *
 */
public class MongoConfigure {
	public MongoDatabase initMongoDatabase() {
		MongoClient mongoClient = MongoClients.create(
				"mongodb+srv://root:mongo_jachs@jachs.x6t1o.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
		return mongoClient.getDatabase("test");
	}
}
