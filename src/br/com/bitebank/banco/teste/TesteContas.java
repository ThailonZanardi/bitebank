package br.com.bitebank.banco.teste;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import br.com.bitebank.banco.modelo.ContaCorrente;
import br.com.bitebank.banco.modelo.ContaPoupanca;
import br.com.bitebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public TesteContas() {
    }

    public static void main(String[] args) throws SaldoInsuficienteException {
        int a = 3;
        int b = a / 0; // vai dar erro
        ContaCorrente outra = null;
        ((ContaCorrente)outra).deposita(200.0);
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);
        cc.transfere(10.0, cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
