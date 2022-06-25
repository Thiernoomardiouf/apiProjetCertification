package com.simplon.apiapp.controller;

import com.simplon.apiapp.auth.AuthentificationResponse;
import com.simplon.apiapp.auth.AuthentionRequest;
import com.simplon.apiapp.service.auth.ApplicationUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import static com.simplon.apiapp.utils.Constants.AUTHENFICATION_ENDPOINT;

@RestController
@RequestMapping(AUTHENFICATION_ENDPOINT)
public class AurhentificaionController {

//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private ApplicationUserDetailsService userDetailsService;
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<AuthentificationResponse> authenticate(@RequestBody AuthentionRequest request){
//       authenticationManager.authenticate(
//               new UsernamePasswordAuthenticationToken(
//                       request.getLogin(),
//                       request.getPassword()
//               )
//       );
//       final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getLogin());
//
//       return ResponseEntity.ok(AuthentificationResponse.builder().accessToken("dummy_access_token").build());
//    }
}
