package Compositionjava;

import java.util.Scanner;
class Encoder{
    String[] wordContence;
    int[] numberID;
    Encoder(String[] word, int[] num){
        this.wordContence = word;
        this.numberID = num;
    }
   private int encodeWord(String word){
        for (int i = 0; i < numberID.length; i++) {
            if(this.wordContence[i].equals(word)){
                return numberID[i];
            }
        }
        return -1;
    }
    int[] encodeMsg(String[] word){
        int[] arr = new int[word.length];
        for (int i = 0; i < word.length; i++) {
            arr[i] = encodeWord(word[i]);
        }
        return arr;
    }
}
class Decoder{
    String contence[];
    int[] numberCode;
    Decoder(String[] con, int[] number){
        this.contence = con;
        this.numberCode = number;
    }
    private String decodeWord(int num){
        for (int i = 0; i < this.numberCode.length; i++) {
            if(this.numberCode[i] == num){
                return this.contence[i];
            }
        }
        return "?";
    } 
    String decodeMsg(int[] code){
        String msg = "";
        for (int i = 0; i < code.length; i++) {
            msg += decodeWord(code[i]) + " ";
        }
        return msg;
    }
}
public class EnDecoder2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String name[] = new String[N];
        int[] ID = new int[N];
        for (int i = 0; i < N; i++) {
            name[i] = sc.next();
        }
        for (int i = 0; i < N; i++) {
            ID[i] = sc.nextInt();
        }
        Encoder E = new Encoder(name, ID);
        Decoder D = new Decoder(name, ID);
        int K = sc.nextInt();
        String newword[] = new String[K];
        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            newword[i] = sc.next();
        }
        arr = E.encodeMsg(newword);
        String msg = D.decodeMsg(arr);
        System.out.print(msg);
        sc.close();
    }
}
