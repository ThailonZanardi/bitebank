package br.com.bitebank.banco.teste;

import br.com.bitebank.banco.modelo.Cliente;

public class testeCliente {
    public static void main(String[] args){
        Cliente j = new Cliente(); // criando cliente j
        j.setNome("Jose"); // nomeando cliente j
        j.setCpf("123.456.789.01");
        j.setProfissao("bancario");

        System.out.println("Ciente: " + j.getNome() +"\n" + "CPF Nº: " + j.getCpf() + "\n" + "Profissão: " + j.getProfissao() );


    }
}
