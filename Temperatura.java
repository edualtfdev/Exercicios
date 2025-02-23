public class Temperatura {
    public static void main(String[] args) throws Exception {
        double C, K, F, Re, Ra;
        C = 2.43;
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C *1.8 + 32 + 459.67;

 System.out.println("O valor de graus em Farenheith e " +  F);
 System.out.println("O valor de graus em Kelvin e " + K);
 System.out.println("O valor de graus em Re e " + Re);
 System.out.println("O valor de graus em Ra e " + Ra);
 
 
    }
}
