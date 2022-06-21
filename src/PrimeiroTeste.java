import model.Cachorro;
import model.Gato;

public class PrimeiroTeste {
    public static void main(String[] args) {
        System.out.println("To aqui");

        Gato doido = new Gato("Doido", "Branco", 3);

        Cachorro tom = new Cachorro("Tom", "Caramelo", 10);

        System.out.println(doido);
        System.out.println(tom);
    }
}
