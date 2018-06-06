/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author FranNBK
 */
public class ListaUsuario implements Serializable{
    private ArrayList <Usuario> listaUsuarios;

    public ListaUsuario() {
        listaUsuarios=new ArrayList();
        listaUsuarios.add(new Usuario("admin","admin"));
        listaUsuarios.add(new Usuario("nuevo","nuevo"));
    }
    
    public Usuario validarUsuario(String usuario,String contraseña){
        Usuario valido=null;
        for(Usuario u:listaUsuarios){
            if(u.getUsario().equals(usuario)&&u.getContraseña().equals(contraseña)){
                valido=u;
                break;
            }
        }
        return valido;
    }

    public ListaUsuario(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    /**
     * @return the listaUsuarios
     */
    public ArrayList <Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(ArrayList <Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
}
