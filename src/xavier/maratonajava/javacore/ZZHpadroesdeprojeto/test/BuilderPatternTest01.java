package xavier.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import xavier.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Leo")
                .lastName("Chave")
                .username("lxavier")
                .email("leonardo@email.com")
                .build();

        System.out.println(build);
    }
}
