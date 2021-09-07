package edu.uaslp.library.service;
import edu.uaslp.library.model.Usuario;

import java.util.HashMap;

public class AdministradorDeUsuario {

    private HashMap<String, Usuario> usuarios = new HashMap<>();


    private  Usuario creaUsuario(String clave, String nombre){
        Usuario usuario=new Usuario();

        usuario.setClave(clave);
        usuario.setName(nombre);

        return usuario;
    }

    public AdministradorDeUsuario(){
        usuarios.put("1234",creaUsuario("1234","Raul"));
        usuarios.put("3333",creaUsuario("3333","Ricardo"));
        usuarios.put("12435",creaUsuario("12435","Mario"));
        usuarios.put("4565",creaUsuario("4565","Alberto"));
        usuarios.put("5445",creaUsuario("5445","Manuel"));
        usuarios.put("0987",creaUsuario("0987","Americo"));
    }

    public Usuario dameUsuarioxClave(String clave){
        return usuarios.get(clave);
    }
}
