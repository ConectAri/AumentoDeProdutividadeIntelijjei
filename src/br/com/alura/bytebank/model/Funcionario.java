package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {

    //PARA INCLUIR TODAS A PALAVRA "PRIVATE" EM TODAS AS LINHAS O ATALHO É:
    // alt+Shift+insert (seleciona as linhas que deseja incluir a palavra e digita)

   private String nome;
   private int matricula;
   private LocalDate dataNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
