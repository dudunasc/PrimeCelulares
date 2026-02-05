package org.example.entities;

import java.time.LocalDate;

public class Venda {
    private int id;
    private Cliente cliente;
    private Celular celular;
    private double valorCompra;
    private LocalDate dataVenda;

    public Venda(int id, Cliente cliente, Celular celular, double valorCompra, LocalDate dataVenda) {
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

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

}
