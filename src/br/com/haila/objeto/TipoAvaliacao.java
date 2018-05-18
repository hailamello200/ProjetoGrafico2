/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.haila.objeto;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
  
    PROVA ("Avaliação Individual"), 
    TRABALHO ("Trabalho"), 
    SEMINARIO("Seminário");
    
    
    private String nome;   

    public String getNome() {
        return nome;
    }
      
    private TipoAvaliacao(String nome){
        
    }
}
