package net.zerhouani.hospitalspringmvc.security.repo;

import net.zerhouani.hospitalspringmvc.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
