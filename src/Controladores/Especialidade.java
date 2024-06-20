/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author HP
 */
public class Especialidade {
    private int id_Especialidade;
     private String nome, descricao;

   
   
 
     public int getCodigo() {
         return id_Especialidade;
     }
 
     public void setCodigo(int codigo) {
         this.id_Especialidade = codigo;
     }
 
     public String getNome() {
         return this.nome;
     }
 
     public void setNome(String nome) {
         this.nome = nome;
     }
 
     public String getDescricao() {
         return this.descricao;
     }
 
     public void setDescricao(String descricao) {
         this.descricao = descricao;
     }
 

    
    
}
