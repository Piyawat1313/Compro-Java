import java.util.Scanner;
class balance{
    int Bal = 10000;
    int check(int money){
        if(money == 0){
            return 0;
        }
        else if(money < 0){
            return -1;
        }
        else{
            return money;
        }
    }
    void deposit(int money){
        money += Bal;
         System.out.println(money);
    }
}
public class Account3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        balance b = new balance();
        int result = b.check(money);
        if(result == 0){
            System.out.println("Error");
        }
        else if(result < 0){
            System.out.println("Error");
        }else{
             b.deposit(money);
        }
        sc.close();
    }
}
