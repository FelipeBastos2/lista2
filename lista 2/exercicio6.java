import java.util.Scanner;
import java.lang.Math;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura da área a ser revestida (em metros): ");
        double larguraArea = scanner.nextDouble();
        System.out.print("Digite o comprimento da área a ser revestida (em metros): ");
        double comprimentoArea = scanner.nextDouble();

        System.out.print("Digite a largura da cerâmica escolhida (em centímetros): ");
        double larguraCeramica = scanner.nextDouble();
        System.out.print("Digite o comprimento da cerâmica escolhida (em centímetros): ");
        double comprimentoCeramica = scanner.nextDouble();

        larguraCeramica /= 100;
        comprimentoCeramica /= 100; 
        double areaCeramica = larguraCeramica * comprimentoCeramica; // área de uma cerâmica em metros quadrados
        double areaRevestida = larguraArea * comprimentoArea; // área da superfície a ser revestida em metros quadrados
        double quantidadeCeramica = Math.ceil(areaRevestida / areaCeramica); // quantidade de cerâmica necessária, arredondada para cima

        quantidadeCeramica *= 1.1;

        System.out.println("\nQuantidade de cerâmica necessária: " + quantidadeCeramica + " unidades");

        scanner.close();
    }
}