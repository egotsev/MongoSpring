package MongoDB.Spring;

import java.util.Arrays;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@ComponentScan(basePackages = "MongoDB.Spring")
@EnableWebMvc
@EnableMongoRepositories
public class ApplicationConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "playground";
	}

	@Override
	public Mongo mongo() throws Exception {
		MongoCredential credentials = MongoCredential.createCredential("admin", "playground", "admin".toCharArray());
		MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credentials));
		return mongoClient;
	}
	
}
