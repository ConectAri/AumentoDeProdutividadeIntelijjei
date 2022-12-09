package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {

    //PARA INCLUIR TODAS A PALAVRA "PRIVATE" EM TODAS AS LINHAS O ATALHO É:
    // alt+Shift+insert (seleciona as linhas que deseja incluir a palavra e digita)

   private String nome;
   private int matricula;
   private LocalDate dataNascimento;

    // PARA CRIAR ESTE CONSTRUTOR O ATALHO É CONTROL+ALT+INSERT
    public Funcionario(String nome, int matricula, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

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

    @Override
    public String toString() {

        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
