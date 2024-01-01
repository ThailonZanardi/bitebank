package br.com.bitebank.banco.teste;

import br.com.bitebank.banco.modelo.CalculadorDeImposto;
import br.com.bitebank.banco.modelo.ContaCorrente;
import br.com.bitebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
    public TesteTributaveis() {
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);  // criação de conta (objeto)
        cc.deposita(100.0);
        SeguroDeVida seguro = new SeguroDeVida(); // criando seguro de vida
        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);
        System.out.println(calc.getTotalImposto());
    }
}
