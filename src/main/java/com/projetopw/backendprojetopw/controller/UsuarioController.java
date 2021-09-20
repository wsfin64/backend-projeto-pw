package com.projetopw.backendprojetopw.controller;

import com.projetopw.backendprojetopw.modelos.Usuario;
import com.projetopw.backendprojetopw.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> encontrarUsuario(@PathVariable("id") Long id){
        return ResponseEntity.ok(usuarioService.usuarioPorId(id));
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.salvarUsuario(usuario));
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable("id") Long id){
        usuarioService.deletarUsuario(id);
    }
}
