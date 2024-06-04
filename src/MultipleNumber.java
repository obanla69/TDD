import java.util.Arrays;

public class MultipleNumber {

        public static int[] elementNumbers( int[]arrays){

            int[] number = new int[arrays.length];
            for(int count = 0; count < number.length;count++){
                number[count] = arrays[count]*2;
            }

          return number;
        }

    }


