import model.Cachorro;
import model.Gato;
import model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrimeiroTeste {
    public static void main(String[] args) {
        System.out.println("To aqui");

        Gato doido = new Gato("Doido", "Branco", 3);

        Cachorro tom = new Cachorro("Tom", "Caramelo", 10);

        tom.setIdade(15);

        List<Animal> animais = new ArrayList<>();

        animais.add(doido);
        animais.add(tom);

        for(Animal animal : animais){
            System.out.println(animal);
            System.out.println(animal.falar());
        }

        ListIterator<Animal> iteratorAnimal = animais.listIterator();

        while (iteratorAnimal.hasNext()){
            Animal animal = iteratorAnimal.next();
            animal.setIdade(animal.getIdade()/2);
            iteratorAnimal.set(animal);
        }

        for(Animal animal : animais){
            System.out.println(animal);
            System.out.println(animal.falar());
        }


//        System.out.println(doido);
//        System.out.println(tom);
//
//        System.out.println(doido.falar());
//        System.out.println(tom.falar());
    }
}
