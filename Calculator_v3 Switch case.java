
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator_v3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int result[] = new int[10];
        ArrayList<Integer> total = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                switch (num) {
                    case 1:
                        int index = sc.nextInt();
                        int index2 = sc.nextInt();
                        if (index >= 0 && index < n && index2 >= 0 && index2 < n) {
                            sum = arr[index] + arr[index2];
                            result[i] = sum;
                            System.out.println(result[i]);
                            total.add(result[i]);
                        }
                        else{
                            System.out.println("error");
                        }
                        break;
                    case 2:
                        if (total.isEmpty()) {
                            System.out.println("none");
                        } else {
                            System.out.println(total.remove(total.size() - 1));
                        }
                        break;
                }
            }
        }
        if (total.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < total.size(); i++) {
                System.out.print(total.get(i) + " ");
            }
        }
        sc.close();
    }
}
