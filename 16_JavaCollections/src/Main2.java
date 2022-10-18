import java.util.Arrays;

/*
 * @author kubilaycakmak
 * @date Oct 18, 2022
 * @version 1.0
 */
 
public class Main2 {
    public static void main(String[] args) {

        // Single dimension Array
        int[] number = {1,2,3,4,5};
        String[] strArr = {"Hello", "Hola", "Merhaba"};
        float[] floatArr = {0.0f, 0.1f, 0.2f};
        boolean[] booleanArr = {false, true};

        int[] intArr2 = new int[3];
        int[] intArr3 = new int[3];

        // intArr2[0] = 10;
        // intArr2[1] = 15;
        int fillValue = 20;

        // Fill array
        Arrays.fill(intArr3, fillValue);
        Arrays.fill(intArr2, fillValue);
        System.out.println(Arrays.toString(intArr2));

        // compare
        System.out.println(Arrays.compare(intArr2, intArr3));

        // Multi dimension Array
        int[][] multiDimensionArr = {{1,2,3}, {4,5,6}};
        // multiDimensionArr[0][0] = 1;
        // multiDimensionArr[0][1] = 2;
        // multiDimensionArr[0][2] = 3;
        // multiDimensionArr[1][0] = 4;
        // multiDimensionArr[1][1] = 5;
        // multiDimensionArr[1][2] = 6;

        // System.out.println(Arrays.toString(number));
        // System.out.println(Arrays.toString(strArr));
        // displayArr(strArr);
        // displayArr(number);
        // displayMultiDimentionArr(multiDimensionArr);
    }

    public static void displayArr(String[] str){

        for(String element: str){
            System.out.println(element);
        }
    }

    public static void displayArr(int[] intArr){

        for(int element: intArr){
            System.out.println(element);
        }
    }

    public static void displayMultiDimentionArr(int[][] intArr){
        for(int i = 0; i <= intArr.length; i++){
            for(int j = 0; j <=  intArr.length; j++){
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
