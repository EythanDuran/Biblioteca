package edu.uaslp.library;
import java.awt.*;
import javax.swing.*;

import edu.uaslp.library.model.Empleado;
import edu.uaslp.library.model.Libro;
import edu.uaslp.library.model.Prestamo;
import edu.uaslp.library.model.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
     public static void main(String[] args) {  //metodo instancia y metodo de clase(static)
          SwingUtilities.invokeLater(() -> new AppWindow().show());
          /*Empleado empleado =new Empleado();

          empleado.setName("Juan");
          empleado.setClave("1234");

          Libro HarryPotter=new Libro();

          HarryPotter.setAuthor("");
          HarryPotter.setEditorial("");
          HarryPotter.setIsbn("");
          HarryPotter.setTitle("Harry Potter 1");

          Libro Harrypotter2=new Libro();
          Harrypotter2.setTitle("harryPotter2");

          Libro Harrypotter3=new Libro();
          Harrypotter3.setTitle("harryPotter3");

          Usuario usuario=new Usuario();

          usuario.setClave("23123");
          usuario.setName("Pablo");
          usuario.setAddress("direccion");
          usuario.setRegisterDate(LocalDate.now().minusWeeks(5));

          Prestamo prestamo=new Prestamo();

          prestamo.setFechahora(LocalDateTime.now()); //composicion porque no conoce ciertos datos
          prestamo.setUsuario(usuario);
          prestamo.setEmpleado(empleado);

          Libro[] libros=new Libro[5];

          libros[0]=HarryPotter;
          libros[1]=Harrypotter2;
          libros[2]=Harrypotter3;

          prestamo.setLibros(libros);

          imprimePrestamo(prestamo);

     }
     public static void imprimePrestamo(Prestamo prestamo){
       System.out.println("Prestamo de "+prestamo.getFechahora());
       System.out.println("Usuario: "+prestamo.getUsuario().getName());
       System.out.println("Empleado: "+prestamo.getEmpleado().getName());
       System.out.println("Libros: " );

       Libro[] books=prestamo.getLibros();
       for(Libro libro:books){ //por cada libro en books
            if (libro!=null) {
                 System.out.println(libro.getTitle());
            }else {
                 System.out.println("hay espacio");
            }
       }
     }*/
     }
}