package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Membre;
import com.simplon.apiapp.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MembreDetailsService implements UserDetailsService {

    @Autowired
    private MembreRepository membreRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Membre membre = this.membreRepository.findByUsername(username);
        if (membre == null) {
            System.out.println("Membre not found");
            throw new UsernameNotFoundException("User not found");
        }
        return membre;
    }
}
