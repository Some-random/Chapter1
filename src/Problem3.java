import java.util.HashMap;

/**
 * Created by dongweij on 2015/8/11.
 */
public class Problem3 {
    public static Boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> HMcia = new HashMap<>();
        HashMap<Character, Integer> HMcib = new HashMap<>();
        for(int i = 0; i < a.length(); i++) {
            if(HMcia.containsKey(a.charAt(i))) {
                HMcia.put(a.charAt(i), HMcia.get(a.charAt(i)) + 1);
            }
            else {
                HMcia.put(a.charAt(i), 1);
            }
            if(HMcib.containsKey(b.charAt(i))) {
                HMcib.put(b.charAt(i), HMcib.get(b.charAt(i)) + 1);
            }
            else {
                HMcib.put(b.charAt(i), 1);
            }
        }

        return HMcia.equals(HMcib);
    }

    //Use HashMap to record all the mappings and compare hashmaps to determine whether
    //one string is the permutation of another
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for(int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i][0] + " " + pairs[i][1] + " : " + isPermutation(pairs[i][0], pairs[i][1]));
        }
    }
}
