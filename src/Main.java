import java.util.Arrays;
//Duplicate Elements EASY

public class Main {
    public static void main (String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4, 5};
        int index = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[index] = array[i + 1];
                index++;
            }
        }
        System.out.println(index);
        System.out.println(Arrays.toString(array));
    }
}
