package lesson08;

public class ObjCounter {
    private static int count = 0;

    public ObjCounter() {
        count++;
    }

    static void counter() {
        System.out.println(count);
    }
}
