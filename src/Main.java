public class Main {
    public static void main(String[] args) {
        // Palindrome
        Palindrome obj1= new Palindrome();
//        System.out.println(obj1.palindromeString("ABAS"));
//        System.out.println(obj1.palindromeNumber(456));
        // Fibonacchi And Prime
        FibonacchiAndPrime obj2= new FibonacchiAndPrime();
//        obj2.printFiboNacchi(10);
//        System.out.println(obj2.checkPrime(62));
//       Factorial
        Factorial obj3= new Factorial();
//        System.out.println(obj3.findFact(4));
//        System.out.println(obj3.factorialRecursion(5));
//        System.out.println(obj3.findArmstrong(153));

        //ArraycopyAndFindElement
        ArrayCopyFindFrequency obj4 =new ArrayCopyFindFrequency();
//        int[] result =obj4.copyArray();
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//        int[] result1 =obj4.copyArray2(new int []{8,5,4,7,9});
//        for (int num : result1 ) {
//            System.out.print(num + " ");
//
//          }
//        obj4.findFrequency();
        ArrayDuplicateFind obj5 =new ArrayDuplicateFind();
        obj5.findDuplicateElement1();
    }


}