import java.util.Random;

public class RandomPrimeGenerator {

  static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    
    static void prime_maloom(int min, int max) {
        int[] prime = new int[max - min]; 
        int b = 0;

        for (int a = min; a <= max; a++) {
            if (isPrime(a)) {
                prime[b] = a;
                b++;
            }
        }

        if (b == 0) {
            System.out.println("No prime numbers found.");
           return;
        }
        int maxPrime = prime[0];
        int minPrime = prime[0];

        for (int i = 1; i < b; i++) {
            if (prime[i] > maxPrime) maxPrime = prime[i];
            if (prime[i] < minPrime) minPrime = prime[i];
        }

        System.out.println("Minimum Prime: " + minPrime);
        System.out.println("Maximum Prime: " + maxPrime);
    }
public static void main(String[] args) {

prime_maloom(1,50);


}
}
