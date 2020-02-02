package info.interventure.userpolls;

import com.mongodb.ClientSessionOptions;
import com.mongodb.DB;
import com.mongodb.client.ClientSession;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClientFactory;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import java.util.Optional;

@SpringBootApplication
public class UserPollsApplication {




	public static void main(String[] args) {
		SpringApplication.run(UserPollsApplication.class, args);
	}

	@Bean

	public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) {



		return new MongoTemplate(mongoDbFactory);


	}

}
