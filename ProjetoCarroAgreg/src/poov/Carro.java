package poov;

import java.util.ArrayList;

public class Carro {

    private int ano;
    private String modelo;
    private String cor;
    private Motor motor;
    private ArrayList<Roda> rodas = new ArrayList<>();

    public Carro() {
        ano = -1;
        modelo = "sem modelo";
        cor = "sem cor";
        // motor = null;
        // rodas = new ArrayList<>();
    }

    public Carro(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        // rodas = new ArrayList<>();
    }

    public Carro(int ano, String modelo, String cor, Motor motor, ArrayList<Roda> rodas) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.rodas = rodas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ArrayList<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(ArrayList<Roda> rodas) {
        this.rodas = rodas;
    }

    public void adicinarRoda(Roda roda) {
        rodas.add(roda);
    }

    @Override
    public String toString() {
        return "ano: " + ano + "\nmodelo: " + modelo + "\ncor: " + cor + "\nmotor: " + motor + "\nrodas: " + rodas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ano;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        result = prime * result + ((motor == null) ? 0 : motor.hashCode());
        result = prime * result + ((rodas == null) ? 0 : rodas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (ano != other.ano)
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        if (motor == null) {
            if (other.motor != null)
                return false;
        } else if (!motor.equals(other.motor))
            return false;
        if (rodas == null) {
            if (other.rodas != null)
                return false;
        } else if (!rodas.equals(other.rodas))
            return false;
        return true;
    }

}
