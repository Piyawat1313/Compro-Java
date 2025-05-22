import java.util.Scanner;

public class CookiePlan {
    static int planCookie(int powder[], int[] butter){
        int count = 0;
        for (int i = 0; i < butter.length; i++) {
            if(powder[i] / 6 < 10 || butter[i] / 3 < 10){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] flours = new int[N];
        int[] butters = new int[N];
        for (int i = 0; i < N; i++) {
            flours[i] = sc.nextInt();
            butters[i] = sc.nextInt();
            if(flours[i] / 6 < 10 || butters[i] / 3 < 10){
                System.out.println(i + 1);
            }
        }
        int total = planCookie(flours, butters);
        System.out.println("There are " + total + " days that ingredients are insufficient");
        sc.close();
    }
}
