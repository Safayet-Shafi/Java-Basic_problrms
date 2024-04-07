public class Palindrome {
    //String Reverse and String palimdrome
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

    //Number Reverse and String Number
    // 3/10 = 0
    // 3%10 = 3
    public boolean palindromeNumber(int Num){
        int n1=Num;
        int n2=0;
        int reminder;
        while (Num !=0){
            reminder=Num%10;
            n2=n2*10+reminder;
            Num=Num/10;

        }
        if(n1 == n2){
            return true;
        }
        else
            return false;
    }

}
