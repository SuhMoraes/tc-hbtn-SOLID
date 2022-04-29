package model;

import exception.ContaLimiteException;

public class Conta {

    private Integer id;
    private String nome;
    private Double saldo;
    private Double limite;

    public Conta(Integer id, String nome, Double saldo, Double limite) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public String deposita(double valor) {
        if(valor > this.limite){
            throw new ContaLimiteException("Valor de deposito acima do limite permitido.");
        }
        this.saldo += valor;
        return String.format("Depósito de %s efetuado com sucesso", valor);
    }

    public String saque(double valor) {
        if(valor > this.limite){
            throw new ContaLimiteException("Valor de saque acima do limite permitido.");
        }
        this.saldo -= valor;
        return String.format("Saque de %s efetuado com sucesso", valor);
    }
}
