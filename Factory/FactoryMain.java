package Factory;

public class FactoryMain {
    public static void main(String[] args){

        // 팩토리 패턴 vs 추상 팩터리 패턴
        // 팩터리 패턴 : 하나의 제품을 생성하는 단일 팩토리 구성
        // 추상 팩터리 패턴 : 여러 제품을 생성하는 팩토리 구성

        // 추상 팩터리 구성
        // -> 제품A 인터페이스, 제품A1 클래스, 제품A2 클래스
        // -> 제품B 인터페이스, 제품B1 클래스, 제품B2 클래스
        // -> 팩터리 인터페이스(제품A-제품B 반환)
        // -> 팩터리1 클랙스(제품A1-제품B1 반환)
        // -> 팩터리2 클랙스(제품A2-제품B2 반환)


        CarFactory avanteFactory = new AvanteFactory();
        CarFactory sonataFactory = new SonataFactory();

        Car avante = avanteFactory.produceCar();
        Car sonata = sonataFactory.produceCar();

        System.out.println(avante.getClass());
        System.out.println(sonata.getClass());
    }
}
