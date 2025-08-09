/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todolist.webtodo;

/**
 *
 * @author AntiComuna
 */
public class Tarefa {
    
    private static long proximoid = 1;
    private long id;
    private String descricao;
    private boolean concluido;
    
    public Tarefa(String descricao){
        this.descricao = descricao;
        this.id = proximoid++;
        this.concluido=false;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    
    public long getId(){
        return id;
    }
    
    public boolean isConcluido(){
        return concluido;
    }
    
    public void setConcluido(boolean concluido){
        this.concluido = concluido;
    }
    
    @Override
    public String toString() {
        return (concluido ? "[X] " : "[ ]") + descricao;
    }
    
}
