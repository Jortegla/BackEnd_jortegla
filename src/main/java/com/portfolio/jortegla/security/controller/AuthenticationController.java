
package com.portfolio.jortegla.security.controller;

import com.portfolio.jortegla.security.model.JwtRequest;
import com.portfolio.jortegla.security.model.JwtResponse;
import com.portfolio.jortegla.security.JwtUtil;
import com.portfolio.jortegla.security.model.Usuario;
import com.portfolio.jortegla.security.service.implementacion.UserDetailsServiceImpl;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AuthenticationController {
    
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    
    @Autowired
    private JwtUtil jwtUtils;
    
    
    @PostMapping("/generate-token")
    public ResponseEntity<?> generarToken(@RequestBody JwtRequest jwtRequest) throws Exception{
        try {
             autenticar(jwtRequest.getUsername(),jwtRequest.getPassword());
        }catch (Exception exception){
            exception.printStackTrace();
            throw  new Exception("USUARIO NO ENCONTRADO");
        }
        UserDetails  userDetails = this.userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtils.generateToken(userDetails);
        
        return ResponseEntity.ok(new JwtResponse(token));
    }
    
    private void autenticar(String username, String password) throws Exception{
        try{            
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
       }catch(DisabledException disabledException){  
            throw new Exception("USUARIO DESHABILITADO" + disabledException.getMessage());    
        }catch(BadCredentialsException e){
            throw new Exception("CREDENCIALES  INVALIDAS" + e.getMessage());
        }
        }
    
    @GetMapping("/actual-usuario")
    public Usuario obtenerUsuarioActual(Principal principal){
        return (Usuario) this.userDetailsService.loadUserByUsername(principal.getName());
    }
        
    }
