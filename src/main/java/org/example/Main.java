package org.example;

import org.example.entities.Celular;
import org.example.entities.Cliente;
import org.example.entities.Venda;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular(16, "Apple", "Iphone 16 Pro Max", 4800.00f, 3 );
        Cliente cliente1 = new Cliente(1, "Eduardo", "011.011.011-00", "75 99001-0101");
        Venda venda1 = new Venda(1, cliente1, celular1, 4600.00f, LocalDate.now());

        celular1.status();
        cliente1.status();
        venda1.status();
    }
}