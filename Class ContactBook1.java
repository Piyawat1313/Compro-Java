import java.util.Scanner;

class ContactBook {
    String[] name;
    String[] tel;

    ContactBook(String[] name, String[] tel) {
        this.name = name;
        this.tel = tel;
    }

    void getAllContact() {
        for (int i = 0; i < name.length; i++) {
            System.out.println(this.name[i] + " " + this.tel[i]);
        }
    }

    void getContact(String name) {
        for (int i = 0; i < this.name.length; i++) {
            if (this.name[i].equals(name)) {
                System.out.println(this.tel[i]);
                return;
            }
        }
        for (int i = 0; i < this.name.length; i++) {
            if (!this.name[i].equals(name)) {
                System.out.println("Invalid contact");
                return;
            }
        }
    }

    static boolean onlyDigits(String telString) {
        if (telString.matches("\\d+")) {    //เช็คตัวเลขไว้ทั้งหมด
            return true;
        }
        return false;
    }

    void editNumber(String nameEdit, String newTel) {
        for (int i = 0; i < name.length; i++) {
            if (this.name[i].equals(nameEdit)) {
                if (newTel.startsWith("0") && newTel.length() <= 10 && onlyDigits(newTel)) {
                    this.tel[i] = newTel;
                    System.out.println(this.name[i] + " new number is " + this.tel[i]);
                    return;
                } else {
                    System.out.println("Invalid number");
                    return;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            if (!this.tel[i].equals(newTel)) {
                System.out.println("Invalid contact");
                return;
            }
        }
    }
}

public class ContactBook1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String name[] = new String[N];
        String tel[] = new String[N];
        for (int i = 0; i < N; i++) {
            name[i] = sc.next();
            tel[i] = sc.next();
        }
        ContactBook con = new ContactBook(name, tel);
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    String A = sc.next();
                    con.getContact(A);
                    break;
                case 2:
                    String newName = sc.next();
                    String newTel = sc.next();
                    con.editNumber(newName, newTel);
                    break;
                case 3:
                    con.getAllContact();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        sc.close();
    }
}
