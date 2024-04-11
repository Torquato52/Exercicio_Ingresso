package models;

public class Ingresso {

    private String identificador;
    private float valor;

    public Ingresso(){}

    public Ingresso(String identificador, float valor) {
        this.identificador = identificador;
        this.valor = valor;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float valorFinal(float taxaConveniencia) {
        float porcentagem = taxaConveniencia / 100;

        return this.valor + (this.valor * porcentagem);
    }

    @Override
    public String toString() {
        return "Ingresso [identificador=" + identificador + ", valor=" + valor + "]";
    }

}
