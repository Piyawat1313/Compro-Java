import java.util.Scanner;

class Ship {
    int capacity;
    Ship(int capacity) {
        if (capacity < 0) {
            capacity = 10;
        } else {
            this.capacity = capacity;
        }
    }
    
    int load(int[] wage, int numCon) {
        int sumcon = 0;
        int start = numCon;
        while (start < wage.length && wage[start] + sumcon <= capacity) {
            sumcon += wage[start];
            start++;
        }
        return start - 1;
    }
}

public class Cerry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Ship ship[] = new Ship[m];
        for (int k = 0; k < m; k++) {
            int cap = in.nextInt();
            ship[k] = new Ship(cap);
        }
        int p1 = 0;
        int[] weight = new int[n];
        for (int j = 0; j < n; j++) {
            weight[j] = in.nextInt();
        }
        int curren = 0;
        int sum_weight = 0;
        for (int i = 0; i < m && curren < n; i++) {
            int last = ship[i].load(weight, curren);
            if(last >= curren){
                for (int j = curren; j <= last; j++) {
                    p1++;
                }
                curren = last + 1;
            }
        }
        System.out.print(p1 + " ");
        for (int j = 0; j < p1; j++) {
            sum_weight += weight[j];
        }
        System.out.println(sum_weight);
        in.close();
    }

}
