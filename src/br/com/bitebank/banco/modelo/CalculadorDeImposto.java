package br.com.bitebank.banco.modelo;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class CalculadorDeImposto {
    private double totalImposto;

    public CalculadorDeImposto() {
    }

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
