
package com.portfolio.jortegla.security.controller;

import com.portfolio.jortegla.security.model.Rol;
import com.portfolio.jortegla.security.model.Usuario;
import com.portfolio.jortegla.security.model.UsuarioRol;
import com.portfolio.jortegla.security.service.IUsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "*")
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioService;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @PostMapping("/usuarios/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{
        
        usuario.setPassword(this.bCryptPasswordEncoder.encode(usuario.getPassword()));
        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        
        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setNombre("INVITADO");
        
       UsuarioRol usuarioRol = new UsuarioRol();
       usuarioRol.setUsuario(usuario);
       usuarioRol.setRol(rol);
       
       usuarioRoles.add(usuarioRol);
       return usuarioService.guardarUsuario(usuario, usuarioRoles);
    }
    
    @GetMapping("/usuarios/{username}")
    public Usuario obtenerUsuario(@PathVariable("username")String username){
        return usuarioService.obtenerUsuario(username);
    }
    
    @DeleteMapping("/usuarios/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId")Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);
    }
}
