import java.util.Random;

public class MagicBox<T> {

    private T[] items;
    private int number;

    public MagicBox(int number) {
        this.number = number;
        this.items = (T[]) new Object[number];
    }

    private int random() {
        Random random = new Random();
        int randomInt = random.nextInt(number);
        return randomInt;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int cells = 0;
        for (T x : items) {
            if (x == null) {
                cells++;
            }
        }
        if (cells != 0) {
            throw new RuntimeException("Коробка не заполнена, необходимо заполнить " + cells + " ячеек!");
        }
        return items[random()];
    }
}
