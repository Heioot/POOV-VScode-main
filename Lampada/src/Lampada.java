
public class Lampada {
    
    private int tensao; // 110, 220
    private int potencia; 
    private boolean acesa;
    private boolean quebrada;
    private boolean queimada;


// por padrão boolean inicia com false.

// Construtor padrão = public Lampada(){




// }

    public Lampada(){
        System.out.println("Construtor padrão da lampada executado");
        tensao = 220;
        potencia = 100;
        //acesa = false;
    }


    public Lampada(int t, int p ){
        System.out.println("Construtor padrão da lampada com dois parâmetros iniciados");
        tensao = t;
        potencia = p;
    }



    public Lampada(int t, int p, boolean a){
        tensao = t;
        potencia = p;
        acesa = a;
    }






    public void mostrar() {
        String texto = tensao + "V, " + potencia + "W, " +((acesa) ? "Acesa" : "Apagada")
                                                         +((queimada) ? " ,Queimada" : "")
                                                         +((quebrada) ? " ,Quebrada" : "");

        System.out.println(texto);
    }

}