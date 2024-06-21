/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import BD.Conexao;
import BD.DAO.EspecialidadeDAO;
import BD.DAO.FuncionarioDAO;
import Controladores.Especialidade;
import Controladores.Funcionario;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
public class teste {
    public static void main (String[] args)throws SQLException, ClassNotFoundException{
        Connection con = Conexao.getConexao(); 
         EspecialidadeDAO e = new EspecialidadeDAO();
         FuncionarioDAO f = new FuncionarioDAO();
         System.out.println("Conexao: "+ con);
         double salario = 110200;
/*
        //Teste de INSERT DE ESPECIALIDADE
        
       
           //teste de insert
       EspecialidadeDAO e = new EspecialidadeDAO();
      
       System.out.println("Conexao: "+ con);
       e.setNome("Adalberto");
       e.setDescricao("Trata do paludismo");
       
        System.out.println("Voce escreveu: Nome: "+ e.getNome()+ " \n Descricao: "+ e.getDescricao());
        
       if (e.cadasratrEspecialidade(e)) {
           System.out.println("Cadastrou");
       }else System.out.println("Deu pau");
         
         //teste de UPDATE EM ESPECIALIDADE
        
      e.setCodigo(3);
      e.setNome("Cardiologista");
      e.setDescricao("Cuida do coracao e mede seus batimentos");
      boolean verificar = e.actualizarEspecialidade(e);
      if (verificarAE){
          System.out.println("Actualizou");
      }else System.out.println("Deu pau");
         
         */
/*
//Teste de INSERT DE FUNCIONARIO
FuncionarioDAO f = new FuncionarioDAO();

System.out.println("Conexao: "+ con);
f.setData_contratacao(LocalDate.of(2024, 05, 10));
boolean verificarP=f.cadastrarPessoa("021014245BA054", "933342119", "Benfica", "M", LocalDate.of(2005, 05, 29));
boolean verificarF = f.cadastrarFuncionario(1, "ADAM SILVA", "DELEGADO DE LIMPESA", new BigDecimal(salario), LocalDate.of(2003, 05, 29));
if (verificarP && verificarP){
    System.out.println("Cadastrou");
}else System.out.println("Deu pau");
*/

f.setId_funcionario(1);
f.setNome("Jean Mixinge");
f.setNum_bilhete("034323434bg650");
f.setData_nascimento(LocalDate.of(2003, 05, 12));
f.setEndereco("kk 5000");
f.setSexo("M");
f.setTelefone("923123243");
f.setCargo("Engenheiro Informatico");
f.setSalario(new BigDecimal(salario));
f.setData_contratacao(LocalDate.of(2021, 07, 9));

boolean verificarAF = f.actualizarFuncionario(f);
if (verificarAF){
    System.out.println("Actualizou");
            
}else System.out.println("Deu pau");
    }   
}
