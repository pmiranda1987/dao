/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DAO;

import Interfaces.DAOPersona;
import Modelo.Persona;


public class DAO {

   
    public static void main(String[] args) {
       Persona per = new Persona ();
       per.setNombre("Percy");
       
       try{
           DAOPersona dao = new DAOPersonaImpl();
           dao.registrar(per);
                    
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    
}
