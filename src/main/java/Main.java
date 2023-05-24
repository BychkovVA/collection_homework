public class Main {
    public static void main(String[] args) {

        try {

            Apple apple = new Apple();
            Orange orange = new Orange();
            Fruit fruit = new Fruit();

            //создаем коробки конструктором коробки
            Box boxApple = new Box(apple, 5);
            Box boxOrange = new Box(orange, 8);

            Box boxFruit = new Box(fruit);

            //наполняем коробку методом коробки
            boxFruit.addFruitsINBox(apple, 2);
            boxFruit.addFruitsINBox(orange, 4);


            System.out.println("Вес коробки с яблоками: " + boxApple.weight());
            System.out.println("Вес коробки с апельсинами: " + boxOrange.weight());
            System.out.println("Вес коробки с фруктами: " + boxFruit.weight());

            System.out.println("Сравниваем вес коробок: " + boxApple.compare(boxOrange));

            //перекладываем яблоки в другую корзину
            boxApple.shiftFruits(boxFruit);

            System.out.println("Вес коробки с фруктами после перекладывания: " + boxFruit.weight());
            System.out.println("Вес коробки с яблоками после перекладывания: " + boxApple.weight());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
