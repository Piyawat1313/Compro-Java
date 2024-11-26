import java.util.PriorityQueue;
import java.util.Scanner;

class Van implements Comparable<Van> {
    String name;
    int availableDay;

    Van(String name) {
        this.name = name;
        this.availableDay = 0;
    }

    @Override
    public int compareTo(Van other) {
        // เปรียบเทียบตามวันที่รถว่าง (availableDay)
        // หากวันว่างเท่ากัน จะเลือกตามลำดับชื่อ A -> B -> C
        if (this.availableDay == other.availableDay) {
            return this.name.compareTo(other.name);
        }
        return this.availableDay - other.availableDay;
    }
}

public class ReserveVans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // จำนวนคำสั่งจอง

        // สร้างคิวลำดับความสำคัญ
        PriorityQueue<Van> vans = new PriorityQueue<>();
        vans.add(new Van("A"));
        vans.add(new Van("B"));
        vans.add(new Van("C"));

        for (int i = 0; i < N; i++) {
            int t = scanner.nextInt();  // จำนวนวันที่จอง
            Van selectedVan = vans.poll();  // เลือกรถที่ว่างเร็วที่สุด
            System.out.println(selectedVan.name);

            // อัปเดตวันที่รถคันนี้จะว่างอีกครั้ง และใส่กลับเข้าไปในคิว
            selectedVan.availableDay += t;
            vans.add(selectedVan);
        }
        scanner.close();
    }
}
