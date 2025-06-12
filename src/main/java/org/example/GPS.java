package org.example;

public class GPS extends CarroDecorator {

    public GPS(Carro carro) {
        super(carro);
    }

    public float getValorAdicional() {
        return 20.0f;
    }

    public String getNomeServico() {
        return "GPS";
    }
}
