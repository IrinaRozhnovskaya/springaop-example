package com.springaop.basics.springaopexample;

import com.springaop.basics.springaopexample.business.Business1;
import com.springaop.basics.springaopexample.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringaopExampleApplication implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
	Business1 business1;

    @Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringaopExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    log.info(business1.calculateSomething());
	    log.info(business2.calculateSomething());
	}
}
