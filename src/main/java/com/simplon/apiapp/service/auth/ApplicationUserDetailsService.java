package com.simplon.apiapp.exceptions.service.auth;

import com.simplon.apiapp.model.Membre;
import com.simplon.apiapp.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class ApplicationUserDetailsService  { // implements UserDetailsService

//    @Autowired
//    private MembreRepository repository;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Optional<Membre> membre = repository.findByEmail(email);
//        try{
//            throw new ArrayIndexOutOfBoundsException();
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception caught value is "+ membre);
//        }
//        return new User(membre.get().getEmail(), membre.get().getMot_de_passe(), Collections.emptyList());
//    }
}
