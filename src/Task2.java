import java.util.List;

public class Task2 {
    List<Integer> listInteger;

    public static void main(String[] args) {
        int[][] array = {{1, 0, 1},
                {1, 0, 1},
                {1, 0, 1, 1},
                {1, 0, 1}};

        int[][] array1 = {{1, 0, 1},
                {1, 123, 1},
                {1, 0, 1}};
        int[][] array2 = {{1, 0, 1},
                {1, 0, 1},
                {1, 0, 1}};
//        System.out.println(sumArray(array));
//        System.out.println(sumArray(array1));
        System.out.println(sumArray(array));
    }
    public static int sumArray(int[][] array){
        int sum = 0;
        for (int[] arr : array) {
            if(array.length != arr.length)
                throw new RuntimeException("Массив не квадратный, размеры массива: "
                        + array.length + " x " + arr.length);
            for (int i : arr) {
                // 0
                if(i != 0 && i != 1)
                    throw new RuntimeException("Элемент не равен 0 и не равен 1, значение: " + i);
                sum += i;
            }

        }
        return sum;
    }
}
