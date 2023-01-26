import java.util.Scanner;

/**
 * App
 */
public class Calculadora {






    

    public static void soma (double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " com " + numero2 + " é de: " + resultado);
    }
    public static void substracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A substração de " + numero1 + " menos " + numero2 + " é de: " + resultado);
    }
    public static void multiplicacao (double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " por " + numero2 + " é de: " + resultado);
    }

    public static void divisao (double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é de: " + resultado);
    }



public static void main(String[] args) {
    //calculadora
    System.out.println("Exercicio calculadora ");
    Calculadora.soma(2, 5);
    Calculadora.substracao(10, 3);
    Calculadora.multiplicacao(4, 3);
    Calculadora.divisao(120, 4);
}




}