package Java;

public class Counter implements AutoCloseable {
    static int count = 0;

    public static void add() {
        Counter.count += 1;
    }

    public static void animalCounter() {
        System.out.println("Кол-во ваших животных: " + Counter.count);
    }

    public Counter() {
        this.count = count;
    }

    @Override
    public void close() throws Exception {
}
}
