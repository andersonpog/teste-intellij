package model;

import java.util.Objects;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nome, String cor, Integer idade) {
        super(nome, cor, idade);
    }

    @Override
    public String falar() {
        return "Miau";
    }



}


