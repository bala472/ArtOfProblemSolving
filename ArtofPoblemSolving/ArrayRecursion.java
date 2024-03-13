import java.util.Arrays;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr1 =  {4, 15, 40, 99};
        int[] arr2 = {5, 16, 41, 100};
        ArrayRecursion obj = new ArrayRecursion();
        System.out.println(obj.result(arr1, arr2));
    }
    public boolean result(int[] arr1, int[] arr2){
       if(arr1.length==0 || arr2.length==0)
        return false;
       if(arr1[0]+1!=arr2[0])
        return false;
        else if(arr1.length==1||arr2.length==1){
            return true;
        }
        return result(Arrays.copyOfRange(arr1,1,arr1.length),Arrays.copyOfRange(arr2,1,arr2.length));
    }
}
