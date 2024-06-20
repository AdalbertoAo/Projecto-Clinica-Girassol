/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD.DAO;

import Controladores.Funcionario;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class FuncionarioDAO extends Funcionario{
     //Metodos da classe

public boolean cadastrarPessoa(String bilhete, String telefone, String endereco, char sexo, LocalDate data_nascimento){
    setNum_bilhete(bilhete);
    setTelefone(telefone);
    setEndereco(endereco);
    setSexo(sexo);
    setData_nascimento(data_nascimento);


    return true;
}

    public boolean cadastrarFuncionario(int codigo, String nome, String cargo, BigDecimal salario, LocalDate dataContratacao){
        
        setId_funcionario(codigo);
        setNome(nome);
        setSalario (salario) ;
        setData_contratacao (dataContratacao);

        return true;
    }
    public boolean deletarFuncionario(Funcionario funcionario){
        return true;
    }
    public boolean actualizarFuncionario(Funcionario funcionario){
        return true;
    }

}
