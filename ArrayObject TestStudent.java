import java.util.Scanner;

class Student {
    String firstName;
    String lastName;
    private int[] score;
    int totalScore = 0;

    Student(String name, String lastName) {
        this.firstName = name;
        this.lastName = lastName;
        this.score = new int[4];
    }

    int getTestScore(int num) {
       return score[num];
    }

    void setTestScore(int num, int point) {
        score[num] = point;
    }

    int computeTotal() {
        for (int i = 0; i < 4; i++) {
            totalScore += score[i];
        }
        return totalScore;
    }

    void printInfo() {
        System.out.println(this.firstName + " " + this.lastName + " " + computeTotal());
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        Student student[] = new Student[N];
        for (int i = 0; i < N; i++) {
            String firstName = sc.next();
            String lastname = sc.next();
            student[i] = new Student(firstName, lastname);
            for (int j = 1; j <= 4; j++) {
                int score = sc.nextInt();
                student[i].setTestScore(j - 1, score);
            }
            student[i].printInfo();
        }
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int numTest = sc.nextInt();
            int score = sc.nextInt();
            int scoreTest = student[numTest - 1].getTestScore(score - 1);
            System.out.println(scoreTest);
        }
        sc.close();
    }
}
