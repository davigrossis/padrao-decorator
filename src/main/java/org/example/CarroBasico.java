package org.example;

public class CarroBasico implements Carro {

    private float precoBase;

    public CarroBasico(float precoBase) {
        this.precoBase = precoBase;
    }

    public float getPrecoAluguel() {
        return precoBase;
    }

    public String getServicos() {
        return "Aluguel do Carro";
    }
}
