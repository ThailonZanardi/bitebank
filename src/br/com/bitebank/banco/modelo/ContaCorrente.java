package br.com.bitebank.banco.modelo;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import br.com.bitebank.banco.modelo.Conta;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    public void saca(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    public void deposita(double valor) {
        super.saldo += valor;
    }

    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
