package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"aaa","aa","aaa"};
        StringBuilder result = new StringBuilder();
        //String longString = Arrays.stream(strs).max(Comparator.comparingInt(String::length)).get();
        for(int i=0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            boolean allMatches = false;
            for (String str : strs) {
                if(str.length() >= i+1){
                    if(ch == str.charAt(i))
                        allMatches = true;
                    else{
                        allMatches = false;
                        break;
                    }
                }
                else {
                    allMatches = false;
                    break;
                }
            }
            if(allMatches){
                result.append(ch);
            } else break;
        }

        System.out.println(result);
    }
}
