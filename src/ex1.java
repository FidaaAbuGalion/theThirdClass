import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int size =10;
        int content =4;
      int array [] =  createArray(10,4);

        for ( int i =0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }

    public static int[] createArray(int size, int content) {
        int[] array = new int[size];

        for (int i =0; i< array.length;i++){
            array [i]= content;

        }
return array;
    }
}