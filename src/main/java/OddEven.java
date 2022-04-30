public class OddEven {

    public String OddEven(long number){

        if (number % 2 != 0 && number < Integer.MAX_VALUE && number > Integer.MIN_VALUE) {
            return "Odd";
        } else if (number % 2 == 0 && number < Integer.MAX_VALUE && number > Integer.MIN_VALUE){
            return "Even";
        } else
            return "Undefined";
        }
    }
