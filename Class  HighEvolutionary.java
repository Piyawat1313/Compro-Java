import java.util.Scanner;

public class HighEvolutionary {
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int sum4 = 0;
    int Evolution1(int w, int x, int y, int z){
        this.sum1 = (w + x) - y * z;
        return sum1; 
    } 
    int Evolution2(int w, int x, int y, int z){
        this.sum2 = w + x - (y * z);
        return sum2;
    } 
    int Evolution3(int w, int x, int y, int z){
        this.sum3 = w + (x - y) * z;
        return sum3;
    }
    int Evolution4(int w, int x, int y, int z){
        this.sum4 = ((w + x) - y) * z;
        return sum4;
    }
    int MAX(){
        int max = Integer.MIN_VALUE;
        if(this.sum1 > max){
            max = sum1;
        }
        if(this.sum2 > max){
            max = sum2;
        }
        if(this.sum3 > max){
            max = sum3;
        }
        if(this.sum4 > max){
            max = sum4;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        HighEvolutionary h = new HighEvolutionary();
        System.out.println(h.Evolution1(w, x, y, z) + " " + h.Evolution2(w, x, y, z) + " " + h.Evolution3(w, x, y, z) + " " + h.Evolution4(w, x, y, z));
        System.out.println(h.MAX());
        sc.close();
    }
}
