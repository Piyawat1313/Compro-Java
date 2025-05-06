import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }
        int k = sc.nextInt();
        int out = 0; // ออกนอกพื้นที่
        int shot = 0; // ยิงโดนเรือรบ
        int not_shot = 0; // ยิงไม่โดนเรือรบ
        int shot_agian = 0; // ยิงโดนเรือรบซ้ำ
        int notShotNoBoat = 0; // ยิงลงซ้ำในตำแหน่งเดิมที่ไม่มีเรือรบ
        int status = 0;
        int laststatus = 0;
        int index3 = 0;
        for (int i = 0; i < k; i++) {
            int index = sc.nextInt() - 1;
            int index2 = sc.nextInt() - 1;
            if (index < 0 || index >= r || index2 < 0 || index2 >= c) {
                out++;
            } else {
                if (arr[index][index2] == 0) {
                    arr[index][index2] = -1;
                    not_shot++;
                    // status++;
                } else if (arr[index][index2] == 1) {
                    arr[index][index2] = 3;
                    // isshot = false;
                    shot++;
                    count--;
                    if(index3 == 0){
                        status = i;
                    }
                    index3++;
                } else if (arr[index][index2] == 3) {
                    shot_agian++;
                    // laststatus++;
                } else if (arr[index][index2] == -1) {
                    notShotNoBoat++;

                }
                // if (isshot == false) {
                //     status++;
                // }
            }
            if (count != 0) {
                laststatus++;
            }
        }
        System.out.println(shot);
        System.out.println(not_shot);
        System.out.println(shot_agian);
        System.out.println(notShotNoBoat);
        System.out.println(out);
        if (count == 0) {
            System.out.println("attacker " + (laststatus + 1));
        } else if (count > 0 && status > 0) {
            System.out.println("battleship " + (status + 1));
        } else {
            System.out.println("battleship " + "-1");
        }
        sc.close();
    }
}
