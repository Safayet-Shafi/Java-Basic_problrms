public class Palindrome {
    public boolean palindromeString(String word){
//        To Reverse A strig First Need to convert into char array
        String S1 = word,S2="";
        char ch[]=S1.toCharArray();
        for(int i = ch.length-1;i>=0;i--) {
            S2 = S2 + ch[i];
        }
        if(S1.equals(S2)){
            return true;
        }
        else
            return false;
    }
}
