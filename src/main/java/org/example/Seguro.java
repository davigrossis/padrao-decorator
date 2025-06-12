package org.example;

public class Seguro extends CarroDecorator {

    public Seguro(Carro carro) {
        super(carro);
    }

    public float getValorAdicional() {
        return 50.0f;
    }

    public String getNomeServico() {
        return "Seguro Completo";
    }
}
