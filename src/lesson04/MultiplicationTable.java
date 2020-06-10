package lesson04;

/**
 * Программа для вывода на экран таблицы умножения.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int row = 1; row < 10; row++) {
            for (int col = 1; col < 10; col++) {
                int res = row * col;
                System.out.printf("%3d", res);
            }
            System.out.println();
        }
    }
}
