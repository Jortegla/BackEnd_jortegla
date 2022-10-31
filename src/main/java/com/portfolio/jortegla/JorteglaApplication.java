package com.portfolio.jortegla;

import com.portfolio.jortegla.security.model.Rol;
import com.portfolio.jortegla.security.model.Usuario;
import com.portfolio.jortegla.security.model.UsuarioRol;
import com.portfolio.jortegla.security.service.IUsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class JorteglaApplication implements CommandLineRunner {
    
    @Autowired 
    private IUsuarioService iUsuarioService;

	public static void main(String[] args) {
		SpringApplication.run(JorteglaApplication.class, args);
	}
        
        @Bean
        public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                .allowedOrigins("https://frontend-portfolio-ap.web.app")
                .allowedMethods("*")
                .allowedHeaders("*");
            }
        };
    } 

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNombre("Jessica");
        usuario.setApellido("Ortega");
        usuario.setUsername("jessica");
        usuario.setPassword("12345");
        usuario.setEmail("jortegla@gmail.com");
        
        Rol rol = new Rol();
        rol.setRolId(1L);
        rol.setNombre("ADMIN");
        
        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setRol(rol);
        usuarioRol.setUsuario(usuario);
        usuarioRoles.add(usuarioRol);
        
        Usuario usuarioGuardado = iUsuarioService.guardarUsuario(usuario, usuarioRoles);
        System.out.println(usuarioGuardado.getUsername());
    
 }       
        
}
