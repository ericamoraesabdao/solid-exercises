package scr.exercicio2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma: " + calculadora.calcular(5, 3, "soma"));
        System.out.println("Subtração: " + calculadora.calcular(5, 3, "subtracao"));
        System.out.println("Multiplicação: " + calculadora.calcular(5, 3, "multiplicacao"));
    }
}
