 package Inheritance;

import java.util.Scanner;

class SlaagOffice {
    int numFront;
    int arr[] = new int[2];

    SlaagOffice(int numFront, int[] arr) {
        this.numFront = numFront;
        this.arr = arr;
    }

    void checkPrize(Lottery lotterry) {
        if (arr[1] == lotterry.number[lotterry.number.length - 1]
                && arr[0] == lotterry.number[lotterry.number.length - 2]) {
            lotterry.twoBack = true;
        }
        if (arr[0] == lotterry.number[0] && arr[1] == lotterry.number[1]) {
            lotterry.twoFront = true;
        }
        if (numFront == lotterry.number[0]) {
            lotterry.oneFront = true;
        }
        if(numFront == lotterry.number[lotterry.number.length - 1]){
            lotterry.oneBack = true;
        }
    }
}

class Lottery {
    boolean oneFront = false;
    boolean oneBack = false;
    boolean twoFront = false;
    boolean twoBack = false;
    int number[];

    Lottery(int number[]) {
        this.number = new int[4];
        this.number = number;
    }

    void reportPrize() {
        if (oneFront) {
            System.out.println("You got one front prize");
        }
        if (oneBack) {
            System.out.println("You got one back prize");
        }
        if (twoFront) {
            System.out.println("You got two front prize");
        } 
        if (twoBack) {
            System.out.println("You got two back prize");
        } else if (!oneFront && !oneBack && !twoFront && !twoBack) {
            System.out.println("Sorry, no prize");
        }
    }
}

public class Kongslaag1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] b = { sc.nextInt(), sc.nextInt() };
        SlaagOffice office = new SlaagOffice(num, b);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int[] nums = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
            Lottery lottery = new Lottery(nums);
            office.checkPrize(lottery);
            lottery.reportPrize();
        }
        sc.close();
    }
}
