package org.example;

public abstract class CarroDecorator implements Carro {

    private Carro carro;
    public String servico;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getValorAdicional();

    public float getPrecoAluguel() {
        return this.carro.getPrecoAluguel() + this.getValorAdicional();
    }

    public abstract String getNomeServico();

    public String getServicos() {
        return this.carro.getServicos() + " + " + this.getNomeServico();
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
}
