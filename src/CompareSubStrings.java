import java.util.*;
import java.util.stream.Collectors;

public class CompareSubStrings {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        List<String> subStrings = getListOfSubStrings(s, k);
	List<String> outputList = subStrings.stream().sorted().collect(Collectors.toList());
        smallest = outputList.get(0);
	largest = outputList.get(subStrings.size()-1);
        return smallest + "\n" + largest;
    }
    
    static List<String> getListOfSubStrings(String input, int k){
        List<String> subStrings = new ArrayList<>();
        
        for(int i=0; i<input.length(); i++) {
            String subString = "";
            for(int j= i; j<input.length(); j++) {
                subString += input.charAt(j);
                if(subString.length() == k){
                    subStrings.add(subString);
                }
            }
        }
        
        return subStrings;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}