package homework;

public class Apple extends Fruit{
    public Apple() {
        super(1f);
    }
    @Override
    public String toString() {
        return "[Яблоко]" + super.toString();
    }
}
