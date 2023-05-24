import java.util.ArrayList;

public class Box{

    private ArrayList<Fruit> fruitsBox = new ArrayList<>();


    private String clsName;

    public String getClsName() {
        return clsName;
    }

    public Box(Fruit fruit) {
        clsName = fruit.getClass().getName();

    }

    public Box(Fruit fruit, int count) {

        clsName = fruit.getClass().getName();

        for (int i = 0; i < count; i++) {
            fruitsBox.add(fruit);
        }
    }

    public void addFruitsINBox (Fruit fruit, int count) throws Exception {

        if (clsName.isEmpty()) {
            clsName = fruit.getClass().getName();
            for (int i = 0; i < count; i++) {
                fruitsBox.add(fruit);
            }
        } else {
            if (clsName.equals(fruit.getClass().getName()) || clsName.equals("Fruit")) {
                for (int i = 0; i < count; i++) {
                    fruitsBox.add(fruit);
                }
            } else {
                throw new Exception("use another box");
            }
        }
    }

    //функция вычисления веса коробки. Для коробки с фруктами суммирует проходом по всем элементам, так как могут быть разного класса
    //для коробок с одним типом фруктов упрощаем расчеты умножением веса на количество
    public Double weight () {
        Double weight = 0.0;
        if (clsName.equals("Fruit")) {
            for (int i = 0; i < fruitsBox.size(); i++) {
                weight+= fruitsBox.get(i).getWeight();
            }
        } else {
            if (fruitsBox.size() > 0) {
                weight = fruitsBox.size() * fruitsBox.get(0).getWeight();
            }
        }
        return weight;
    }

    //метод сравнения коробок по весу
    public boolean compare (Box box) {
        return weight().equals(box.weight());

    }

    //перекладываем фрукты из текущей коробки в другую (входящий параметр box)
    public void shiftFruits (Box box) throws Exception {
        if (box.getClsName().equals("Fruit")) {
            box.getFruitsBox().addAll(getFruitsBox());
            getFruitsBox().clear();
            clsName = "";
        } else {
            if(clsName.equals("Fruit") || !clsName.equals(box.getClsName())) {
                throw new Exception("use another box for shift");
            } else {
                box.getFruitsBox().addAll(getFruitsBox());
                getFruitsBox().clear();
                clsName = "";
            }
        }

    }

    public ArrayList<Fruit> getFruitsBox() {
        return fruitsBox;
    }

}
