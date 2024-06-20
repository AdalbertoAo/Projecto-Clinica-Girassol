/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    
    private static final String url = "jdbc:mysql://localhost:3306/clinica_girassol_bd";
    private static final String user = "root";
    private static final String password = "";

    private static Connection conn = null;

    public static Connection getConexao() throws SQLException, ClassNotFoundException{
        try{
           
                conn = DriverManager.getConnection(url, user, password);
                return conn;
           
        
        } catch (SQLException e) {
           System.out.println("erro na conexao com a BD: "+ e);
        } finally{
            if (conn != null){
                conn.close();
            }
        }

        return conn;
    }
    
  


}
