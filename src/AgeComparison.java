public class AgeComparison {
    public static void main(String[] args) {
        int age = 25;

        String result = (age < 18) ? "Minor"
                      : (age <= 59) ? "Adult"
                      :  "Senior citizen" ;


        System.out.println(result);
    }
}
