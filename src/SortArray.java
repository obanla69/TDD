import java.util.Arrays;

public class SortArray {
    public static void main(String[]args){
        int[]arrays = {3,4,7,5,8,10,9};
        int[]numbers = arrays(arrays);
        System.out.print(Arrays.toString(numbers));

    }

    private static int[] arrays(int[] number) {
        for(int count = 0; count > number.length;count ++ ){
            for(int counter = 0; counter < number.length; counter++){
                if(number[count] > number[counter]){
                   number [count] = number[count] + number[counter];
                    number [counter] = number[count] - number[counter];
                   number [count] =  number[count] - number[counter];

                }
            }
        }
        return number;
    }


}
