/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Persona;
import java.util.List;


public interface DAOPersona {
    
    public void registrar (Persona per)throws Exception;
    public void modificar (Persona per)throws Exception;
    public void eliminar (Persona per)throws Exception;
    public List <Persona> listar () throws Exception;
    
}
