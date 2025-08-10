package com.bancodigital;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public String getTipo() {
        return "Conta Poupança";
    }
}