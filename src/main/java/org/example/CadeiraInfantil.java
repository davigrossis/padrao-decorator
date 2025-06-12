package org.example;

public class CadeiraInfantil extends CarroDecorator {

    public CadeiraInfantil(Carro carro) {
        super(carro);
    }

    public float getValorAdicional() {
        return 15.0f;
    }

    public String getNomeServico() {
        return "Cadeira Infantil";
    }
}
