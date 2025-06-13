// package Compositionjava;

import java.util.Scanner;

class Blade {
    int size;
    int number;
    int angle;
    double hp;
    boolean valid;

    Blade(int size, int number, int angle, double hp) {
        this.size = size;
        this.number = number;
        this.hp = hp;
        this.angle = angle;
        this.valid = true;
        if ((size % 2 == 0) && (size >= 16 && size <= 24) && (number >= 3 && number <= 5)
                && !(angle == 27 || angle == 30 || angle == 33 || angle % 2 == 1) && (hp >= 1)) {
            valid = true;
        } else {
            if (size % 2 == 1 || size < 16 || size > 24) {
                System.out.println("invalid size");
                valid = false;
            }
            if (number < 3 || number > 5) {
                System.out.println("invalid number of blades");
                valid = false;
            }
            if ((angle != 27 && angle != 30 && angle != 33)) {
                System.out.println("invalid angle");
                valid = false;
            }
            if (hp < 0) {
                System.out.println("invalid horsepower");
                valid = false;
            }

        }
    }

    void printInfo() {
        System.out.println(this.size + " " + this.number + " " + this.angle + " " + this.hp + " " + this.valid);
    }
}

class Motor {
    double V; // แรงดัน
    double I; // กระแส
    double eff; // ประสิทธิภาพ

    Motor(double V, double I, double eff) {
        this.V = V;
        this.I = I;
        this.eff = (eff / 100);
    }

    Motor(double I, double eff) {
        this(220, I, eff);
    }

    double horsepower() {
        return (V * I * eff) / 746;
    }

    void printInfo() {
        System.out.printf(this.V + " " + this.I + " " + this.eff + " " + String.format("%.2f", horsepower()));
    }
}

class ElectricFan {
    int productID;
    Blade blade;
    Motor motor;
    boolean status;
    static int count;

    ElectricFan(Blade blade, Motor motor) {
        ElectricFan.count++;
        this.productID = count;
        this.blade = blade;
        this.motor = motor;
        if (motor.horsepower() >= blade.hp) {
            this.status = true;
        } else {
            this.status = false;
        }
    }

    boolean changeBlade(Blade blade) {
        this.blade = blade;
        if (motor.horsepower() >= blade.hp) {
            this.status = true;
        } else {
            this.status = false;
        }
        return this.status;
    }

    boolean changeMotor(Motor motor) {
        this.motor = motor;
        if (motor.horsepower() >= blade.hp) {
            this.status = true;
        } else {
            this.status = false;
        }
        return this.status;
    }

    void printInfo() {
        System.out.println(
                this.productID + " " + blade.size + " " + blade.hp + " " + String.format("%.1f", motor.I) + " " + String.format("%.2f", motor.horsepower()) + " " + this.status);
    }
}

public class FanCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size, numb, angle;
        double hp, v, i, eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan = null;
        for (int index = 0; index < n; index++) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan = new ElectricFan(ablade, motor);
            } else if (cmd == 1) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                eFan.changeBlade(ablade);
            } else if (cmd == 2) {
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }
        sc.close();
    }
}
