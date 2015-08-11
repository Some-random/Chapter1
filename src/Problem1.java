/**
 * Created by dongweij on 2015/8/11.
 */
public class Problem1 {
    public static Boolean isUnique(String s) {
        //pigeonhole theory
        if(s.length() > 128) {
            return false;
        }
        //Notice the difference between boolean and Boolean here!
        boolean[] unique = new boolean[128];
        for(int i = 0; i < s.length(); i++) {
            if(unique[s.charAt(i)]) {
                return false;
            }
            else {
                unique[s.charAt(i)] = true;
            }
        }
        return true;
    }

    //Use boolean array as hashmap
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + " : " + isUnique(word));
        }
    }
}
