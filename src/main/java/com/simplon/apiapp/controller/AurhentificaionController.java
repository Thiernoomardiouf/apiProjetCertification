package com.simplon.apiapp.controller;

import com.simplon.apiapp.config.JwtUtil;
import com.simplon.apiapp.model.JwtRequest;
import com.simplon.apiapp.model.JwtResponse;
import com.simplon.apiapp.model.Membre;
import com.simplon.apiapp.service.MembreDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "*")
public class AurhentificaionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MembreDetailsService membreDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/gererate-token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        try {
            authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
        } catch (UsernameNotFoundException e) {
            e.printStackTrace();
            throw new Exception("User is not found");
        }
        /// Authenticate the user and get the user details.
        UserDetails userDetails = this.membreDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

    // return the user details from the user
    @GetMapping("/current-user")
    public Membre getCurrentUser(Principal principal) {
        return ((Membre) this.membreDetailsService.loadUserByUsername(principal.getName()));
    }

}
