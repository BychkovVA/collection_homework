import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{

    private final List<T> fruits = new ArrayList<>();

    public Box() {

    }
    public void addFruitsINBox (T fruit) {
        fruits.add(fruit);
    }

    //функция вычисления веса коробки. Простой перебор
    public Double weight () {
        Double weight = 0.0;
        for (T t : fruits) {
            weight += t.getWeight();
        }
        return weight;
    }

    //метод сравнения коробок по весу
    public boolean compare (Box box) {
        return weight().equals(box.weight());

    }

    //перекладываем фрукты из текущей коробки в другую (входящий параметр box)
    public void shiftFruits (Box box){
          if (box != this) {
              box.getFruits().addAll(getFruits());
              getFruits().clear();
          }

    }

    public List<T> getFruits() {
        return fruits;
    }

}
