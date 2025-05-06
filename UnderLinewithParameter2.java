import java.util.Scanner;
class Line{
    void len(String name,int num){
        System.out.println(name);
            for (int j = 0; j < num; j++) {
                System.out.print("-");
            }
            System.out.println();
    }
}
public class UnderLine2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Line L = new Line();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int num = sc.nextInt();
            L.len(name,num);
        }
        sc.close();
    }
}
