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

class Saving extends Account {
    String id;
    String tel;
    boolean prompay;

    Saving(String name, String code, double balance) {
        super(name, code, balance);
        this.prompay = false;
        System.out.println("Saving account");
    }

    boolean openPromptPay(int num1, String num2) {
        if (num1 == 1 && num2.length() == 13) {
            this.id = num2;
            this.prompay = true;
            return true;
        } else if (num1 == 2 && num2.length() == 10) {
            this.tel = num2;
            this.prompay = true;
            return true;
        }
        return false;
    }

    @Override
    void printInfo() {
        super.printInfo();
        if (this.prompay) {
            System.out.print("PromptPay");
            if (this.id != null && !this.id.isEmpty()) {
                System.out.print(", " + this.id);
            }
            if (this.tel != null && !this.tel.isEmpty()) {
                System.out.print(", " + this.tel);
            }
            System.out.println();
        } else {
            System.out.println("no PromptPay");
        }
    }
}

public class BankAccount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String code = sc.nextLine();
        double money = sc.nextDouble();
        Saving saving = new Saving(name, code, money);
        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    saving.printInfo();
                    break;
                case 2:
                    System.out.println(saving.checkBalance());
                    break;
                case 3:
                    saving.closeAccount();
                    break;
                case 4:
                    double moneyD = sc.nextDouble();
                    System.out.println(saving.deposit(moneyD));
                    break;
                case 5:
                    double money2 = sc.nextDouble();
                    System.out.println(saving.withdrawn(money2));
                    break;
                case 6:
                    int num1 = sc.nextInt();
                    String data = sc.nextLine().strip();
                    System.out.println(saving.openPromptPay(num1, data));
                    break;
            }
        }
        sc.close();
    }
}
