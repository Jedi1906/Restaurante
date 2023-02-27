package com.integradora.tsm3.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "usuario")
public class Usuario {
    @Id
    @Column(name="id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name = "correo", unique = true)
    private String correo;
    @Column(name="telefono")
    private String telefono;
    @Column(name="contrasena")
    private String contrasena;
    @Column(name="token")
    private String token;
    @Column(name="fecha_registro")
    private Date fecha_registro;
    @Column (name = "fecha_edicion")
    private Date fecha_edicion;
    @Column(name="estado")
    private String estado;
    @Column(name="nocifrado")
    private String nocifrado;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
    private List<Rol> rolList;


    public Usuario() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Date getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(Date fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }

    public String getNocifrado() {
        return nocifrado;
    }

    public void setNocifrado(String nocifrado) {
        this.nocifrado = nocifrado;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = String.valueOf(estado);
    }

    public List<Rol> getRolList() {
        return rolList;
    }

    public void setRolList(List<Rol> rolList) {
        this.rolList = rolList;
    }

    public Long getIdusuario() {
        return id_usuario;
    }

    public void setIdusuario(Long idusuario) {
        this.id_usuario = idusuario;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
