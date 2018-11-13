import java.util.Arrays;

public class PalindromeCheck {

    public  static  boolean isPalindrome(String str) {

        //System.out.println("String is "+str);
    if(str.length()<2){

        return true;
    }

    else{
        //boolean flag = false;
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return ( isPalindrome(str.substring(1, str.length() - 1)));
        } else {
            return false;
        }
    }
    }

    public static void main(String[] args) {
        String str1="abcdef";
        String str2="malayalam";
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr2 = Arrays.copyOfRange(arr,0,2);
        System.out.println("Is string "+str1+" is palindrome : "+isPalindrome(str1));
        System.out.println("Is string "+str2+" is palindrome : "+isPalindrome(str2));
    }
}
