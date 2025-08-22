package com.example;

public class Departamento {
    private int codigo;
    private String nome;

    public Departamento(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setCodigo(int c){
        this.codigo = c;
    }

    public void setNome(String n){
        this.nome = n;
    }
     public String toString(){
        return getCodigo() + " " + getNome()
    }
}
