package Prototype;

public class PrototypeMain {
    public static void main(String[] args){
        Avante original = new Avante(100);
        Avante prototype1 = (Avante) original.clone();
        Avante prototype2 = (Avante) original.clone();

        System.out.println(original.equals(prototype1));
        System.out.println(original.equals(prototype2));
    }
}
