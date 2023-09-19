package poov;

public class App {
    public static void main(String[] args) throws Exception {

        // Automovel a1 = new Automovel();

        // System.out.println("a1");
        // System.out.println(a1.getPreco());


        // Automovel a2 = new Automovel("azul", "fusca", "gasolina");
        // System.out.println(a2);
        // System.out.println(a2.getPreco());


        // if (a1.equals(a2)){
        //     System.out.println("iguais");
        // }


        AutomovelBasico ab1 = new AutomovelBasico("azul", "fusca", "gasolina", true, true, true);
        System.out.println(ab1);
        System.out.print(ab1.getPreco());

        AutomovelBasico ab2 = new AutomovelBasico("azul", "fusca", "gasolina", true, false, true);
        AutomovelBasico ab3 = new AutomovelBasico("azul", "fusca", "gasolina", true, true, false);

        if (ab1.equals(ab2)){
            System.out.println("iguais");
        }
        else{
            System.out.println("diferentes");
        }
        
    }
}
