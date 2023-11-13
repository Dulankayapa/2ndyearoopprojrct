package testc;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        RandNum rnd = new RandNum();

        rnd.display();
    }
}

class RandNum {

    private int arr[][] = new int[5][5];

    public RandNum() {
        Random r = new Random();

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                arr[x][y] = r.nextInt(1, 100);
            }
        }
    }

    public int findMin() {
        int min = arr[0][0];

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (arr[x][y] < min) {
                    min = arr[x][y];
                }
            }
        }

        return min;
    }

    public int findMax() {
        int max = arr[0][0];

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (arr[x][y] > max) {
                    max = arr[x][y];
                }
            }
        }

        return max;
    }

    public float findAvg() {
        int total = 0;

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                total += arr[x][y];
            }
        }

        return total / 25;
    }

    public void display() {
        System.out.println("Min : " + findMin());
        System.out.println("Max : " + findMax());
        System.out.println("Avg : " + findAvg());
    }
}