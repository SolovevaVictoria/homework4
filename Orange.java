package homework;

public class Orange extends Fruit{
    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "[Апельсин]" + super.toString();
    }
}
