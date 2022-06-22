package model;

import java.util.Objects;

public class Cachorro extends Animal{

    private String raca;
    private String porte;
    public Cachorro() {
    }

    public Cachorro(String nome, String cor, Integer idade) {
        super(nome, cor, idade);
    }

    @Override
    public String falar() {
        return "Au au";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cachorro cachorro = (Cachorro) o;
        return Objects.equals(raca, cachorro.raca) && Objects.equals(porte, cachorro.porte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), raca, porte);
    }
}
