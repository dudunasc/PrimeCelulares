package org.example.entities;

public class Cliente {
    private int id;
    private String name;
    private String CPF;
    private String telefone;

    public Cliente(int id, String name, String CPF, String telefone) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return name;
    }

    public void status(){
        System.out.println("Sobre o cliente: ");
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Número de contato: " + this.telefone);
    }
}
