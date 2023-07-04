import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class HashMapFromUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an empty HashMap
        Map<String, String> hashMap = new HashMap<>();

        // Prompt the user for input
        System.out.print("Enter the number of key-value pairs: ");
        int numPairs = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Loop to input key-value pairs
        for (int i = 0; i < numPairs; i++) {
            System.out.print("Enter key #" + (i + 1) + ": ");
            String key = scanner.nextLine();

            System.out.print("Enter value #" + (i + 1) + ": ");
            String value = scanner.nextLine();

            // Add the key-value pair to the HashMap
            hashMap.put(key, value);
        }

        // Display the HashMap
        System.out.println("\nHashMap Contents:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        scanner.close();
    }
}
