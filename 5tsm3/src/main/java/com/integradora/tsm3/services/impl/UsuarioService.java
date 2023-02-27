package com.integradora.tsm3.services.impl;

import com.integradora.tsm3.models.Usuario;

import java.util.Date;
import java.util.List;

public interface UsuarioService {
    Usuario nuevo (Usuario usuario);
    Usuario findByCorreo(String correo);
    void UpdateUsuario(Long id_usuario, String nombre, String apellido, String correo, String telefono, String contrasena, String token, Date date, boolean estado, String nocifrado);
    void updatePassword(Long id, String contrasena);
    void deleteByid(Long id_usuario);
    List<Usuario> getActive();
    List<Usuario> getEmpleado();
    void actualizarStatus(Long id_usuario, boolean estado);
    List<Usuario> getByRol(Long idRol, long idRolAdmin);
    void updateRol(Long id , Long idRol);
    void updateGestor(Long id, String nombre,String correo, boolean estado );

}
