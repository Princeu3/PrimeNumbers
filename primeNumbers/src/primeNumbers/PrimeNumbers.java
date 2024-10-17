package primeNumbers;

/** Prints out all prime numbers up to a specified limit using the Sieve of Eratosthenes. */
public class PrimeNumbers {
    public static final int LIMIT = 1000;

    /** Initializes the boolean array for the sieve. */
    public static void initializeSieve(boolean[] isPrime) {
        // Assume all numbers are prime initially
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        // 0 and 1 are not prime numbers
        if (isPrime.length > 0) isPrime[0] = false;
        if (isPrime.length > 1) isPrime[1] = false;
    }

    /** Crosses off all multiples of the given prime number starting from its square. */
    public static void crossOffMultiplesOf(int prime, boolean[] isPrime) {
        for (int multiple = prime * prime; multiple < isPrime.length; multiple += prime) {
            isPrime[multiple] = false;
        }
    }

    /** Performs the Sieve of Eratosthenes to find all prime numbers up to the limit. */
    public static void performSieve(boolean[] isPrime) {
        int sqrtLimit = (int) Math.sqrt(isPrime.length);
        for (int number = 2; number <= sqrtLimit; number++) {
            if (isPrime[number]) {
                crossOffMultiplesOf(number, isPrime);
            }
        }
    }

    /** Prints all prime numbers found in the sieve. */
    public static void printAllPrimes(boolean[] isPrime) {
        System.out.println("Prime numbers up to " + (isPrime.length - 1) + ":");
        for (int number = 2; number < isPrime.length; number++) {
            if (isPrime[number]) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        boolean[] isPrime = new boolean[LIMIT + 1]; // +1 to include the LIMIT itself
        initializeSieve(isPrime);
        performSieve(isPrime);
        printAllPrimes(isPrime);
    }
}
