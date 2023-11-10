package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdatails.UserDetailsService;

public class AppUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepo;

    
}
