package Compositionjava;
import java.util.Scanner;
class Course{
    String subject;
    int countStu;
    int[] data;
    int count;
    boolean check;
    Course(String sub, int countStu){
        this.subject = sub;
        this.countStu = countStu;
        this.count = 0;
        this.data = new int[countStu];
    }
    boolean enroll(int id){
        for (int i = 0; i < count; i++) {
            if(data[i] == id){
                return false;
            }
        }
        if(count < countStu){
            data[count] = id;
            count++;
            return true;
        }
        return false;
    }
    void printInfo(){
        System.out.println(this.subject + " " + this.count);
        for (int i = 0; i < count; i++) {
            System.out.println(data[i]);
        }
    }
}
public class Enrollment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        int N = sc.nextInt();
        Course C = new Course(sub, N);
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int id = sc.nextInt();
            System.out.println(C.enroll(id));
        }
        C.printInfo();
        sc.close();
    }
}
