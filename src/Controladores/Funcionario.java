/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Funcionario {
     // Atributos de um Funcionario
   private int id_funcionario;
    private String nome, num_bilhete, telefone, sexo;
    private LocalDate data_nascimento, data_contratacao;
   private String endereco, cargo;
    private BigDecimal salario;
private String senha;

    // Metodos geters e seters
public String  getSenha(){
return senha;
}

public void setSenha(String senha){
this.senha = senha;
}
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId_funcionario() {
        return id_funcionario;
    }
    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public String getNum_bilhete() {
        return num_bilhete;
    }
    public void setNum_bilhete(String num_bilhete) {
        this.num_bilhete = num_bilhete;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public LocalDate getData_contratacao() {
        return data_contratacao;
    }
    public void setData_contratacao(LocalDate data_contratacao) {
        this.data_contratacao = data_contratacao;
    }
    public LocalDate getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }


}
