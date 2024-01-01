package br.com.bitebank.banco.teste;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import br.com.bitebank.banco.modelo.Conta;
import br.com.bitebank.banco.modelo.ContaCorrente;
import br.com.bitebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
    public TesteSaca() {
    }

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch (SaldoInsuficienteException var3) {
            System.out.println("Ex: " + var3.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
