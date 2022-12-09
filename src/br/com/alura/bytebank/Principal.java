package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        System.out.println(" Bem vindo ao Bytebank");

        Funcionario Layse = new Funcionario("Layse", 1, LocalDate.of(1990, 2, 10));
        Funcionario Maria = new Funcionario("Maria", 2, LocalDate.of(1991, 5, 15));

        System.out.println(Layse);
        System.out.println(Maria);



    }
}
