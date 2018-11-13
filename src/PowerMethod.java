public class PowerMethod {

    public static int power(int base, int exp){
        if(exp==0) {
            return 1;
        }  else{
            return base*power(base,exp-1);
        }
    }

    public static void main(String[] args) {
        // run this program by changing the below two values. I have hardcoded a sample pair
        int base =2;
        int exp=5;
        System.out.println("Output is "+power(base,exp));

    }
}
