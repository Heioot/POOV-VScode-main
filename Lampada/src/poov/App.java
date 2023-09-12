package poov;

public class App {

    public static void main(String[] args) throws Exception {
        
        LampadaColorida lc = new LampadaColorida();
        // // lc.mostrar();
        lc.setCor("Azul");
        lc.mostrar();

        lc.toString();

        // System.out.println(lc);

        Lampada l1 = new Lampada();
        System.out.println(l1);

        Lampada l2 = new Lampada();
        System.out.println(l2);

        if (l1 == l2) { 
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        if (l1.equals(l2)) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        if (l1.equals(l1)) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        //Lampada l3 = new Lampada(l1);
        

        // System.out.println();
        // Lampada l2 = new Lampada(110, 100);
        // System.out.println();
        // Lampada l3 = new Lampada(220, 60, true);
        // l1.mostrar();

        // l1.setTensao(220);
        // l1.setPotencia(150);
        // // l1.setAcesa(true);
        // l1.quebrar();
        // // l1.setQueimada(true);
        // l1.acender();
        // l1.mostrar();

        // Lampada l2 = new Lampada(220, 60);
        // l2.quebrar();
        // l2.mostrar();

        // Lampada l3 = new Lampada(110, 60, true);
        // l3.mostrar();


        // //Total de potencia gasta pelas 3 lampadas
        // System.out.println(l1.getPotencia() + l2.getPotencia() + l3.getPotencia());

    }

}
