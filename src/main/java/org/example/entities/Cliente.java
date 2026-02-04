package org.example.entities;

public class Cliente {
    private int id;
    private int name;
    private String CPF;
    private String telefone;

    public Cliente(int id, int name, String CPF, String telefone) {
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
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
}
