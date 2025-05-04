import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {
        int[] frequency = new int[21];

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(21); 
            frequency[num]++;
        }

        System.out.println("Number \t Frequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " \t " + frequency[i]);
        }
    }
}
