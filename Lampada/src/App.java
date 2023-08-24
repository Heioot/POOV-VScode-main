
public class App {

    public static void main(String[] args) throws Exception {
        
        Lampada l1 = new Lampada();
        l1.mostrar();

        l1.tensao = 110;
        l1.potencia = 100;
        l1.acesa = true;
        l1.mostrar();

        Lampada l2 = new Lampada();

        l2.tensao = 220;
        l2.potencia = 60;
        l2.acesa = false;
        l2.quebrada = true;
        l2.mostrar();

    }

}