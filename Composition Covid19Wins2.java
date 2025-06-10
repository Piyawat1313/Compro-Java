package Compositionjava;
import java.util.ArrayList;
import java.util.Scanner;

class Visitation {
    int IDLocation;
    int date;
    int time = 0; // แทนว่าไปกี่นาฬิกา
    int[] lcx = new int[24];
    int count = 0;

    Visitation(int id, int date) {
        this.IDLocation = id;
        this.date = date;
    }

    void visit(int time) {
        if (time < 0 || time > 23) {
            System.out.println("invalid hour: " + time);
            return;
        }
        this.lcx[time]++;   //วิธีการอัปเดตค่าที่เก็บเข้ามาในช่องนั้น
        //System.out.println(this.lcx[time]);
    }

    int count() {
        this.count = 0;
        for (int i = 0; i < lcx.length; i++) {
            count += this.lcx[i];
        }
        return count;
    }

    void printVisitHours(String visit) {
        System.out.println(visit);
        System.out.println(this.date);
        if (count() == 0) {
            System.out.println("no visit");
        }
        else{
            System.out.println(count());
        }
        for (int i = 0; i < lcx.length; i++) {
            if (this.lcx[i] > 0) {
               System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
class Person{
    String name;
    ArrayList<Visitation> v2 = new ArrayList<>();   //เก็บวัตถุของ Visition
    Person(String name){
        this.name = name;
    }
    void addVisitation(Visitation visit){
        if(visit.count() == 0){
            return;     //return ออกไป
        }
            v2.add(visit);  //แอดวัตถุที่ใช้เรียก method
    }
    void printAllVisitations(String[] location){
        int L = this.v2.size();     //เก็บขนาดของอาเรย์ลิสของวัตถุ
        System.out.println(L);      
        for (int i = 0; i < L; i++) {
            Visitation visitation = this.v2.get(i);     //สร้างตัวแปรวัตถุ เก็บค่าที่อยู่ในอาเรย์ลิส
            String name = location[visitation.IDLocation];  //ตัวแปร name เก็บ ชื่อที่ตรงกับ รหัสของที่นั้น
            visitation.printVisitHours(name);   //ส่งค่าขึ้นไปหา Visition
        }
    }
}
public class Covid19Wins2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] name = new String[301];    //String ขนาดเกิน 300
        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            String namString = sc.next();
            name[id] = namString;   //เก็บค่าชื่อที่ช่องรหัสนั้น
        }
        String person = sc.next();
        Person p = new Person(person);  //ส่งชื่อคนเข้า Person
        int nn = sc.nextInt();
        for (int i = 0; i < nn; i++) {
            int id = sc.nextInt();
            int date = sc.nextInt();
            int k = sc.nextInt();
            Visitation V = new Visitation(id, date);        //ส่ง รหัส วันที่เข้า Visitation
            for (int j = 0; j < k; j++) {
                int hour = sc.nextInt();    //รับเวลาใช้สถานที่นั้น
                V.visit(hour);      //ส่งค่าขึ้นไปหา method ของ Visitation
            }
            p.addVisitation(V);     //ส่งวัตถุขึ้นไปหา Person
        }
        p.printAllVisitations(name);    //ส่งอาเรย์ที่เก็บชื่อเข้าไปที่ method Person
        sc.close();
    }
}
