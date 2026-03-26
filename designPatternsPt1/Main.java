package designPatternsPt1;

public class Main {
    public static void main(String[] args) {

        // Singleton
        Zoologico zoo = Zoologico.getInstancia();
        System.out.println("Bem-vindo ao " + zoo.getNome());

        // Factory + Strategy
        Animal animal = AnimalFactory.criarAnimal("gato");
        animal.fazerSom();
    }
}
