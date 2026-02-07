package org.example.entities;

import java.time.LocalDate;

public class Venda {
    private int id;
    private Cliente cliente;
    private Celular celular;
    private float valorCompra;
    private LocalDate dataVenda;

    public Venda(int id, Cliente cliente, Celular celular, float valorCompra, LocalDate dataVenda) {
        this.id = id;
        this.cliente = cliente;
        this.celular = celular;
        this.valorCompra = valorCompra;
        this.dataVenda = dataVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void status(){
        System.out.println("\n-------------------------------\n");
        System.out.println("Compra efetuada!");
        System.out.println("Obrigado " + getCliente() + ", volte sempre!");
        System.out.println("Você adquiriu um " + getCelular());
        System.out.println("Esse foi o valor da sua compra: R$" + getValorCompra());

    }
}
