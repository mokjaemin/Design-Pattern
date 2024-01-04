package Builder;

enum Kind {
    CAT,
    DOG
}

public class Animal {
    private String name;
    private int age;
    private Kind kind;

    // 싱글턴
    private Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind=" + kind +
                '}';
    }

    static class Builder {
        private String name;
        private int age;
        private Kind kind;

        // 필수 매개변수 설정
        Builder(){

        }

        // 선택적 매개변수 설정 메서드들
        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Builder setKind(Kind kind) {
            this.kind = kind;
            return this;
        }

        // 빌더 패턴의 핵심 메서드: 실제 객체 생성
        Animal build() {
            Animal animal = new Animal();
            animal.name = this.name;
            animal.age = this.age;
            animal.kind = this.kind;
            return animal;
        }
    }
}
