public class FindingChar {
    public static void main(String[] args) {
        FindingChar obj = new FindingChar();
        System.out.println(obj.isContainsChar("Yellow",'u'));
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
