import java.util.Scanner;

public class TrainCharacter {
    public static void main(String[] args) {
        System.out.println("Enter string of odd length (eg. red) : ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
      //  String input = "train";
        if(input.length()%2==0){
            System.out.println("Invalid input");
        }
        else{
            String first ="";
            String second="";
            for(int i =0;i<=input.length()/2 ;i++){
                for(int j=input.length()/2+1-i;j>=1;j--){
                    first = first + input.charAt(i);
                    if(i!=input.length()/2){
                        second = input.charAt(input.length()-1-i)+second;
                    }
                }
            }
            System.out.println(first+second);
        }

    }
}
