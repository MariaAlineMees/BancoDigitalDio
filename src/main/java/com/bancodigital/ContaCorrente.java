package com.bancodigital;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }
}