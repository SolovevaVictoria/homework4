package homework;

import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект*/
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();


        Box <Apple> box1 = new Box();
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple5);
        box1.addFruit(apple6);
        System.out.println(box1);

        ArrayList<Orange> listOrange = new ArrayList<>();
        listOrange.add(orange1);
        listOrange.add(orange2);
        Box <Orange> box2 = new Box(listOrange);
        System.out.println(box2);

        Box <Apple> box3 = new Box<>();
        box3.addFruit(apple3);
        box3.addFruit(apple4);
        System.out.println(box3);

        System.out.println(box1.compare(box2));
        System.out.println(box1.compare(box3));

        box1.displacement(4, box3);
        System.out.println(box1);
        System.out.println(box3);


    }

}
