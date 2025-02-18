import java.util.Scanner;

class Blade {
    int size;
    int propeller;
    int angle;
    double hp;
    boolean valid = true;

    public Blade(int size, int numb, int angle, double hp) {    
        if (size < 16 || size > 24 || size % 2 != 0) {
            System.out.println("invalid size");
            valid = false;
        }
        if (numb != 3 && numb != 4 && numb != 5) {
            System.out.println("invalid number of blades");
            valid = false;
        }
        if (angle != 27 && angle != 30 && angle != 33) {
            System.out.println("invalid angle");
            valid = false;
        }
        if (hp < 0) {
            System.out.println("invalid horsepower");
            valid = false;
        }
        this.size = size;
        this.propeller = numb;
        this.angle = angle;
        this.hp = hp;

    }

    void printInfo() {
        System.out.print(size + " " + propeller + " " + angle + " " + hp + " " + valid);
    }
}

class Motor {
    double Vector;
    double Electric;
    double eff;
    double HP;

    Motor(double V, double I, double eff) {
        this.Vector = V;
        this.Electric = I;
        this.eff = (eff / 100);

    }

    Motor(double I, double eff) {
        this(220, I, eff);
    }

    double horsepower() {
        return HP = (Vector * Electric * eff) / 746;
    }

    void printInfo() {
        double hp = horsepower();
        System.out.println(Vector + " " + Electric + " " + eff + " " + String.format("%.2f", hp));
    }
}

class ElectricFan {
    int productID;
    Blade blade;
    Motor motor;
    boolean status;
    static int count = 0;
    ElectricFan(Blade blade, Motor motor){
        count++;
        this.productID = count;
        this.blade = blade;
        this.motor = motor;
        this.status = (motor.horsepower() >= blade.hp);
    }
    boolean changeBlade(Blade blade){
        this.blade = blade;
        this.status = (motor.horsepower() >= blade.hp);
        return status;
    }
    boolean changeMotor(Motor motor){
        this.motor = motor;
        status = (motor.horsepower() >= blade.hp);
        return status;
    }
    void printInfo(){
        String P = String.format("%.2f",motor.HP);
        System.out.println(String.format(productID  + " " + blade.size + " " + blade.hp + " "  + motor.Electric +  " " + P + " " +  status));
    }
}

public class Fancompany3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int size,numb,angle;
    double hp,v,i,eff;
    Blade ablade = null;
    Motor motor = null;
    ElectricFan eFan= null;
    for(int index=0;index<n;index++){
    int cmd = sc.nextInt();
    if (cmd==0){
    size = sc.nextInt();
     numb = sc.nextInt();
    angle = sc.nextInt();
    hp = sc.nextDouble();
    ablade = new Blade(size,numb,angle,hp);
    v = sc.nextDouble();
    i = sc.nextDouble();
    eff = sc.nextDouble();
    motor = new Motor(v,i,eff);
    eFan = new ElectricFan(ablade, motor);
    }else if(cmd==1){
    size = sc.nextInt();
    numb = sc.nextInt();
    angle = sc.nextInt();
    hp = sc.nextDouble();
    ablade = new Blade(size,numb,angle,hp);
    eFan.changeBlade(ablade);
    }else if(cmd==2){
    v = sc.nextDouble();
    i = sc.nextDouble();
    eff = sc.nextDouble();
    motor = new Motor(v,i,eff);
    eFan.changeMotor(motor);
    }
    eFan.printInfo();
    }
 }

}
