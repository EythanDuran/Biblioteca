package edu.uaslp.library.service;

import edu.uaslp.library.model.Libro;

import java.util.HashMap;

public class AdministradorDeLibro {
    private HashMap<String,Libro> libros=new HashMap<>();

    private Libro crearLibro(String isbn,String titulo){
        Libro libro=new Libro();
        libro.setIsbn(isbn);
        libro.setTitle(titulo);
        return libro;
    }

    public AdministradorDeLibro(){
        libros.put("123",crearLibro("123","titulo 1"));
        libros.put("111",crearLibro("111","titulo 2"));
        libros.put("222",crearLibro("222","titulo 3"));
        libros.put("333",crearLibro("333","titulo 4"));
        libros.put("444",crearLibro("444","titulo 5"));
        libros.put("098",crearLibro("098","titulo 6"));
    }

    public Libro dameLibroxClave(String isbn){
        return libros.get(isbn);
    }
}
