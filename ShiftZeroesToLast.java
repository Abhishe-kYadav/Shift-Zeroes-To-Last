import java.util.*;
public class ShiftZeroesToLast {
    public static void main(String[] args) {
        int arr[]={2,1,0,0,3,4};
        int arr2[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
             arr2[j]=arr[i];
             j++;
           }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
