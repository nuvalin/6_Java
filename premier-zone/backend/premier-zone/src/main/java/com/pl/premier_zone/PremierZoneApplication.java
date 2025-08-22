package com.pl.premier_zone;



import com.pl.premier_zone.models.ERole;
import com.pl.premier_zone.models.Role;
import com.pl.premier_zone.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PremierZoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PremierZoneApplication.class, args);
	}


}