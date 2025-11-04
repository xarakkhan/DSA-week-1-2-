import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
     double Quiz_Marks,Assignment_Marks,Mid_Marks,Final_marks;

        System.out.println("Enter Quiz marks out of 15:");
        Quiz_Marks = S.nextDouble();
        if (Quiz_Marks > 15 || Quiz_Marks < 0) {
            System.out.println("Invalid input! Please enter again (0–15): ");
            Quiz_Marks = S.nextDouble();
        }

        System.out.println("Enter Assignment Marks out of 10:");
        Assignment_Marks=S.nextDouble();
        if (Assignment_Marks > 10 || Assignment_Marks < 0) {
            System.out.println("Invalid input! Please enter again (0–10): ");
            Assignment_Marks = S.nextDouble();
        }

        System.out.println("Enter Mid Term Marks:");
        Mid_Marks=S.nextDouble();
        if (Mid_Marks > 25 || Mid_Marks < 0) {
            System.out.println("Invalid input! Please enter again (0–25): ");
            Mid_Marks = S.nextDouble();
        }


        System.out.println("Enter Final Term Marks:");
        Final_marks=S.nextDouble();
        if (Final_marks > 50 || Final_marks < 0) {
            System.out.println("Invalid input! Please enter again (0–50): ");
            Final_marks = S.nextDouble();
        }


        // calculate total Marks
        double Total_Marks=Quiz_Marks+Assignment_Marks+Mid_Marks+Final_marks;

       double Average= (double)Total_Marks;
         Average=Total_Marks;

         String Grade;
         if(Average>=85){
             Grade="A";
         } else if (Average>=70) {
             Grade="B";
         } else if (Average>=50) {
             Grade="c";

         }
         else {
             Grade="Fail";
         }

// display result
        System.out.println("Total marks ="+ Total_Marks);
        System.out.println("Average marks="+Average);
        System.out.println("Grade+"+Grade);
    }
}
