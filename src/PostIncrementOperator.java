public class PostIncrementOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        /* line  | a | b
        *    3   | 10 | -
        *    4   | 11 | 10 */
    }
}
