package net.zerhouani.hospitalspringmvc.security.repo;

import net.zerhouani.hospitalspringmvc.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
}