public class ex29 {
    public static void main(String[] args) {
        int [] array = theGreaterArray(10,8);
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+ ",");

        }
    }

    public static int [] theGreaterArray (int size,int content) {
    int array [] = new int[size];
    for (int i=0;i< array.length ;i++){
        array [i]= content+=3;
    }

    return array;

    }
}
