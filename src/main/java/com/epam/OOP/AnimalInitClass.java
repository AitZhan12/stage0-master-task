package com.epam.OOP;

public class AnimalInitClass {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println(dog.getDescription("brown", 5, true));
        System.out.println(bird.getDescription("blue", 1, false));
    }

    /**
     * В данном примере мы используем динамический полиморфизм,
     * приводя объекты к типам Bird и Dog, чтобы иметь доступ к специфичным для этих классов методам
     * getDescription().
     * Это демонстрирует использование одного интерфейса (типа Animal) для работы с разными типами объектов (типами Bird и Dog)
     * - что и является полиморфизма в Java
     */
}
