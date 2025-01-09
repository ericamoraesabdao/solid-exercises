package scr.exerciciobonus.conta;

import scr.exerciciobonus.cliente.Cliente;

public class Poupanca extends ContaBancaria {
    public Poupanca(Cliente cliente, int numeroConta, int digito, double saldo, TipoConta tipoConta) {
        super(cliente, numeroConta, digito, saldo, TipoConta.valueOf("POUPANCA"));
    }

    @Override
    public double calcularTaxa() {
        return saldo * 0.005;
    }
}
