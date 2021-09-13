package edu.uaslp.library.model;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Prestamo {
    private LocalDateTime fechahora;
    private Usuario usuario;
    private LinkedList<Libro> libros=new LinkedList<>();
    private Empleado empleado;

    public void setFechahora(LocalDateTime fechahora) {

        this.fechahora = fechahora;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void addLibros(Libro libro) {
        libros.add(libro);
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDateTime getFechahora() {
        return fechahora;
    }

    public LinkedList<Libro> getLibros(){
     return libros;
    }


    public Empleado getEmpleado() {
        return empleado;
    }
}
