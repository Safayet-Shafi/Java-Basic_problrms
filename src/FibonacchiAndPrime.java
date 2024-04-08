public class FibonacchiAndPrime {
    void printFiboNacchi(int count){
        int n1=0,n2=1,n3;
        for(int i =0;i<count;i++){
            System.out.print(n1 + " ");
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }
    }
    boolean checkPrime(int num){
        if(num<=1){
            return  false;
        }
        for(int i=2;i<=num;i++){
            if(num % i == 0){
                return  false;
            }
            else return true;
        }
        return true;
    }
}
