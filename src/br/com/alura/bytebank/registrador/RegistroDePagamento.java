package br.com.alura.bytebank.registrador;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.model.Tipo;

import java.util.ArrayList;
import java.util.List;


/*

Aprendendo "REFATORAÇÃO": https://cursos.alura.com.br/course/intellij-idea-truques-para-aumentar-sua-produtividade-em-projetos-java/task/28761
MÓDULO 2: Navegando e regatorando o código

 */

public class RegistroDePagamento {

    private final static List<Pagamento> pagamentos = new ArrayList<>();

    public void registra(List<Pagamento> pagamentos) {
        for (int i = 0; i < pagamentos.size(); i++) {
            Pagamento pagamento = pagamentos.get(i);
            verificaTipo(pagamento);
        }
        exibeEfetuados();
    }

    private static void exibeEfetuados() {
        if (!RegistroDePagamento.pagamentos.isEmpty()) {
            System.out.println("Todos os pagamentos");
            for (int i = 0; i < RegistroDePagamento.pagamentos.size(); i++) {
                System.out.println(RegistroDePagamento.pagamentos.get(i));
            }
        } else {
            System.out.println("Não temos pagamentos");
        }
    }

    private static void verificaTipo(Pagamento pagamento) {
        if (pagamento.getTipo().equals(Tipo.CREDITO)) {
            pagamento.setValor(pagamento.getValor() * 1.02);
            RegistroDePagamento.pagamentos.add(pagamento);
            System.out.println("Pagamento realizado " + pagamento);
        }
        if (pagamento.getTipo().equals(Tipo.DEBITO)) {
            pagamento.setValor(pagamento.getValor() * 1.001);
            RegistroDePagamento.pagamentos.add(pagamento);
            System.out.println("Pagamento realizado " + pagamento);
        }
        salva(pagamento);
        }

    private static void salva(Pagamento pagamento) {
        RegistroDePagamento.pagamentos.add(pagamento);
        System.out.println("Pagamento realizado " + pagamento);
    }

}
