import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        System.out.println("please enter positive number for sequence generation ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input<1){
            System.out.println("Input Invalid ");
        }else{
            ArrayList<Integer> result = new ArrayList<>();
            while (input>1) {
                if(input%2==0){
                    result.add(input);
                    input = input/2;
                }
                else{
                    result.add(input);
                    input = 3*input +1;
                }
            }
            result.add(1);
            System.out.println(result);
        }
       
    }
    
}