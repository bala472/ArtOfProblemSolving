import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Enter positive sign number for square finding square root");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int result=1;
        if(input<=0){
            System.out.println("Taking square root not valid for negative numbers and zero");
        }
        else if(input>2){
            for(int i =1 ;i<input;i++){
                if(i*i==input){
                    result=i;
                    break;
                }
                if(i*i>input){
                    result= --i;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}