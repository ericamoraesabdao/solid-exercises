package scr.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private final List<Operacao> operacoes = new ArrayList<>();

    public Calculadora() {
        operacoes.add(new Soma());
        operacoes.add(new Subtracao());
        operacoes.add(new Multiplicacao());
    }

    public int calcular(int numero1, int numero2, String operacao) {
        for (Operacao op : operacoes) {
            if (op.suporta(operacao)) {
                return op.calcular(numero1, numero2);
            }
        }
        throw new UnsupportedOperationException("Operação não suportada: " + operacao);
    }
}





