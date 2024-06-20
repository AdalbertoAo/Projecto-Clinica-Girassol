/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD.DAO;

import BD.*;
import Controladores.Especialidade;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class EspecialidadeDAO extends Conexao {
    
    public boolean cadastrarEspecialidade(Especialidade especialidade) throws SQLException, ClassNotFoundException{
        Connection conn = (Connection) Conexao.getConexao();

       
  String sql = "INSERT INTO ESPECIALIDADE (NOME, DESCRICAO) VALUES (?,?)";
         PreparedStatement obj = null;
            try  {
                obj = conn.preparedStatement(sql);
                obj.setString(1, especialidade.getNome());
                obj.setString(2, especialidade.getDescricao());
                obj.execute();
                obj.close();
            
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
                return false;
            }
             
         }
    public boolean actualizarEspecialidade(Especialidade especialidade) {
 
             return true;
         }
    public boolean deletarEspecialidade(Especialidade especialidade) {
 
             return true;
         }
 
     }

