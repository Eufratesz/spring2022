package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source){
        for(int i = 0; i < source.length; i++){
            System.out.println(source[i] + " index: " + i);
        }
    }

    public void concatenateIndexToWord(String[] source){
        for(int i = 0; i < source.length; i++){
            System.out.print("index: " + i + " szó: " + source[i] + ", ");
        }
    }

    public static void main(String[] args) {
        ArrayHandler handler =new ArrayHandler();
        handler.addIndexToNumber(new int[] {100, 30, 89, 16, 99});

        handler.concatenateIndexToWord(new String[] {"baba", "autó", "maci", "kutya"});

    }
}
