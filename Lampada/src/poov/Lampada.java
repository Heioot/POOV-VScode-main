package poov;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Lampada {
    
    private int tensao; // 110, 220
    private int potencia; 
    private boolean acesa;
    private boolean quebrada;
    private boolean queimada;


// por padrão boolean inicia com false.

// Construtor padrão = public Lampada(){




// }
//construtor
    public Lampada(){
        this(110,100);
        System.out.println("Construtor padrão da lampada executado");
        //tensao = 220;
        //potencia = 100;
        //acesa = false;
    }

//construtor
    public Lampada(int tensao, int potencia ){
        this(tensao, potencia, false);
        System.out.println("Construtor padrão da lampada com dois parâmetros iniciados");
        //tensao = t;
        setTensao(tensao); // PARA ATRIBUIR UM VALOR A TENSAO SEGUINDO REGRAS DO MÉTODO SETTENSAO
        //potencia = p;
        setPotencia(potencia); // PARA ATRIBUIR UM VLAOR A TENSAO SEGUINDO REGRAS DO MÉTODO SETPOTENCIA
    }


//construtor
public Lampada(int t, int p, boolean acesa){
    setTensao(tensao);
    setPotencia(potencia);
    this.acesa = acesa;
}

public void setTensao(int tensao){
    if ((tensao == 110) || (tensao == 220)){
        this.tensao = tensao;
    } else {
        this.tensao = 220;
        throw new InvalidParameterException("Valor inválido de parametro");
    }
}

public int getTensao(){
    return tensao;
}

public void setPotencia(int potencia){
    if ((potencia == 60) || (potencia == 100 || (potencia == 150))){
        this.potencia = potencia;
    } else {
        this.potencia = 60;
        throw new InvalidParameterException("Valor inválido de potência");
    }
    this.potencia = potencia;
}


public int getPotencia(){
    return potencia;
}

public void setAcesa(boolean acesa){
    if (!queimada && !quebrada){
        this.acesa = acesa;
    } else {
        if (queimada && acesa ){
            queimada = true;
            acesa = true;
        }
        this.acesa = false;
    }
}

public boolean isAcesa(){
    return acesa;
}

public void setQuebrada(boolean quebrada){
    this.quebrada = quebrada;
}

public boolean isQuebrada(){
    return quebrada;
}


public void setQueimada(boolean queimada){
    if (queimada && acesa){
        acesa = false;
    }
    this.queimada = queimada;
}

public boolean isQueimada(){
    return queimada;
}


public void acender(){
    setAcesa(true);
}

public void apagar(){
    setAcesa(false);
}

public void queimar(){
    setQueimada(true);
}

public void quebrar(){
    setQuebrada(true);
}

//SE FOSSE CRIAR UM ARRAYLIST LAMPADA

    ArrayList<Lampada> vetor = new ArrayList<Lampada>();

    public void mostrar() {
        String texto = tensao + " V, " + potencia + " W, " +((acesa) ? "Acesa" : "Apagada ")
                                                         +((queimada) ? " ,Queimada" : "")
                                                         +((quebrada) ? " ,Quebrada" : "");

        System.out.println(texto);
    }

}