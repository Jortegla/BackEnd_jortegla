
package com.portfolio.jortegla.security.service;

import com.portfolio.jortegla.security.model.Usuario;
import com.portfolio.jortegla.security.model.UsuarioRol;
import java.util.Set;


public interface IUsuarioService {
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
    
    public Usuario obtenerUsuario(String username);
    
    public void eliminarUsuario(Long usuarioId);
}
