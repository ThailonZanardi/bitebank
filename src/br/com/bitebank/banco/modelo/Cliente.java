package br.com.bitebank.banco.modelo;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente() {
    }

    public String getNome() {
        return this.nome;
        // variavel que chama o nome do cliente
    }

    public void setNome(String nome) {
        this.nome = nome;
        // variavel que adiciona o nome do cliente
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        // variavel que adiciona o cpf do cliente
    }

    public String getProfissao() {
        return this.profissao;

    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
        // variavel que adiciona a profissão do cliente
    }
}
