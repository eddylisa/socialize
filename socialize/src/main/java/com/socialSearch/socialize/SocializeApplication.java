package com.socialSearch.socialize;

import com.socialSearch.socialize.Model.User;
import com.socialSearch.socialize.Repositoty.UserRepository;
import com.socialSearch.socialize.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocializeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SocializeApplication.class, args);
		System.out.println("well done");
	}

}
