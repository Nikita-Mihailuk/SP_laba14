import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10000];

        for (int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(100);
        }

        int max = 0;
        for (int i = 0; i < array.length; i ++){
            for (int j = i + 10; j < array.length; j++){
                int sum = array[i] * array[i] + array[j] * array[j];
                if (sum > max) max = sum;
            }
        }

        System.out.println(max);
    }
}