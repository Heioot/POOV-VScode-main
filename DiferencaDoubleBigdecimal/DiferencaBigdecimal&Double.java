import java.util.Scanner;
import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        
        double x1 = 1.03,y1 = 0.42;
        BigDecimal x2,y2,resultado = BigDecimal.ONE;




        Scanner s = new Scanner(System.in);

        x2 = new BigDecimal(s.nextLine());
        y2 = new BigDecimal(s.nextLine());

        resultado = x2.subtract(y2);

        

        System.out.println("Valor da subtração em Double eh: " + (x1 - y1));
        System.out.println("Valor da subtracao em Bigdecimal eh: " + resultado);
        s.close();
    }
}