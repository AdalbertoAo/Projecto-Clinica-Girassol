/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD.DAO;

import BD.Conexao;
import Controladores.Funcionario;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author HP
 */
public class FuncionarioDAO extends Funcionario{
//Metodos da classe

 public boolean cadastrarPessoa(String bilhete, String telefone, String endereco, String sexo, LocalDate data_nascimento){
    setNum_bilhete(bilhete);
    setTelefone(telefone);
    setEndereco(endereco);
    setSexo(sexo);
    setData_nascimento(data_nascimento);
return true;
}
    public boolean cadastrarFuncionario(int codigo, String nome, String cargo, BigDecimal salario, LocalDate dataContratacao) throws ClassNotFoundException{
 
 String sql = "INSERT INTO FUNCIONARIO (NOME, NUMERO_BILHETE, DATA_NASCIMENTO, SEXO, TELEFONE, ENDERECO,CARGO,SALARIO, DATA_CONTRATACAO) VALUES (?,?,?,?,?,?,?,?,?)";
 PreparedStatement obj;
 LocalDate teste = LocalDate.now();
        setData_nascimento(teste);
            // COnvertendo de localdate para date, que e um tipo de dados que o SQL aceita de boa
            java.sql.Date D_cont = java.sql.Date.valueOf(dataContratacao);
            java.sql.Date D_nasc = java.sql.Date.valueOf(getData_nascimento());
            
 
            try {
                Connection conn = Conexao.getConexao();
                obj = conn.prepareStatement(sql);
                obj.setString(1,nome);
                obj.setString(2, getNum_bilhete());
                obj.setDate(3, D_nasc);
                obj.setString(4, "M");
                obj.setString(5, getTelefone());
                obj.setString(6, getEndereco());
                obj.setString(7, cargo);
               obj.setBigDecimal(8, salario);
               obj.setDate(9, D_cont);
                obj.executeUpdate();
                obj.close();
                return true;
            } catch (SQLException ex) {
                System.out.println("erro ao escrever na BD: "+ex);
                return false;
            }

    }
    public boolean deletarFuncionario(Funcionario funcionario){
        return true;
    }
    public boolean actualizarFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException{
         Connection conn = Conexao.getConexao();
        String sql = "UPDATE FUNCIONARIO SET NOME=?, NUMERO_BILHETE=?, DATA_NASCIMENTO=?, SEXO=?, TELEFONE=?, ENDERECO=?,CARGO=?,SALARIO=?, DATA_CONTRATACAO=? WHERE ID_FUNCIONARIO = ?";
         // COnvertendo de localdate para date, que e um tipo de dados que o SQL aceita de boa
            java.sql.Date D_cont = java.sql.Date.valueOf(getData_contratacao());
            java.sql.Date D_nasc = java.sql.Date.valueOf(getData_nascimento());
        try (PreparedStatement obj = conn.prepareStatement(sql)){
            obj.setString(1,getNome());
                obj.setString(2, getNum_bilhete());
                obj.setDate(3, D_nasc);
                obj.setString(4, getSexo());
                obj.setString(5, getTelefone());
                obj.setString(6, getEndereco());
                obj.setString(7, getCargo());
               obj.setBigDecimal(8, getSalario());
               obj.setDate(9, D_cont);
               obj.setInt(10, getId_funcionario());
                obj.executeUpdate();
                obj.close();
                return true;
        } catch (Exception e) {
             System.out.println("Erro ao actualizar na BD: "+e);
        }
        return false;
    }

}
