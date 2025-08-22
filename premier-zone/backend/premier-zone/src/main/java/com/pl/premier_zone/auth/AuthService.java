package com.pl.premier_zone.auth;

import com.pl.premier_zone.auth.dto.LoginRequest;
import com.pl.premier_zone.auth.dto.SignupRequest;
import com.pl.premier_zone.auth.services.UserDetailsImpl;
import com.pl.premier_zone.config.JwtUtils;
import com.pl.premier_zone.models.User;
import com.pl.premier_zone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtils jwtUtils;

    /**
     * Authenticates a user and returns a JWT token.
     */
    public String authenticateUser(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        return jwtUtils.generateJwtToken(authentication);
    }

    /**
     * Registers a new user in the database.
     */
    public String registerUser(SignupRequest signupRequest) {
        if (userRepository.existsByUsername(signupRequest.getUsername())) {
            return "Error: Username is already taken!";
        }

        if (userRepository.existsByEmail(signupRequest.getEmail())) {
            return "Error: Email is already in use!";
        }

        // Create new user
        User user = new User();
        user.setUsername(signupRequest.getUsername());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));

        userRepository.save(user);

        return "User registered successfully!";
    }

    /**
     * Returns UserDetailsImpl by username (optional helper).
     */
    public Optional<UserDetailsImpl> getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .map(UserDetailsImpl::build);
    }
}
