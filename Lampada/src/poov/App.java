package poov;

public class App {

    public static void main(String[] args) throws Exception {


        LampadaColorida lc = new LampadaColorida();

        lc.mostrar();
        lc.setCor("azul");
        lc.mostrar();




        
        Lampada l1 = new Lampada();
        l1.mostrar();

        //l1.tensao = 110;
        l1.setTensao(110);
        //l1.potencia = 100;
        l1.setPotencia(60);
        //l1.acesa = true;
        l1.quebrar();
        //l1.setAcesa(true);
        l1.acender();
        l1.mostrar();

        Lampada l2 = new Lampada(220,60);

        // l2.tensao = 220;
        // l2.potencia = 60;
        //l2.quebrada = true;
        l2.setQuebrada(true);
        l2.mostrar();

        Lampada l3 = new Lampada(110,60,true);
        l3.mostrar();

        //Total de potencia gasta pelas 3 lampadas:

        System.out.println("Soma das potencias:" + (l1.getPotencia() + l2.getPotencia() + l3.getPotencia()));

    }

}