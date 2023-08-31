public class App {
    public static void main(String[] args) throws Exception {
        Televisao tv1 = new Televisao();
        tv1.mostrar();
        tv1.setCanal(3);
        tv1.setTamanho(48);
        tv1.setLigada(true);
        tv1.mostrar();
    }
}