import java.util.Arrays;

public class IndexNumber {

    public static void main(String[]args){
        int[]arrays = {3,4,7,5,8,10,9};
        int[]numbers = arrays(arrays);
        System.out.print(Arrays.toString(numbers));

    }

    private static int[] arrays(int[] number) {
        for(int count = 0; count < number.length; count++ ){
            for(int counter = 0; counter < number.length;counter++){
                number[count]= number[counter + 1];

            }
        }
        return number;
    }


}
