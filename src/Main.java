import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String s = "ababa";
        int [] c = {1,2,1,2,1};
        //solution(s,c);
        System.out.println(solution(s,c));

    }

    public static int solution(String s, int[] c) {
        int minimumCost = 0;
        char fChar = ' ' ; char sChar = ' ' ; int fCost = 0; int sCost =0;

        for (int i = 0; i < s.length() -1; i++){
            fChar= s.charAt(i); sChar = s.charAt(i+1);
            if(fChar== sChar){
                fCost = c[i]; sCost = c[i+1];
                if(fCost>sCost){
                    minimumCost+= sCost;
                }else
                    minimumCost+= fCost;
            }
        }
        return minimumCost;
    }
}


    /*    Map<String, Integer> strInt
                = new HashMap<String, Integer>();

       for (int i = 0; i < s.length(); i++) {
            strInt.put(String.valueOf(s.charAt(i)), c[i]);
        }

        for (int i = 0; i < s.length(); i++) {
            if (strInt.containsKey(i) == strInt.containsKey(i++)) {
                if (strInt.get(i) > strInt.get(i++)) {
                    minimumCost += strInt.get(i++);
                } else
                    minimumCost += strInt.get(i);

            }
        }*/


