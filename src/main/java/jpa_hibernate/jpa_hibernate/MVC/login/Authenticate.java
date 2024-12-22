package jpa_hibernate.jpa_hibernate.MVC.login;

import org.springframework.stereotype.Service;

@Service
public class Authenticate {
    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("123");
        boolean isValidPassword = password.equalsIgnoreCase("123");
        return  isValidPassword && isValidUsername;
    }
}
