public class Factorial {
    public int findFact(int num){
        int fact =1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    // Factorial With Recursion
    public int factorialRecursion(int num){
        if(num == 0){
            return 1;
        }
        else
            return (num*(factorialRecursion(num-1)));
    }
    //Armstrong NUmber
    public  boolean findArmstrong(int num){
        int originalNum;
        int remainder;
        int result = 0;
        int n = 0;
        originalNum = num;
        //find Digits
        while (originalNum!=0){
            originalNum=originalNum/10;
            n++;
        }

        originalNum = num;
        // Calculate sum of nth power of digits
        while (originalNum!=0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum = originalNum / 10;
        }
        
        // Check if number is equal to the sum of its digits raised to the nth power
        if (result == num)
            return true;
        else
            return false;
    }
}
