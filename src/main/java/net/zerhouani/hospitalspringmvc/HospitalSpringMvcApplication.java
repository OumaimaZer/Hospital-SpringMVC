package net.zerhouani.hospitalspringmvc;

import net.zerhouani.hospitalspringmvc.entities.Patient;
import net.zerhouani.hospitalspringmvc.repository.PatientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

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

        patientRepository.save(new Patient(null,"Mohamed", new Date(), false, 34));
        patientRepository.save(new Patient(null,"Hanane", new Date(), false, 4321));
        patientRepository.save(new Patient(null,"Imane", new Date(), true, 34));
    }
}
