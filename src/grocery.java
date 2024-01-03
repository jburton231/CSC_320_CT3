import java.util.Scanner;
import java.util.*;
public class grocery {
    public static void main(String[] args) {
        Scanner coupon = new Scanner(System.in);
        System.out.println("Please enter coupon value as a decimal");
        float couponVal = coupon.nextFloat();
        if(couponVal < 1) {
            System.out.println("Rate is: " + couponVal);
            Scanner user_grocery = new Scanner(System.in);
            double[] grocery_bills = new double[4];

            System.out.println("Please enter grocery bills for weeks 1 - 4");


            for (int i = 0; i < grocery_bills.length; i++) {
                System.out.println("Please enter bill for week " + (i+1));
                grocery_bills[i] = user_grocery.nextDouble();


        }

            float grocery_sum =  (float) (grocery_bills[0] + grocery_bills[1] + grocery_bills[2]);
            float avg_month = grocery_sum / grocery_bills.length;
            float groc_with_coup =(avg_month * (1-couponVal));
            System.out.println("Average bill with coupon: " + groc_with_coup );
            System.out.println("Average bill without coupon: " + avg_month);
            System.out.println("Monthly Total: "+ grocery_sum);
            System.out.println("Monthly Total with Coupon: " + (grocery_sum * (1-couponVal)));
        } else if (couponVal >= 1) {
            System.out.println("Error, Please enter the rate as a decimal");
        }
        coupon.close();

        }

    }

