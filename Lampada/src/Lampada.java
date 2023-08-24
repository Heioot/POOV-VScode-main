
public class Lampada {
    
    public int tensao; // 110, 220
    public int potencia; 
    public boolean acesa;
    public boolean quebrada;
    public boolean queimada;

    public void mostrar() {
        String texto = tensao + "V, " + potencia + "W, " +((acesa) ? "Acesa" : "Apagada")
                                                         +((queimada) ? " ,Queimada" : "")
                                                         +((quebrada) ? " ,Quebrada" : "");

        System.out.println(texto);
    }

}