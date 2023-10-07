package homework;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box> {
    private static int ind;
    private int box_id = ind;
    static {
        ind = 1;
    }
    {
        ind++;
    }
    private ArrayList<T> fruits;

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public Box(){
        this.fruits = new ArrayList<T>();
    }
    public Box (ArrayList<T> fruits){
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "Box number " + box_id +
                " {fructs=" + fruits +
                '}';
    }

    /**
     * @return метод подсчёта веса коробки
     */
    public double getWeight(){
        return fruits.size() > 0? fruits.size() * fruits.get(0).getWeight() : 0;
    }

    /**
     * Метод добавления фрукта в коробку
     * @param fruit - объект фрукта для добавления в текущий экземпляр коробки
     */
    public void addFruit(T fruit){
        this.fruits.add(fruit);
    }

    @Override
    public int compareTo(Box box) {
        return Double.compare(this.getWeight(), box.getWeight());
    }

    /**
     * Сравнение коробок по весу
     * @param box -  экземпляр, сравниваемый коробкой у которой вызван метод
     * @return -  true – если их массы равны, false в противоположном случае
     */
    public boolean compare(Box box){
        return this.compareTo(box) == 0;
    }

    /**
     * Метод для перемещения фруктов из объекта у которого вызван метод в объект box
     * @param count - количество фруктов, которое необходимо перенести
     * @param box - коробка, в которую переносятся фрукты
     */

    public void displacement(int count, Box<T> box) {
        if (this.fruits.size() >= count) {
            for (int i = 0; i < count; i++) box.fruits.add(this.fruits.get(i));
            for(int j = count - 1; j >= 0; j--) this.fruits.remove(j);
            }
        }
    }


