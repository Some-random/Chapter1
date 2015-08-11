/**
 * Created by dongweij on 2015/8/12.
 */
public class Problem4 {
    public static void replaceSpace(char[] arr) {
        int i, j;
        for(i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                for(j = arr.length - 1; j >= i + 3; j--) {
                    arr[j] = arr[j - 2];
                }
                arr[i] = '%';
                arr[i + 1] = '2';
                arr[i + 2] = '0';
            }
        }
    }

    //Whenever I met a space in the array, move everything after the space and
    //change the chars in the space position to '%20'
    public static void main(String[] args) {
        String str = "abc d e f";
        char[] arr = new char[str.length() + 3 * 2 + 1];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(arr);
        replaceSpace(arr);
        System.out.println(arr);
    }
}
