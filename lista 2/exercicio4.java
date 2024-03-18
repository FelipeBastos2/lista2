import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Digite os valores conhecidos na proporção (A/B = C/D):");
        System.out.print("A: ");
        double a = scanner.nextDouble();
        System.out.print("B: ");
        double b = scanner.nextDouble();
        System.out.print("C: ");
        double c = scanner.nextDouble();

        double d = (c * b) / a;

        System.out.println("O valor desconhecido (D) é: " + d);

        scanner.close();
    }
}