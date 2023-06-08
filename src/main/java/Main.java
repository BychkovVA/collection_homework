public class Main {
    public static void main(String[] args) {

        try {

            Apple apple = new Apple();
            Orange orange = new Orange();
            Fruit fruit = new Fruit();

            //создаем коробки конструктором коробки
            Box<Apple> boxApple = new Box<>();
            boxApple.addFruitsINBox(new Apple());
            boxApple.addFruitsINBox(new Apple());
            boxApple.addFruitsINBox(new Apple());

            Box<Orange> boxOrange = new Box<>();
            boxOrange.addFruitsINBox(new Orange());
            boxOrange.addFruitsINBox(new Orange());

            Box<Fruit> boxFruit = new Box<>();

            //наполняем коробку методом коробки
            boxFruit.addFruitsINBox(apple);
            boxFruit.addFruitsINBox(orange);
            boxFruit.addFruitsINBox(fruit);


            System.out.println("Вес коробки с яблоками: " + boxApple.weight());
            System.out.println("Вес коробки с апельсинами: " + boxOrange.weight());
            System.out.println("Вес коробки с фруктами: " + boxFruit.weight());

            System.out.println("Сравниваем вес коробок: " + boxApple.compare(boxOrange));
            System.out.println("Сравниваем вес коробок: " + boxApple.compare(boxApple));

            //перекладываем яблоки в другую корзину
            boxApple.shiftFruits(boxFruit);
            //boxApple.shiftFruits(boxApple);

            System.out.println("Вес коробки с фруктами после перекладывания: " + boxFruit.weight());
            System.out.println("Вес коробки с яблоками после перекладывания: " + boxApple.weight());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
