package task1;

public class FirstTask {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (int) (1 + System.nanoTime() % 100);
            }
        }

        int maxValue = arr[0][0];
        int minValue = arr[0][0];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
                if (arr[i][j] < minValue) {
                    minValue = arr[i][j];
                }
                sum += arr[i][j];
            }
        }

        System.out.printf("Максимальное значение: %d%n", maxValue);
        System.out.printf("Минимальное значение: %d%n", minValue);
        System.out.printf("Среднее значение: %d%n", sum / (arr.length * arr.length));
    }
}
