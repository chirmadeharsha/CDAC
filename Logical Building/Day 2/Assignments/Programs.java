// Section 2: Java Programming with Conditional Statements
// Question 1: Grade Classification
// Write a program to classify student grades based on the following criteria:
//  If the score is greater than or equal to 90, print "A"
//  If the score is between 80 and 89, print "B"
//  If the score is between 70 and 79, print "C"
//  If the score is between 60 and 69, print "D"
//  If the score is less than 60, print "F"

// class Programs {
//     public static void main(String args[]) {
//         int marks = 60;

//         if (marks >= 90) {
//             System.out.println("A");
//         } else if (marks >= 80 && marks <= 89) {
//             System.out.println("B");
//         } else if (marks >= 70 && marks <= 79) {
//             System.out.println("C");
//         } else if (marks >= 60 && marks <= 69) {
//             System.out.println("D");
//         } else if (marks < 60) {
//             System.out.println("F");
//         } else {
//             System.out.println("Nothing");
//         }
//     }
// }
// ==========================================================================

// Question 2: Days of the Week
// Write a program that uses a nested switch statement to print out the day of the week based on an
// integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
// is a weekday or weekend.

// class Programs {
//     public static void main(String args[]) {
//         int day = 1;

//         switch (day) {
//             case 1:
//                 System.out.println("Monday - Weekday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday - Weekday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday - Weekday");
//                 break;
//             case 4:
//                 System.out.println("Thursday - Weekday");
//                 break;
//             case 5:
//                 System.out.println("Friday - Weekday");
//                 break;
//             case 6:
//                 System.out.println("Saturday - Weekend");
//                 break;
//             case 7:
//                 System.out.println("Sunday - Weekend");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//                 break;
//         }
//     }
// }
// ========================================================================

// Question 3: Calculator
// Write a program that acts as a simple calculator. It should accept two numbers and an operator
// (+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if-
// else to check if division by zero is attempted and display an error message.
 
// import java.util.Scanner;

// class Programs {
//     public static void main(String[] args) {
//         char operator;
//         int n1, n2, result;

//         // Create an object of Scanner class
//         Scanner input = new Scanner(System.in);

//         // Ask users to enter operator
//         System.out.println("Choose operator: +, -, *, /");
//         operator = input.next().charAt(0);   // carefully baghane

//         // Ask users to enter numbers
//         System.out.println("Enter first number");
//         n1 = input.nextInt();

//         System.out.println("Enter second number");
//         n2 = input.nextInt();

//         switch (operator) {
//             case '+':
//                 result = n1 + n2;
//                 System.out.println(n1 + " + " + n2 + " = " + result);
//                 break;
//             case '-':
//                 result = n1 - n2;
//                 System.out.println(n1 + " - " + n2 + " = " + result);
//                 break;
//             case '*':
//                 result = n1 * n2;
//                 System.out.println(n1 + " * " + n2 + " = " + result);
//                 break;
//             case '/':
//                 if (n2 == 0) {
//                     System.out.println("Error: Division by zero is not allowed.");
//                 } else {
//                     result = n1 / n2;
//                     System.out.println(n1 + " / " + n2 + " = " + result);
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operator");
//                 break;
//         }
//     }
// }

// =========================================================================================
// Question 4: Discount Calculation
// Write a program to calculate the discount based on the total purchase amount. Use the following
// criteria:
//  If the total purchase is greater than or equal Rs.999, apply a 10% discount.
//  If the total purchase is less than Rs.500, apply a 5% discount.
// Additionally, if the user has a membership card, increase the discount by 5%.

// import java.util.Scanner;

// class Programs{
//     public static void main (String args[]){
//         double totalpurchase,discount=0;//discount=0; initial karan ajarurui hai 
//         boolean hasmembershipcard;


//         Scanner input =new Scanner(System.in);

//         //ask the user for the total purchase amount 
//         System.out.println("Entert total purchase");
//         totalpurchase=input.nextDouble();

//         // ask the user if they have a membership card
//         System.out.println("Do you have membership card?(yes/no)");
//         hasmembershipcard=input.nextBoolean();



//         if (totalpurchase>=1000) {
//             discount=20;
//         }
//         else if (totalpurchase>=500 && totalpurchase<=999) {
//                 discount=10;
//         }
//         else if (totalpurchase<500) {
//             discount=5;
//     }
//          if  (hasmembershipcard) {
//                     discount += 5;

//          }
//          double finalprice=totalpurchase-(totalpurchase * discount / 100);
//          System.out.println("totalpurchase="+totalpurchase);
//          System.out.println("discount="+ discount + "%");       
//          System.out.println("final price after discount :"+finalprice);
            

// }
// }

// =====================================================================================================
// Question 5: Student Pass/Fail Status with Nested Switch
// Write a program that determines whether a student passes or fails based on their grades in three
// subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
// more subjects, print the number of subjects they failed in.
         import java.util.Scanner;
         class Programs{
            public static void main(String args[]){
            int eng ,math,phy,chem,failedcount=0;
            try (Scanner input = new Scanner(System.in)) {//carefully see why try is here used
                {
                    System.out.println("Enter the marks of Eng ");
                                eng=input.nextInt();
                                System.out.println("Enter the marks of phy ");
                                phy=input.nextInt();
                                System.out.println("Enter the marks of chem");
                                chem=input.nextInt();
                                System.out.println("Enter the marks of math ");
                                math=input.nextInt();
                }
            } 
                 switch(eng>40?1:0){
                 case 0:
                failedcount++;
            }

            switch(math>40?1:0){
                case 0:
                failedcount++;
           }

           switch(phy>40?1:0){
            case 0:
            failedcount++;
       }

       switch(chem>40?1:0){
        case 0:
        failedcount++;
   }
           switch(failedcount){
            case 0:
            System.out.println("Student pass");
            break;
        
            default:
            System.out.println("student fail-" +failedcount +"subject");
            break;
           }

            }
         }
        //  =======================================================================
         



    