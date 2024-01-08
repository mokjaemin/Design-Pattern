package Builder;

public class BuilderMain {
    public static void main(String[] args){
        Animal animal = new Animal.Builder().setKind(Kind.DOG).build();
        System.out.println(animal.toString());

    }
}
