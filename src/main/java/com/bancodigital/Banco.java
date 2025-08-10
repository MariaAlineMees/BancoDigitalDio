package com.bancodigital;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta.getTipo() + " - Titular: " + conta.getTitular().getNome() + " - Saldo: R$" + conta.getSaldo());
        }
    }
}