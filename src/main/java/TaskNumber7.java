public class TaskNumber7 {

    public String TaskNumber7Algoritm(int number){

        String help = "-1";
        if(number % 3 == 0 && number % 5 == 0){
            return "Good Number";
        } else if (number % 3 == 0 && number % 5 !=0){
            return "Bad Number";
        } else if (number % 3 != 0 && number % 5 == 0){
            return "Pure Number";
        } else return help;
    }
}
