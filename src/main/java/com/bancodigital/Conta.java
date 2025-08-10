package com.bancodigital;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;
    private List<String> extrato = new ArrayList<>();

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        extrato.add("Depósito: R$" + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            extrato.add("Saque: R$" + valor);
        }
    }

    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
        extrato.add("Transferência: R$" + valor + " para conta " + destino.getNumero());
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta " + numero + ":");
        for (String operacao : extrato) {
            System.out.println(operacao);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public abstract String getTipo();
}