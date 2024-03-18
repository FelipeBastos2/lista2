import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o preço do etanol: ");
        double precoEtanol = scanner.nextDouble();

        System.out.print("Insira o preço da gasolina: ");
        double precoGasolina = scanner.nextDouble();
        double custoEtanol = precoEtanol / precoGasolina;

        if (custoEtanol < 0.7) {
            System.out.println("É melhor abastecer com etanol.");
        } else {
            System.out.println("É melhor abastecerr com gasolina.");
        }

        scanner.close();
    }
}