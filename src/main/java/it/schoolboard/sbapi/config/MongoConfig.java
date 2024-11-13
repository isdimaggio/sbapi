package it.schoolboard.sbapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

@Configuration
@EnableMongoAuditing(auditorAwareRef = "auditorAware")
public class MongoConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareMockImpl();
    }

    //TODO: uploadare i file
    @Bean
    public MongoTemplate mongoTemplate(MongoDatabaseFactory mongoDatabaseFactory, MappingMongoConverter converter) {
        return new MongoTemplate(mongoDatabaseFactory, converter);
    }

    @Bean
    public GridFsTemplate gridFsTemplate(MongoDatabaseFactory mongoDatabaseFactory, MappingMongoConverter converter) {
        return new GridFsTemplate(mongoDatabaseFactory, converter);
    }

}
