import java.util.Random;

public class ex28 {
    public static void main(String[] args) {
        int[] rand = createRandomNumbers(7);
        for (int i = 0; i < rand.length; i++) {
            System.out.print(rand[i] + ",");
        }
    }
    public static int[] createRandomNumbers(int size) {
        int array[] = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int rand = random.nextInt(100);
            array[i] = rand;
        }
        return array;

    }

}
