package Compositionjava;

import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String subject;
    int countStu;
    int[] data;
    int count;
    boolean check;

    Course(String sub, int countStu) {
        this.subject = sub;
        this.countStu = countStu;
        this.count = 0;
        this.data = new int[countStu];
    }

    boolean enroll(int id, ArrayList<Student> students) {
        for (int i = 0; i < count; i++) {
            if (data[i] == id) {
                return false;
            }
        }
        Student check = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                check = students.get(i);    //เก็บข้อมูลของ วัตถุStudent
            }
        }
        if (check == null) {
            System.out.print("Invalid ID ");
            return false;
        }
        if (count < countStu) {
            data[count] = id;
            count++;
            System.out.print(check.name + " " + check.last + " ");
            return true;
        }
        else{
            return false;
        }
    }

    void printInfo() {
        System.out.println(this.subject + " " + this.count);
        for (int i = 0; i < count; i++) {
            System.out.println(data[i]);
        }
    }
}

class Student {
    int id;
    String name;
    String last;

    Student(int id, String name, String last) {
        this.id = id;
        this.name = name;
        this.last = last;
    }

    void printInfo() {
        System.out.println(this.id + " " + this.name + " " + this.last);
    }
}

public class Enrollment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Student> s = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            String last = sc.next();
            sc.nextLine();
            s.add(new Student(id, name, last));
        }
        String sub = sc.nextLine();
        int countStu = sc.nextInt();
        Course C = new Course(sub, countStu);
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int id = sc.nextInt();
            boolean check = C.enroll(id, s);
            System.out.println(check);
        }
        C.printInfo();
        sc.close();
    }
}
