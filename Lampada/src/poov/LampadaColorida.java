package poov;

public class LampadaColorida extends Lampada {
    
    private String cor;

    public LampadaColorida() {
        super(220, 60);
        cor = "Sem cor";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // public void setTensao(int tensao) {
    //     System.out.println("Estraguei tudo");
    //     // super.setTensao(-1000);
    // }

    @Override  //o @Override nao eh obrigatorio, mas eh util
    public void mostrar() {
        // super.mostrar();
        // System.out.println(cor);
        String texto = cor + ", " + getTensao() + "V, " + getPotencia() + "W, " + ((isAcesa()) ? "Acesa" : "Apagada")
                + ((isQueimada()) ? ", Queimada" : "")
                + ((isQuebrada()) ? ", Quebrada" : "");
        System.out.println(texto);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + cor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
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
        LampadaColorida other = (LampadaColorida) obj;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        return true;
    }

    

}