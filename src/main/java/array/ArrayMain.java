package array;

public class ArrayMain {

    public static void main(String[] args) {
        /*
        String[] days = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
       // System.out.println(days[1]);  //a tömb 2. elemének kiírása

        int[] numbers = new int [5];
        numbers[0] = 1;

        for(int i = 1; i < numbers.length; i++){
            numbers[i] = numbers[i -1] * 2;  // az új szám = az előző szám * 2
            System.out.print(numbers[i] + " ");  //nem adja vissza a legelső számot, az 1-et, kell még egy ciklus.
        }
        System.out.println();

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

         */

        boolean[] array = new boolean[6];
        array[0] = false;
        for( int i = 0; i < array.length-1; i++){
            if(array[i] == false){
                array[i+1]= true;
            } else{
                array[i+1]= false;
            }
            System.out.print(array[i] + " ");

        }


    }
}
