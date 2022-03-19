package array;

import java.util.Arrays;
import java.util.List;

public class LoopTypesMain {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jack", "Jane", "Jim");

        List<Integer> numbers = Arrays.asList(1,2,1,2,3,1, 1);
        for(int i = 0; i < numbers.size()-1; i++){
            if(numbers.get(i)< numbers.get(i+1)){
                System.out.println("nő");
            }
            else if (numbers.get(i ) > numbers.get(i+ 1)){
                System.out.println("csökken");
            }
            else{
                System.out.println("nem változik");
            }

        }

    }
}
