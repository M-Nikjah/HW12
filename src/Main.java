import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input and use ctrl+D to end entering.");
        List<String> strings = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        while (input.hasNext()) {
            strings.add(input.next());
            ints.add(input.nextInt());
        }

        System.out.println("==========================");
        for (int i = 0; i < strings.size(); i++) {
            System.out.printf("%-15s%03d%n", strings.get(i), ints.get(i));
        }
        System.out.println("==========================");
    }
}
