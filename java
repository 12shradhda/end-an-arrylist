import java.util.ArrayList;
import java.util.List;

public class AddElementToEndExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the ArrayList before adding the element
        System.out.println("Before adding: " + numbers);

        // Add an element to the end of the ArrayList
        int elementToAdd = 40;
        numbers.add(elementToAdd);

        // Print the ArrayList after adding the element
        System.out.println("After adding: " + numbers);
    }
}
