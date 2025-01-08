package scr.exercicio2;

public class Subtracao implements Operacao {
    public int calcular(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public boolean suporta(String operacao) {
        return "subtracao".equalsIgnoreCase(operacao);
    }
}
