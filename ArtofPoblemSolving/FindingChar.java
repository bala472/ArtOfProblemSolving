import java.util.Scanner;

class FindingChar {
    public static void main(String[] args) {
        System.out.println("Enter a word (eg. Hello) : ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println("Enter a single character to search in the word (eg. l): ");
        String search = in.nextLine();
        FindingChar obj = new FindingChar();
        System.out.println("Result : "+obj.isContainsChar(word,search.charAt(0)));
    }
    public boolean isContainsChar(String str,char i){
        if(str.charAt(0)==i){
            return true;
        }
        if(str.length()<=1){
            return false;
        }
        return  isContainsChar(str.substring(1), i);
    }
}
