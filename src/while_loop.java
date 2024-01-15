import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        float[] grades = new float[4];
        Scanner user_input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter grade " + (i + 1));
            grades[i] = user_input.nextFloat();
        }
        float average = 0;
        for (float j : grades) {
            average = average + j;
        }
        float maximum = 0;
        float current_maximum = 0;
        for (float j : grades) {
            if (j > maximum) {
                maximum = j;
            } else {
                maximum = maximum;
            }
        }
            average = average / grades.length;

            System.out.println("Average is: " + average);
            System.out.println("Maximum is: " + maximum);
        }
    }
