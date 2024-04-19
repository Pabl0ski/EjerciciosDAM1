import java.util.Random;

public class pruebaDeMoverArray {
        public static void main(String[] args) {
            int[] array = new int[10];
            Random random = new Random();

            // Fill the array with random numbers
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100) + 1;
            }

            // Print the original array
            System.out.println("Original array:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            // Shift the elements one position to the right
            int lastElement = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastElement;

            // Print the array after shifting
            System.out.println("\nArray after shifting:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

