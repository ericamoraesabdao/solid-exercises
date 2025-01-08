package scr.exercicio3;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();

        quadrado.setLado(8);

        retangulo.setAltura(3);
        retangulo.setLargura(5);


        System.out.println("Área do Quadrado: " + quadrado.getArea());
        System.out.println("Área do Retângulo: " + retangulo.getArea());
    }
}
