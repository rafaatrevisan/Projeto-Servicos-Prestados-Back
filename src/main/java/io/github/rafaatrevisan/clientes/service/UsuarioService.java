package io.github.rafaatrevisan.clientes.service;

import io.github.rafaatrevisan.clientes.exception.UsuarioCadastradoException;
import io.github.rafaatrevisan.clientes.model.entity.Usuario;
import io.github.rafaatrevisan.clientes.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario){
        boolean exists = repository.existsByEmail(usuario.getEmail());
        if(exists){
            throw new UsuarioCadastradoException();
        }
        return repository.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository
                .findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Login não encontrado"));

        return User
                .builder()
                .username(usuario.getEmail())
                .password(usuario.getSenha())
                .roles("USER")
                .build();
    }
}
