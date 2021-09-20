package com.projetopw.backendprojetopw.services;

import com.projetopw.backendprojetopw.modelos.Usuario;
import com.projetopw.backendprojetopw.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario usuarioPorId(Long id){
        return usuarioRepository.findById(id).get();
    }

    public void deletarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }


}
