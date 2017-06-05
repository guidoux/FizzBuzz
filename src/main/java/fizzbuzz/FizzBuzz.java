package fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz();
    }

    public FizzBuzz() {}

    public void fizzBuzz() {
        for(int i=1; i<=100; i++) {
            System.out.println(doFizzBuzz(i));
        }
    }

    public String doFizzBuzz(int input) {
        String result = Integer.toString(input);
        if (input % 3 == 0) {
            result = "Fizz";
        }
        if (input % 5 == 0) {
            if(result == "Fizz") {
                result = "FizzBuzz";
            }
            else {
                result = "Buzz";
            }
        }
        return result;
    }
}
