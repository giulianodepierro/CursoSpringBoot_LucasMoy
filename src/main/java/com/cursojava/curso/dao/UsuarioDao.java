package com.cursojava.curso.dao;

import com.cursojava.curso.modelos.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void  registrar(Usuario usuario);
  Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
