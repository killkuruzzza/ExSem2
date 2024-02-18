public class Task0 {
    public static void main(String[] args) {
        int[] test = new int[12];
        System.out.println(checkArray(test, 15));
    }
    public static int checkArray(int[] array, int minLen){
        if(array.length < minLen)
            return -1;
        return array.length;
    }
}
