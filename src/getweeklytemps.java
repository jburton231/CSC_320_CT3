import java.util.Scanner;

public class getweeklytemps {
    public static void main(String[] args){
        String[] weekdays = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        double[] dailyTemps = new double[7];
        double sum = 0;
        Scanner display = new Scanner(System.in);
        while (true){
            System.out.println("1) Enter data");
            System.out.println("2) Display Week");
            System.out.println("3) Exit");
            int userInput = display.nextInt();
            if (userInput == 1){
                Scanner weeklyTemps = new Scanner(System.in);
                for (int i = 0; i < weekdays.length; ++i){
                    System.out.println("Enter " + weekdays[i] + " " + "temp" );
                    dailyTemps[i] = weeklyTemps.nextDouble();

                }
            } else if (userInput == 2) {
                if (dailyTemps[0] == 0){
                    System.out.println("Error array empty");
                }else {
                    for (int i = 0; i < weekdays.length; ++i){
                        System.out.println("Day: " + weekdays[i]);
                        System.out.println("Temp: " + dailyTemps[i]);
                        sum+= dailyTemps[i];

                    }
                    System.out.println("Weekly Average: " + sum/ weekdays.length);
                }
            } else if (userInput == 3) {
                break;
            }
        }
    }
}
