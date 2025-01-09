package scr.exerciciobonus.conta;

public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double calcularTaxa();
}
