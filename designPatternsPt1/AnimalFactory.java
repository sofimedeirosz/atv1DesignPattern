package designPatternsPt1;

public class AnimalFactory {
    public static Animal criarAnimal(String tipo){
        if (tipo.equalsIgnoreCase("cachorro")){
            return new Cachorro();
        }else if(tipo.equalsIgnoreCase("gato")){
            return new Gato();
        }else{
            throw new IllegalArgumentException("Animal inválido");
        }
    }
}
