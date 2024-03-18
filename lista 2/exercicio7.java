import java.util.Scanner;
import java.lang.Math;

public class exercicio7 {
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

        System.out.print("Digite o valor do metro quadrado da cerâmica (em reais): ");
        double valorMetroQuadrado = scanner.nextDouble();

        larguraCeramica /= 100; 
        comprimentoCeramica /= 100;

  
        double areaCeramica = larguraCeramica * comprimentoCeramica; 
        double areaRevestida = larguraArea * comprimentoArea; 
        double quantidadeCeramica = Math.ceil(areaRevestida / areaCeramica);

        quantidadeCeramica *= 1.1;

        double valorTotal = quantidadeCeramica * areaCeramica * valorMetroQuadrado;


        System.out.println("\nQuantidade de cerâmica necessária: " + quantidadeCeramica + " unidades");
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        scanner.close();
    }
}