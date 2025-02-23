
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) throws Exception {
        double C, K, F, Re, Ra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        C = scanner.nextDouble();
        scanner.close();
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C *1.8 + 32 + 459.67;

 System.out.println("O valor de graus em F e " +  F);
 System.out.println("O valor de graus em K e " + K);
 System.out.println("O valor de graus em Re e " + Re);
 System.out.println("O valor de graus em Ra e " + Ra);
 
 
    }
}
