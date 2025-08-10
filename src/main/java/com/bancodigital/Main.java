package com.bancodigital;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Digital Dio");

        Cliente aline = new Cliente();
        aline.setNome("Aline");
        aline.setCpf("123.456.789-00");

        Conta cc = new ContaCorrente(1, aline);
        Conta cp = new ContaPoupanca(2, aline);

        cc.depositar(1000);
        cc.transferir(300, cp);

        banco.adicionarCliente(aline);
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        banco.listarContas();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}