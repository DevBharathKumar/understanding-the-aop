package org.bharath.aop.understandingtheaop;

import org.bharath.aop.understandingtheaop.business.Business1;
import org.bharath.aop.understandingtheaop.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnderstandingTheAopApplication implements CommandLineRunner{
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	Logger logger = LoggerFactory.getLogger(UnderstandingTheAopApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UnderstandingTheAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Business1 {} ",business1.someBusiness1());
		logger.info("Business2 {} ",business2.someBusiness2());
	}

}
