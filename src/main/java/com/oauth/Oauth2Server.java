package com.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  curl -X POST -vu clientapp:123456 http://localhost:9090/oauth/token -H "Accept: application/json" -d "password=spring&username=roy&grant_type=password&scope=read%20write&client_secret=123456&client_id=clientapp"
 * @author Patar Timotius
 * read https://stackoverflow.com/questions/29647452/how-to-configure-spring-security-oauth-2-0-client-store-to-database
 * https://blog.couchbase.com/oauth-2-dynamic-client-registration/
 * https://dreamix.eu/blog/java/building-microservices-with-netflix-oss-apache-kafka-and-spring-boot-part-4-security
 */	
@SpringBootApplication
@EnableEurekaClient
public class Oauth2Server {
	public static void main(String args[]) {
		SpringApplication.run(Oauth2Server.class, args);
	}

}


