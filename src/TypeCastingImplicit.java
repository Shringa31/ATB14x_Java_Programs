public class TypeCastingImplicit {
    public static void main(String[] args) {
        int val = 300;
//        byte b = val; // Narrowing implicit casting ,not valid
        byte b = (byte)val;  // Narrowing with explicit casting , which is valid

        System.out.println(b);
    }
}
