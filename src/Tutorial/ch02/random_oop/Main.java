package Tutorial.ch02.random_oop;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Randoms r1 = new Randoms(1000);
        r1.print();
        r1.upsort();
        r1.print();
        r1.downsort();
        r1.print();
        r1.getMaxNumber();
        r1.getMinNumber();
        r1.getRank();
    }
}
class Randoms{
    final int MAX_NUM = 10000;
    int max;
    ArrayList<Integer> arr = new ArrayList<>();
    public Randoms(int m) {
    max = m;
    Random rnd = new Random();
    for(int i = 0; i < max; i++){
        int rnd_num = rnd.nextInt(max) + 1;
        arr.add(rnd_num);
    }
    }
    public void print(){
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
   public void upsort(){
       Collections.sort(arr);
   }
   public void downsort(){
        Collections.sort(arr , Collections.reverseOrder());
   }
   public void getMaxNumber(){
       int Max = Collections.max(arr);
       System.out.println(Max);
   }
   public void getMinNumber(){
       int Min = Collections.min(arr);
       System.out.println(Min);
   }
   public ArrayList<Integer> getRank(){
        ArrayList<Integer> rnk = new ArrayList<>();
        int[] data = new int[max];
        int[] Rank = new int[max];

        for(int i : arr){
            int idk = 0;
            data[i] = idk;
            idk++;
        }
        for(int i = 0; i <= max; i++){
            Rank[i] = 1;
            for(int j = 0; ;){

            }
        }

        return rnk;
   }
}