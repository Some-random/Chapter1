/**
 * Created by dongweij on 2015/8/12.
 */
public class Problem5 {
    public static String compress(String str) {
        StringBuffer temp = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            int count = 1;
            while(i + 1 < str.length() && str.charAt(i + 1) == str.charAt(i)) {
                count++;
                i++;
            }
            temp.append(str.charAt(i));
            temp.append(count);
        }
        return temp.toString().length() > str.length() ? str : temp.toString();
    }

    //Notice the use of StringBuffer
    public static void main(String[] args) {
        String str = "abbccccccde";
        String compressedstr = compress(str);
        System.out.println(compressedstr);
    }
}
