package model;

public class Cachorro extends Animal{


    public Cachorro() {
    }

    public Cachorro(String nome, String cor, Integer idade) {
        super(nome, cor, idade);
    }

    @Override
    public String falar() {
        return "Au au";
    }



}
