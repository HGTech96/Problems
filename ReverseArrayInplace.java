public class ReverseArrayInplace {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,1};
        reverseArray(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

    }

    public static void reverseArray(int [] array) {
        int i = 0;
        int j = array.length-1;
        int tmp;
        for (i = 0; i < array.length/2; i++) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            j--;
        }
    }
}
