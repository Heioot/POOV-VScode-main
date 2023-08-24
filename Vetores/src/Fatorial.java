import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        int valor = 0;
        int fatorial = 1;

        Scanner s = new Scanner(System.in);

        System.out.println("Entre com o valor: ");
        valor = s.nextInt();

        for(int i = 2; i<=valor; i++){
            fatorial *= i;
        }

    System.out.println(fatorial);

    s.close();
    }
}
