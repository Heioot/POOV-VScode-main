
public class App {

    public static void main(String[] args) throws Exception {
        
        Lampada l1 = new Lampada();
        l1.mostrar();

        l1.tensao = 110;
        l1.potencia = 100;
        l1.acesa = true;
        l1.quebrada = true;
        l1.queimada = true;
        l1.mostrar();

        Lampada l2 = new Lampada(220,60);

        // l2.tensao = 220;
        // l2.potencia = 60;
        l2.quebrada = true;
        l2.mostrar();
        l2.acesa = false;

        Lampada l3 = new Lampada(110,60,true);
        l3.mostrar();

    }

}