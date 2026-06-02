/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.DAOPersona;
import Modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOPersonaImpl extends ConexionBD implements DAOPersona {
    
    @Override
    public void registrar(Persona per) throws Exception {
      try{
          this.conectar();
          PreparedStatement ps = this.conexion.prepareStatement("INSERT INTO Alumnos (codigo, nombre, sexo, apellido, carrera)VALUES(?, ?, ?, ?, ?)");
          ps.setString(1, per.getNombre());
          ps.setString(1, per.getApellido());
          ps.setString(1, per.getSexo());
          ps.setString(1, per.getCarrera());
          ps.executeUpdate();
      }
      catch (Exception e){
          throw e;
      }
      finally{
          this.cerrar();
      }
      
    }
    @Override
    public void modificar(Persona per) throws Exception {
        try{
          this.conectar();
          PreparedStatement ps = this.conexion.prepareStatement("UPDATE Alumno set nombre=? where id=?");
          ps.setString(1, per.getNombre());
          ps.setString(2, per.getId());
            ps.executeUpdate();
       }
      catch (Exception e){
          throw e;
      }
      finally{
          this.cerrar();
      }
    }
    
    public void eliminar(Persona per) throws Exception {
        try{
          this.conectar();
          PreparedStatement ps = this.conexion.prepareStatement("DELETE from Alumno where id=?");
          ps.setString(1, per.getId());
          ps.executeUpdate();
       }
      catch (Exception e){
          throw e;
      }
      finally{
          this.cerrar();
      }
    }
    
    public List<Persona> listar() throws Exception {
       List <Persona> lista =null;
        try{
          this.conectar();
          PreparedStatement ps = this.conexion.prepareStatement("select * from Alumno");
          lista=new ArrayList();
          ResultSet rs = ps.executeQuery();
          while (rs.next()){
              Persona per = new Persona ();
              per.setId(rs.getString("id"));
              per.setNombre(rs.getString("nombre"));
              per.setApellido(rs.getString("apellido"));
              per.setSexo(rs.getString("sexo"));
              per.setCarrera(rs.getString("carrera"));
              lista.add(per);
            }
          rs.close();
          ps.close();
           
          
      }
      catch (Exception e){
          throw e;
      }
      finally{
          this.cerrar();
      }
        return lista;
    }
    
    
    
}
