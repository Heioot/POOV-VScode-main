import poov.AutomovelLuxo;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Automovel a1 = new Automovel();
        // System.out.println(a1);
        // System.out.println(a1.getPreco());

        // Automovel a2 = new Automovel("azul", "Fiat 147", "gas");
        // System.out.println(a2);
        // System.out.println(a2.getPreco());

        // if (a1.equals(a2)) {
        //     System.out.println("Iguais");
        // } else {
        //     System.out.println("DIferentes");
        // }

        // Automovel a3 = new Automovel("azul", "Fiat 147", "gas");
        // if (a2.equals(a3)) {
        //     System.out.println("Iguais");
        // } else {
        //     System.out.println("DIferentes");
        // }

        // AutomovelBasico ab1 = new AutomovelBasico("vermelho", "Renault", "gasolina", true, true, true);
        // System.out.println(ab1);
        // System.out.println(ab1.getPreco());

        // AutomovelBasico ab2 = new AutomovelBasico("vermelho", "Renault", "gasolina", true, true, true);
        // AutomovelBasico ab3 = new AutomovelBasico("amarelo", "Renault", "alcool", true, false, true);

        // if (ab1.equals(ab2)) {
        //     System.out.println("Iguais");
        // } else {
        //     System.out.println("DIferentes");
        // }

        // if (ab2.equals(ab3)) {
        //     System.out.println("Iguais");
        // } else {
        //     System.out.println("DIferentes");
        // }

        AutomovelLuxo al1 = new AutomovelLuxo("vermelho", "Renault", "gasolina", true, true, true, true, true, true);
        // System.out.println(al1);
        // System.out.println(al1.getPreco());



        AutomovelLuxo al2 = new AutomovelLuxo("vermelho", "Renault", "gasolina", true, true, true, true, true, true);
        AutomovelLuxo al3 = new AutomovelLuxo("amarelo", "Renault", "alcool", true, false, true, false, false, false);

        String representacao = al3.toString();
        System.out.println(" representação:" +  representacao);

        if (al1.equals(al2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("DIferentes");
        }

        if (al2.equals(al3)) {
            System.out.println("Iguais");
        } else {
            System.out.println("DIferentes");
        }

    }
}
