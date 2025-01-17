import java.util.Scanner;

public class RemoveMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            int direction = Integer.parseInt(command[0]);
            String word = command[1];

            if (direction == 1) {
                text = removeFirstOccurrence(text, word);
            } else if (direction == 2) {
                text = removeLastOccurrence(text, word);
            }

            System.out.println(text);
        }

        scanner.close();
    }

    private static String removeFirstOccurrence(String text, String word) {
        int index = text.indexOf(word);
        if (index != -1) {
            return text.substring(0, index) + text.substring(index + word.length());
        }
        return text;
    }

    private static String removeLastOccurrence(String text, String word) {
        int index = text.lastIndexOf(word);
        if (index != -1) {
            return text.substring(0, index) + text.substring(index + word.length());
        }
        return text;
    }
}
