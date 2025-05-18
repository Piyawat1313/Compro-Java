import java.util.Scanner;

public class AgeReport {
    static int reportAge(int[] id, int[] age, int lessAge, int moreAge){
        int count = 0;
        for (int i = 0; i < age.length; i++) {
            if(age[i] >= lessAge && age[i] <= moreAge){  //ช่วงอายุที่สนใจ
                System.out.println(id[i] + " ");
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id[] = new int[n];
        int age[] = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
            age[i] = sc.nextInt();
        }
        int lessAge = sc.nextInt();
        int moreAge = sc.nextInt();
        int total =  reportAge(id, age, lessAge, moreAge);
        System.out.println("There are " + total + " persons in age range of " + lessAge + " to " + moreAge);
        sc.close();
    }
}
