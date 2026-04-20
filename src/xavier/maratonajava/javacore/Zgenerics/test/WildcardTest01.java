package xavier.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Dog extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Dog");
    }
}

class Cat extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Cat");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        Animal[] animals = {new Dog(), new Cat()};

        printConsulta(dogs);
        printConsulta(cats);
        printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals) {
        for  (Animal animal : animals) {
            animal.consulta();
        }
    }
}
