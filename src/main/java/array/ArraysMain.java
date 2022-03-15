package array;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);

    }

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[]firstArray, int[]secondArray){
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
    }

    public boolean wonLotteryWithoutModify(int[]firstArray, int[]secondArray){
        int[] newFirstArray = Arrays.copyOf(firstArray, firstArray.length);
        int[] newSecondArray = Arrays.copyOf(secondArray, secondArray.length);
        Arrays.sort(newFirstArray);
        Arrays.sort(newSecondArray);
        return Arrays.equals(newFirstArray, newSecondArray);
    }


    public static void main(String[] args) {

       ArraysMain arraysMain = new ArraysMain();
       System.out.println(arraysMain.numberOfDaysAsString());

       System.out.println(arraysMain.multiplicationTableAsString(4));

        System.out.println(arraysMain.sameTempValues(new double[] {11.8, 19.3, 20.9}, new double[] {11.8, 19.3, 20.9}));
        System.out.println(arraysMain.sameTempValues(new double[] {11.8, 19.3, 20.9}, new double[] {11.9, 17.3, 22.9}));

        System.out.println(arraysMain.wonLotteryWithoutModify(new int[] {90, 87,45, 36,9}, new int[]{9, 36, 87, 45, 90}));
        System.out.println(arraysMain.wonLotteryWithoutModify(new int[] {19, 88,45, 37,9}, new int[]{9, 36, 87, 45, 90}));

    }
}
