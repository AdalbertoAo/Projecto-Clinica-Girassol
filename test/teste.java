/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import BD.Conexao;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
public class teste {
    public static void main (String[] args)throws SQLException, ClassNotFoundException{
      Conexao c = new Conexao();
      c.getConexao();

            System.out.println(c);
       
        
        
        
    }
   
    
}
