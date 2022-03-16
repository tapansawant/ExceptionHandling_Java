public class Practicethrow {

    public static void main(String[] args) {
        int age = 10;
        if(age < 18)
        {
            throw new ArithmeticException("Not Elegible to Vote");
        }
    }
}
