import java.util.Scanner;
public class Rhombus {
    /*How to  repare Function
    public static ตามด้วยชื่อ Function(ข้างในนี้ประกอบไปด้วย parameter ที่จะส่งค่าเข้าไป){
        ในนี้ประกอบไปด้วยโค้ดที่ทำการสร้างฟังก์ชั่น....
    }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: " + " ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.print("None");
            return;
        }
        char[][] state = new char[number][number];          // datatype [][] name = new datatype [size][size]
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                state[i][j] = ' ';
            }
        }
        for(int i = 0; i <= number / 2; i++){
            for(int j = i; j < number - i; j++){
                state[i][j] = '*';
            }
        }
        for(int i = number / 2 + 1; i < number; i++){
            for(int j = number - i - 1; j <= i; j++){
                state[i][j] = '*';
            }
        }
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                System.out.print(state[i][j]);
            }
            System.out.println(" ");
        }
    }
}
