package net.zerhouani.hospitalspringmvc;

import net.zerhouani.hospitalspringmvc.entities.Patient;
import net.zerhouani.hospitalspringmvc.repository.PatientRepository;
import net.zerhouani.hospitalspringmvc.security.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalSpringMvcApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalSpringMvcApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        // 3 Methods to do it
        // 3rd one is :
            //Patient patient1= Patient.builder()
            //       .nom("Imane")
            //       .dateNaissance(new Date())
            //       .score(56)
            //      .build();

       // patientRepository.save(new Patient(null,"Mohamed", new Date(), false, 134));
        //patientRepository.save(new Patient(null,"Hanane", new Date(), false, 4321));
        //patientRepository.save(new Patient(null,"Imane", new Date(), true, 134));
    }

    @Bean
    CommandLineRunner commandLineRunner(AccountService accountService) {
        return args -> {
            accountService.addNewRole(1L,"USER");
            accountService.addNewRole(2L,"ADMIN");
            accountService.addNewUser("user1","123","user1@gmail.com","123");
            accountService.addNewUser("user1","123","user1@gmail.com","123");
            accountService.addNewUser("user1","123","user1@gmail.com","123");

            accountService.addRoleToUser("user1",1L);
            accountService.addRoleToUser("user2",1L);
            accountService.addRoleToUser("admin",1L);
            accountService.addRoleToUser("admin",2L);

        };
    }
}
