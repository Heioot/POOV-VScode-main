package poov;

public class AutomovelLuxo extends AutomovelBasico{

    private boolean direcaoHidraulica;
    private boolean vidroTravasEletricas;
    private boolean cambioAutomatico;
    public AutomovelLuxo(String cor, String modelo, String combustivel, boolean retrovisorPassageiro,
            boolean limpadorTraseiro, boolean radioFM, boolean direcaoHidraulica, boolean vidroTravasEletricas) {
        super(cor, modelo, combustivel, retrovisorPassageiro, limpadorTraseiro, radioFM);
        this.direcaoHidraulica = direcaoHidraulica;
        this.vidroTravasEletricas = vidroTravasEletricas;
    }
    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }
    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }
    public boolean isVidroTravasEletricas() {
        return vidroTravasEletricas;
    }
    public void setVidroTravasEletricas(boolean vidroTravasEletricas) {
        this.vidroTravasEletricas = vidroTravasEletricas;
    }
    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }
    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }




    @Override
    public String toString() {
        return super.toString() + "AutomovelLuxo [direcaoHidraulica=" + direcaoHidraulica + ", vidroTravasEletricas="
                + vidroTravasEletricas + ", cambioAutomatico=" + cambioAutomatico + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (direcaoHidraulica ? 1231 : 1237);
        result = prime * result + (vidroTravasEletricas ? 1231 : 1237);
        result = prime * result + (cambioAutomatico ? 1231 : 1237);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        AutomovelLuxo other = (AutomovelLuxo) obj;
        if (direcaoHidraulica != other.direcaoHidraulica)
            return false;
        if (vidroTravasEletricas != other.vidroTravasEletricas)
            return false;
        if (cambioAutomatico != other.cambioAutomatico)
            return false;
        return true;
    }

    
    
    
}
