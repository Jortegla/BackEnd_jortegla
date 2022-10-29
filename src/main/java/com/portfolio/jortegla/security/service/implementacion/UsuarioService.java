 
package com.portfolio.jortegla.security.service.implementacion;

import com.portfolio.jortegla.security.model.Usuario;
import com.portfolio.jortegla.security.model.UsuarioRol;
import com.portfolio.jortegla.security.repository.RolRepo;
import com.portfolio.jortegla.security.repository.UsuarioRepo;
import com.portfolio.jortegla.security.service.IUsuarioService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
     private UsuarioRepo usuarioRepo;
    
    @Autowired
    private RolRepo rolRepo;
    
    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepo.findByUsername(usuario.getUsername());
        if(usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new Exception ("El usuario ya esta presente");
        }
        else {
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepo.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepo.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepo.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
       usuarioRepo.deleteById(usuarioId);
    }
    
}
