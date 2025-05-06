import java.util.Scanner;
class Line{
    void len(String name,int n){
        System.out.println(name);
            for (int j = 0; j < 20; j++) {
                System.out.print("-");
            }
            System.out.println();
    }
}
public class UnderLine1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Line L = new Line();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            L.len(name,n);
        }
        sc.close();
    }
}
