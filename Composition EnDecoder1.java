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
public class EnDecoder1 {
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
        int K = sc.nextInt();
        String newword[] = new String[K];
        int arr[] = new int[K];
        for (int i = 0; i < K; i++) {
            newword[i] = sc.next();
        }
        arr = E.encodeMsg(newword);
        for (int i = 0; i < K; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
