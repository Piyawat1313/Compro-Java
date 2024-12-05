import java.util.Scanner;

public class B2Box2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // อ่านจำนวนกล่อง
        int n = sc.nextInt();
        int[] box_capacity = new int[n];
        int[] box_content = new int[n];

        // อ่านความจุของแต่ละกล่อง
        for (int i = 0; i < n; i++) {
            box_capacity[i] = sc.nextInt();
        }

        // อ่านจำนวนคำสั่ง
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int command = sc.nextInt(); // อ่านคำสั่ง
            int q = sc.nextInt();      // จำนวนของที่ใส่หรือหยิบ

            if (command == 1) {
                // กรณีใส่ของ
                int b = sc.nextInt() - 1; // หมายเลขกล่อง (0-index)
                if (box_content[b] + q <= box_capacity[b]) {
                    box_content[b] += q;
                    System.out.println(box_content[b]);
                } else {
                    System.out.println("-1");
                }
            } else if (command == 2) {
                // กรณีหยิบของ
                int remaining = q; // จำนวนของที่ต้องหยิบ
                int lastBox = -1;

                for (int j = 0; j < n; j++) {
                    if (remaining == 0) break;

                    if (box_content[j] > 0) {
                        int toTake = Math.min(box_content[j], remaining);
                        box_content[j] -= toTake;
                        remaining -= toTake;
                        lastBox = j + 1; // บันทึกหมายเลขกล่องสุดท้ายที่พิจารณา
                    }
                }

                if (remaining > 0) {
                    // ของไม่พอให้หยิบ
                    System.out.println(n + " 0");
                } else {
                    // หยิบครบแล้ว
                    System.out.println(lastBox + " " + box_content[lastBox - 1]);
                }
            }
        }
        sc.close();
    }
}
