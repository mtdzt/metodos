public class Sobrecarga {
    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }
    public static void area(double lado1, double lado2) {
        System.out.println("Area do retangulo: " + lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area do trapezio: " + ((baseMaior+baseMenor)*altura)/ 2);
    }
    public static void main(String[] args) {
        Sobrecarga.area(5);
        Sobrecarga.area(2, 4);
        Sobrecarga.area(3, 4,5 );
    }
}
