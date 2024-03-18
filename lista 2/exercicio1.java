import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Insira a hora no formato HH:MM: ");
        String hora = scanner.nextLine();

        if (verificarHoraValida(hora)) {
            int minutosMeianoite = calcularminutosMeianoite(hora);
            System.out.println("Minutos desde a meia-noite: " + minutosMeianoite);
        } else {
            System.out.println("Hora inválida. Por favor, insira a hora no formato HH:MM.");
        }

        scanner.close();
    }


    public static int calcularminutosMeianoite(String hora) {
      
        String[] horaMinuto = hora.split(":");
        int horas = Integer.parseInt(horaMinuto[0]);
        int minutos = Integer.parseInt(horaMinuto[1]);
        int minutosMeianoite = horas * 60 + minutos;
        return minutosMeianoite;
        
    }

    public static boolean verificarHoraValida(String hora) {
        String[] horaMinuto = hora.split(":");
        if (horaMinuto.length != 2)
            return false;

        int horas = Integer.parseInt(horaMinuto[0]);
        int minutos = Integer.parseInt(horaMinuto[1]);

        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59)
            return false;

        return true;
    }
}