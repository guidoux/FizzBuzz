package fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {}

    public FizzBuzz() {}

    public String doFizzBuzz(int input) {
        String result;
        if (input % 3 == 0) {
            result = "Fizz";
        }
        else {
            result = Integer.toString(input);
        }
        return result;
    }
}
