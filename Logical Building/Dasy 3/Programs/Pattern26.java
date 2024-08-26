

// 1. Sum of the first 50 natural numbers:

//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 1; i <= 50; i++) {
//             sum += i;
//         }
//         System.out.println("Sum of the first 50 natural numbers: " + sum);
//     }


//  2. Compute the factorial of 10:

//     public static void main(String[] args) {
//         int number = 10;
//         int factorial = 1;
//         for (int i = 1; i <= number; i++) {
//             factorial *= i;
//         }
//         System.out.println("Factorial of 10: " + factorial);
//     }


//  3. Print all multiples of 7 between 1 and 100:

//     public static void main(String[] args) {
//         for (int i = 7; i <= 100; i += 7) {
//             System.out.println(i);
//         }
//     }



// 4. Reverse the digits of the number 1234:

//     public static void main(String[] args) {
//         int number = 1234;
//         int reversed = 0;
//         while (number != 0) {
//             int digit = number % 10;
//             reversed = reversed * 10 + digit;
//             number /= 10;
//         }
//         System.out.println("Reversed number: " + reversed);
//     }



//  5. Print the Fibonacci sequence up to the number 21:

//     public static void main(String[] args) {
//         int a = 0, b = 1;
//         System.out.print("Fibonacci sequence up to 21: " + a + " " + b);
//         while (b < 21) {
//             int next = a + b;
//             a = b;
//             b = next;
//             if (b <= 21) {
//                 System.out.print(" " + b);
//             }
//         }
//         System.out.println();
//     }



// 6. Find and print the first 5 prime numbers:

//     public static void main(String[] args) {
//         int count = 0, number = 2;
//         while (count < 5) {
//             boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(number); i++) {
//                 if (number % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.print(number + " ");
//                 count++;
//             }
//             number++;
//         }
//         System.out.println();
//     }



//  7. Calculate the sum of the digits of the number 9876:

//     public static void main(String[] args) {
//         int number = 9876;
//         int sum = 0;
//         while (number != 0) {
//             sum += number % 10;
//             number /= 10;
//         }
//         System.out.println("Sum of the digits: " + sum);
//     }



//  8. Count down from 10 to 0:

//     public static void main(String[] args) {
//         for (int i = 10; i >= 0; i--) {
//             System.out.println(i);
//         }
//     }



//  9. Find and print the largest digit in the number 4825:
//     public static void main(String[] args) {
//         int number = 4825;
//         int largest = 0;
//         while (number != 0) {
//             int digit = number % 10;
//             if (digit > largest) {
//                 largest = digit;
//             }
//             number /= 10;
//         }
//         System.out.println("Largest digit: " + largest);
//     }



// 10. Print all even numbers between 1 and 50:

//     public static void main(String[] args) {
//         for (int i = 2; i <= 50; i += 2) {
//             System.out.println(i);
//         }
//     }


//  11. Demonstrate pre-increment and post-decrement operators:

//     public static void main(String[] args) {
//         int x = 5;
//         int y = ++x - x-- + --x + x++;
//         System.out.println("Result: " + y);
//     }


//  12. Draw the pattern:

// *****
// *****
// *****
// *****
// *****

//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//  13. Print the pattern:

// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 5*5*5*5*5
// 5*5*5*5*5
// 4*4*4*4
// 3*3*3
// 2*2
// 1
// ```

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + (j < i ? "*" : ""));
//             }
//             System.out.println();
//         }
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + (j < i ? "*" : ""));
//             }
//             System.out.println();
//         }
//     }



// 14. Print the pattern:

// *
// **
// ***
// ****
// *****
// ******
// *******
// *********

//     public static void main(String[] args) {
//         for (int i = 1; i <= 8; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// 15. Print the pattern:

// *
// **
// ***
// ****
// *****

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




//  16. Print the pattern:

// *
// ***
// *****
// *******
// *********

//     public static void main(String[] args) {
//         int[] counts = {1, 3, 5, 7, 9};
//         for (int count : counts) {
//             for (int j = 1; j <= count; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }




// ### 17. Print the pattern:

// *****
// ****
// ***
// **
// *
//     public static void main(String[] args) {
//         for (int i = 5; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }




// 18. Print the pattern:
// ```
// *
// ***
// *****
// *******
// *****
// ***
// *

//     public static void main(String[] args) {
//         int[] counts = {1, 3, 5, 7, 5, 3, 1};
//         for (int count : counts) {
//             for (int j = 1; j <= count; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }



// 19. Print the pattern:

// 1
// 1*2
// 1*2*3
// 1*2*3*4
// 1*2*3*4*5
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + (j < i ? "*" : ""));
//             }
//             System.out.println();
//         }
//     }




//  20. Print the pattern:

// 5
// 5*4
// 5*4*3
// 5*4*3*2
// 5*4*3*2*1

//     public static void main(String[] args) {
//         for (int i = 5; i >= 1; i--) {
//             for (int j = 5; j >= i; j--) {
//                 System.out.print(j + (j > i ? "*" : ""));
//             }
//             System.out.println();
//         }
//     }




//  21. Print the pattern:

// 1*3
// 1*3*5
// 1*3*5*7
// 1*3*5*7*9

//     public static void main(String[] args) {
//         int num = 1;
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + (j < i ? "*" : ""));
//                 num += 2;
//             }
//             num = 1;
//             System.out.println();
//         }




// 22. Print the pattern:

// *********
// *******
// *****
// ***
// *
// ***
// *****
// *******
// *********

//     public static void main(String[] args) {
//         int[] counts = {9, 7, 5, 3, 1};
//         for (int count : counts) {
//             for (int j = 1; j <= count; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int count : new int[]{3, 5, 7, 9}) {
//             for (int j = 1; j <= count; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }



//  23. Print the pattern:

// 11111
// 22222
// 33333
// 44444
// 55555

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }






//  24. Print the pattern:

// 1
// 22
// 333
// 4444
// 55555



//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }





//  25. Print the pattern:

// 1
// 12
// 123
// 1234
// 12345
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }





// 26. Print the pattern:

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

//     public static void main(String[] args) {
//         int num = 1;
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }



