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
        if (numFront == lotterry.number[lotterry.number.length - 1]) {
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

class SlaagOffice2 extends SlaagOffice {
    int[][] ar2d;
    boolean check = false;

    SlaagOffice2(int numFront, int[] arr, int ar2d[][]) {
        super(numFront, arr);
        this.ar2d = new int[ar2d.length][4];
        this.ar2d = ar2d;
    }

    @Override
    void checkPrize(Lottery lottery) {
        for (int i = 0; i < ar2d.length; i++) {
            if (ar2d[i][0] == lottery.number[0] && ar2d[i][1] == lottery.number[1] && ar2d[i][2] == lottery.number[2] && ar2d[i][3] == lottery.number[3]) {
                    check = true;
                    break;
            }
            else{
                check = false;
            }
        }
        if (check) {
            System.out.println("You got exact-match prize");
        } else {
            System.out.println("No exact-match prize");
        }
        super.checkPrize(lottery);
    }
}

public class Kongslaag2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] b = { sc.nextInt(), sc.nextInt() };
        final int R = sc.nextInt();
        int[][] exactPrizes = new int[R][];
        for (int i = 0; i < R; i++) {
            int[] nums = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
            exactPrizes[i] = nums;
        }
        SlaagOffice2 office = new SlaagOffice2(num, b, exactPrizes);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int[] temp = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
            Lottery lottery = new Lottery(temp);
            office.checkPrize(lottery);
            lottery.reportPrize();
        }
        sc.close();
    }
}
