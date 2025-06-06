import java.util.Scanner;

class Account {
    String name;
    String code;
    double balance;
    boolean active;

    Account(String name, String code, double balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.active = true;
        System.out.println("Open account");
    }
    double checkBalance() {
        return this.balance;
    }

    void closeAccount() {
        this.active = false;
        printInfo();
    }

    boolean deposit(double countMoney) {
        if (this.active) {
            this.balance += countMoney;
            System.out.print(this.balance + " ");
            return true;
        }
        return false;
    }
    void printInfo() {
        if (this.active) {
            System.out.println(this.name + ", " + this.code + ", " + this.balance + ", " + "active");
        } else {
            System.out.println(this.name + ", " + this.code + ", " + this.balance + ", " + "inactive");
        }
    }

    boolean withdrawn(double moneyWith) {
        if (this.active && this.balance >= moneyWith) {
            this.balance -= moneyWith;
            System.out.print(this.balance + " ");
            return true;
        }
        return false;
    }
}

public class BankAccount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String code = sc.nextLine();
        double money = sc.nextDouble();
        Account account = new Account(name, code, money);
        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    account.printInfo();
                    break;
                case 2:
                   System.out.println(account.checkBalance());
                    break;
                case 3:
                    account.closeAccount();
                    break;
                case 4:
                    double moneyD = sc.nextDouble();
                    System.out.println(account.deposit(moneyD));
                    break;
                case 5:
                    double money2 = sc.nextDouble();
                    System.out.println(account.withdrawn(money2));
                    break;

            }
        }
        sc.close();
    }
}
