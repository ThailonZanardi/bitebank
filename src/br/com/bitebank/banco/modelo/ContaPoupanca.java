package br.com.bitebank.banco.modelo;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import br.com.bitebank.banco.modelo.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    public void deposita(double valor) {
        super.saldo += valor;
    }
}
