import java.util.Arrays;

public class ArrayCopyFindFrequency {
    public int [] copyArray(){
        int a1[]={9,8,5,2,4};
        int a2[]=new int[a1.length];
        for(int i=0;i<a1.length;i++){
            a2[i]=a1[i];
        }
        return a2;
    }

    //Parameter and Argument Pass in array
    public int [] copyArray2(int [] arr){

        int a2[]= Arrays.copyOf(arr, arr.length);
        return a2;
    }

    //Find Frequency Of An Array

    public void findFrequency(){
        int arr[]={1, 2, 8, 3, 2, 2, 2, 5, 1};
        int fr[]=new int[arr.length];
        int visited =-1;
        for(int i =0;i<arr.length;i++){
            int count =1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited)
                fr[i]=count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }
}
