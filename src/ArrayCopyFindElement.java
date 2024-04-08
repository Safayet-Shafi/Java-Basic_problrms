import java.util.Arrays;

public class ArrayCopyFindElement {
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
}
