package net.zerhouani.hospitalspringmvc.repository;

import net.zerhouani.hospitalspringmvc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
