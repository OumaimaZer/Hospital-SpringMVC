package net.zerhouani.hospitalspringmvc.security.service;

import net.zerhouani.hospitalspringmvc.security.entities.AppRole;
import net.zerhouani.hospitalspringmvc.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username, String password, String email, String confirmPassword);
    AppRole addNewRole(Long roleId ,String role);
    void addRoleToUser(String username, Long roleId);
    void removeRoleFromUser(String username, Long roleId);
    AppUser loadUserByUsername(String username);
}
