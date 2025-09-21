public class MaxOfNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = -1;

        int result =  (a > b) ? (a > c ? a :  c):(b > c ? b:c) ;
        System.out.println(result);
    }
}
