import java.util.Scanner;

public class loopmod4 {
    public static void main(String[] args) {
        float[] grades = new float[4];
        Scanner user_input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter grade " + (i + 1));
            grades[i] = user_input.nextFloat();
        }
        float average = 0;
        float maximum = grades[grades.length-1];
        float minimum = grades[0];
        for (float i : grades){
            average = average + i;
        }
        average = average / grades.length;
        // Bubble sort
        for (int i = (grades.length - 1); i >=0; i-- ){
            for (int j = 1; j<=i; j++){
                if (grades[j-1] > grades[j]){
                    float temp = grades[j];
                    grades[j-1] = grades[j];
                    grades[j] = temp;
                }
            }
        }

        System.out.println("Average is: " + average);
        System.out.println("Maximum is: " + maximum);
        System.out.println("Minimum is: " + minimum);
    }
}

