/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD.DAO;

import BD.*;
import java.sql.PreparedStatement;
import Controladores.Especialidade;
import java.sql.*;

public class EspecialidadeDAO extends Especialidade{

  public boolean cadasratrEspecialidade(Especialidade especialidade) throws ClassNotFoundException, SQLException{
            String sql = "INSERT INTO ESPECIALIDADE (NOME, DESCRICAO) VALUES (?,?)";
            Connection conn = Conexao.getConexao();
            
            try(PreparedStatement obj = conn.prepareStatement(sql) ) {
                
                obj.setString(1, getNome());
                obj.setString(2, getDescricao());
                
                obj.executeUpdate();
                obj.close();
                return true;
            } catch (SQLException ex) {
                System.out.println("Erro ao escrever na BD: "+ex);
                return false;
            }
            
    }
  
      

  
    public boolean actualizarEspecialidade(Especialidade especialidade) throws SQLException, ClassNotFoundException {
        Connection conn = Conexao.getConexao();
        String sql = "UPDATE ESPECIALIDADE SET NOME = ?, DESCRICAO=? WHERE ID_ESPECIALIDADE = ?";
        
        try (PreparedStatement obj = conn.prepareStatement(sql)){
            obj.setString(1, getNome());
                obj.setString(2, getDescricao());
                obj.setInt(3, getCodigo());
                obj.executeUpdate();
                obj.close();
                return true;
        } catch (Exception e) {
            System.out.println("Erro ao actualizar na BD: "+e);
        }
             return false;
         }
 
     }

