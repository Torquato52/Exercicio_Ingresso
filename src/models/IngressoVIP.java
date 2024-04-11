package models;

public class IngressoVIP extends Ingresso {

    private String funcao;

    public IngressoVIP(String identificador, float valor) {
        super(identificador, valor);
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public float valorFinal(float taxaConveniencia) {
        double valorComTaxa = super.valorFinal(taxaConveniencia) * 1.18;
        
        return (float) valorComTaxa;
    }

    @Override
    public String toString() {
        return "IngressoVIP [funcao=" + funcao + ", identificador=" + getIdentificador() + ", valor="
                + getValor() + "]";
    }


}