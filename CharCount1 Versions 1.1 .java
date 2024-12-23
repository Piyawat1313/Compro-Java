import java.util.*;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // รับค่า K จากบรรทัดแรก
        int K = Integer.parseInt(scanner.nextLine());
        Map<Character, Integer> charCount = new HashMap<>();
        int stringCount = 0;

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            stringCount++;
            
            for (char ch : input.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
                if (charCount.get(ch) == K) {
                    System.out.println(ch);
                    System.out.println(stringCount);
                    return; // จบการทำงานทันทีเมื่อพบคำตอบ
                }
            }
        }
    }
}
