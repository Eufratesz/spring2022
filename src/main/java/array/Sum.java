package array;

public class Sum {

    public void printSums(int[] numbers){
        for(int i = 1 ; i < numbers.length; i ++){
            int sum = numbers[i-1] + numbers[i];
            System.out.print(sum + " ");

        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] numbers = {2, 6, 3, 5, 7, 9};
        sum.printSums(numbers);
    }
}
