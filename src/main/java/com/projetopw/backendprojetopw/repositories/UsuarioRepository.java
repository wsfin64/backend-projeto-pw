package com.projetopw.backendprojetopw.repositories;

import com.projetopw.backendprojetopw.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
