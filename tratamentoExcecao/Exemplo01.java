public class Exemplo01 {
    public static void main(String[] args) {
        double dividendo = Double.parseDouble("10");
        double divisor = Double.parseDouble("3");

        try {
            divide(dividendo, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Não pode dividir por zero!");
        }
    }

    public static void divide(double dividendo, double divisor) {
        System.out.println("Divisão = " + (dividendo / divisor));
    }
}