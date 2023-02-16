public class Main {
    public static void main(String[] args) {
        MagicBox<String> boxString = new MagicBox<>(5);
        MagicBox<Integer> boxInteger = new MagicBox<>(7);

        boxString.add("Удача");
        boxString.add("Везение");
        boxString.add("Сила");
        boxString.add("Счастье");
        boxString.add("Стремление");
        String a = boxString.pick();
        System.out.println(a);

        boxInteger.add(333);
        boxInteger.add(12);
        boxInteger.add(42);
        boxInteger.add(600);
        boxInteger.add(58);
        boxInteger.add(6);
        boxInteger.add(38);
        int b = boxInteger.pick();
        System.out.println(b);
    }
}