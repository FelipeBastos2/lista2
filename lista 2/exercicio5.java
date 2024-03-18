import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double larguraRet = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area =  larguraRet * altura;
        double perimetro = 2 * ( larguraRet + altura);
        double diagonal = Math.sqrt(Math.pow( larguraRet, 2) + Math.pow(altura, 2));

        System.out.println("\nResultados:");
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
        System.out.println("Diagonal do retângulo: " + diagonal);

        scanner.close();
    }
}