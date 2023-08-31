import java.security.InvalidParameterException;

public class Televisao {

    //atributos
    private int tamanho;
    private int canal;
    private int volume;
    private boolean ligada;
    private String resolucao;
    private boolean smart;

    //construtores

    public Televisao(){
    }

    public Televisao(int tamanho, int canal, int volume, boolean ligada, String resolucao, boolean smart){
        setTamanho(tamanho);
        setCanal(canal);
        setVolume(volume);
        this.ligada = false;
        setResolucao(resolucao);
        this.smart = true;





    }

    public void setTamanho(int tamanho){
        if(tamanho > 0 && tamanho <= 120){
            this.tamanho = tamanho;
        } else{
            throw new InvalidParameterException("Tamanho(polegadas) inexistente.");
        }
    }


    //get e set 
    public int getTamanho(){
        return tamanho;
    }

    public void setCanal(int canal){
        if(canal > 0 && canal <= 100){
            this.canal = canal;
        } else {
            throw new InvalidParameterException("Canal inválido, o valor deve estar entre 1 e 100");
        }
    }

    public int getCanal(){
        return canal;
    }

    public void setVolume(int volume){
        if(volume >= 0 && volume <=100){

            this.volume = volume;
        }else{
            throw new InvalidParameterException("Volume inválido, o volume disponível é de 0 a 100");
        }
    }

    public int getVolume(){
        return volume;
    }

    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }

    public boolean isLigada(){
        return ligada;
    }

    public void setResolucao(String resolucao){
        this.resolucao = resolucao;
    }

    public String getResolucao(){
        return resolucao;
    }

    public void setSmart(boolean smart){
        this.smart = smart;
    }

    public boolean isSmart(){
        return smart; 
   }


   public void mostrar(){

    String mostrar = tamanho + " inch " + canal + volume +((ligada) ? " Ligada " : " Apagada ") + resolucao +((smart) ? " Smart " : " Convencional ");
    System.out.println(mostrar);
   }
}