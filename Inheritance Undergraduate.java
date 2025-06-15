package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

class Student1 {
    public String firstName;
    public String lastName;
    private int[] stepscore;

    Student1(String name, String last) {
        this.firstName = name;
        this.lastName = last;
        this.stepscore = new int[4];
    }

    int getTestScore(int index) {
        int score = stepscore[index - 1];
        return score;
    }

    void setTestScore(int index, int score) {
        stepscore[index - 1] = score;
    }

    int computeTotal() {
        int totalscore = 0;
        for (int i = 0; i < 4; i++) {
            totalscore += stepscore[i];
        }
        return totalscore;
    }

    void printInfo() {
        System.out.println(this.firstName + " " + this.lastName + " " + computeTotal());
    }
}

class Undergraduate extends Student1 {
    public int id;
    private String steplevel;
    private boolean engPass;
    Undergraduate(int id, String firstname, String lastname) {
        super(firstname, lastname);
        this.id = id;
        this.steplevel = "";
        this.engPass = false;
    }

    String computeLevel() {
        if (super.computeTotal() >= 76 && super.computeTotal() <= 100) {
            this.engPass = true;
            this.steplevel = "B2";
        } else if (super.computeTotal() >= 101 && super.computeTotal() <= 120) {
            this.engPass = true;
            this.steplevel = "C1";
        }
        if (super.computeTotal() >= 1 && super.computeTotal() <= 25) {
            this.steplevel = "A1";
            this.engPass = false;
        } else if (super.computeTotal() >= 26 && super.computeTotal() <= 50) {
            this.steplevel = "A2";
            this.engPass = false;
        } else if (super.computeTotal() >= 51 && super.computeTotal() <= 75) {
            this.steplevel = "B1";
            this.engPass = false;
        } else if (super.computeTotal() < 1 || super.computeTotal() > 120) {
            for (int i = 1; i <= 4; i++) {
                super.setTestScore(i, 0);
            }
            this.steplevel = "NA";
            this.engPass = false;
        }
        return this.steplevel;
    }

    @Override
    void printInfo() {
        System.out.print(id + " ");
        super.printInfo();
        if (this.engPass || computeLevel().contains("B2") || computeLevel().contains("C1")) {
            System.out.println("Pass " + computeLevel());
        } else {
            if(computeLevel().contains("NA")){
                System.out.println("Invalid score " + computeLevel());
            }
            else{
                System.out.println("Not pass " + computeLevel());
            }
        }
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Undergraduate> un = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            String fname = sc.next();
            String lname = sc.next();
            un.add(new Undergraduate(id, fname, lname));
            for (int j = 1; j <= 4; j++) {
                int score = sc.nextInt();
                un.get(i).setTestScore(j, score);
            }
        }
        boolean found = false;
        int rosterId = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (un.get(i).id == rosterId) {
                un.get(i).printInfo();
                for (int j = 1; j <= 4; j++) {
                    System.out.print(un.get(i).getTestScore(j) + " ");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        sc.close();
    }
}
