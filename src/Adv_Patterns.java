public class Adv_Patterns {

    //   to print Hollow Rectangle Pattern
//    * * * * *
//    *       *        think of its as a matrix
//    *       *              and labelled them as(3,1) (3,4)
//    * * * * *
//  use the boundry conditons where you have to print the hollow Pattern
    // COndition1:
    //  total Lines ( total rows ) => outer( 1 to 4) => total rows
    // Boundry conditions:=>
    //                     row-> 1,4
    //                     col-> 1,5

    // uee loops on the both the rows and columns
    // outer loop is used to get to the next line
    // Main work happens in Column loop. So focus on loops
    // logic:
    public static void Hollow_Rectangle(int r, int c){
        // outer loop
        for (int i = 1; i <= r ; i++) {
            // inner loops
            for (int j = 1; j <= c; j++) {
                 // cell - (i,j)
                if (i == 1 || i == r || j == 1 || j == c) {
                    // boundry cells
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }



    // Inverted & Rotated Half-Pyramid
    //                               spaces = (row - i )
//          *   row = 1    --------> spaces = 3 (4 - 1)   stars = 1
//        * *   row = 2    --------> spaces = 2 (4 - 2)   stars = 2
//      * * *   row = 3    --------> spaces = 1 (4 - 3)   stars = 3
//    * * * *   row = 4    --------> spaces = 0 (4 - 4)   stars = 4
//  c1 c2 c3 c4 => columns
    // Conditions =>
    //              outer loop ==> total rows = 4, loop ( 1  to 4 )
    //              inner loop ==> total column = 4 (loop (  1 to 4)
    // how to Print "star" and "spaces" in this way ??
    // spaces = n - i
    //  logic:
    public static void inv_rot(int r){
        // outer loop
        for (int i = 1; i <= r ; i++) {
            // Spaces
            for (int j = 1; j <= r - i ; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
// half -Pyramid with numbers
//     1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5
    // most imortant 1 is coming in every iterations
    // comditons : outer loop 5 times will run - 1 to 5
    //              inner loop will run the same
    // logic :
    public static void  Half_Pyramid(int n){
        // outer  loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Inverted Half Pyramid
//    1 2 3 4 5  i=1     (1 to 5)  n-i+1 = 5 - 1 + 1 = 5
//    1 2 3 4    i=2     (1 to 4)         = 5-2+1 = 4
//    1 2 3      i=3     (1 to 3)     just like this rest will work
//    1 2        i=4     (1 to 2)
//    1          i=5     (1 to 1)
    // here we have to reverse the conditons
    // logic
    public static void Inverted_Pyramid(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Floyd's Triangle
//     1
//     2  3
//     4  5  6
//     7  8  9 10
//     11 12 13 14 15
    // conditons : here the no is increasing after each iteration So,
      // lets take an counter variable
    // logic
    public static void Floyds_triangle(int n){
        int counter = 1;
        for (int i = 1; i <= n ; i++) {
            // how many times a counter will print
            for (int j = 1; j <= i ; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle :
    // imagine in the form of matrix
    //
    // 1 = (1,1)
    //                           (row+col) = "even"  -> 1    and if (row + col) -> "odd" -> 0
//      |1| | | | |            1 = (1,1) = 2    &
//      |0|1| | | |            1 = (2,2) = 4    & 0 = (2,1)
//      |1|0|1| | |            1 = (3,3) = 6    & 0 = (3,2)
//      |0|1|0|1| |            1 = (4,4) = 8    & 0 = (4,3)
//      |1|0|1|0|1|            1 = (5,5) = 10   & 0 = (5,4)
    // See how the 1 no is appering
    // Now see the poitions of the 1 appearing and also see for the 0
    // observe the pattern
    //logic
    public static void Zero_One_Triangle(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <= i ; j++) {
                // conditons
               if ((i+j)%2 == 0){ // checking even conditons
                   System.out.print(1+" ");
               }else {
                   System.out.print(0+" ");
               }
            }
            System.out.println();
        }
    }

    // Butterfly Pattern
//            *        *
//            **      **
//            ***    ***
//            ****  ****
//            **********
//            **********
//            ****  ****
//            ***    ***
//            **      **
//            *        *
    //Conditons : outer loop 1 to n
    //       Stars + space + stars
    //        i    + 2(n - i) + stars
    // we have print the same thing in 2nd half but reverse order

    public static void Butterfly(int n){
        // 1st half
        for (int i = 1; i <= n ; i++) {
            // stars - i
            for (int j = 1; j <= i ; j++) {
                System.out.print(" *");
            }
            // spaces
            for (int j = 1; j <= 2*(n - i) ; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        // 2nd half
        for (int i = n; i >=1 ; i--) {
            // stars - i
            for (int j = 1; j <= i ; j++) {
                System.out.print(" *");
            }
            // spaces
            for (int j = 1; j <= 2*(n - i) ; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

// solid Rhombus
    // we have to print the space and stars
    // observe the pattern in the form of matrix
//                          * * * * *
//                        * * * * *
//                      * * * * *
//                    * * * * *
//                 * * * * *

    public static void Solid_Rhombus(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // spaces + stars
            for (int j = 1; j <= n - i ; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <=n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // hollow Rhombus
//                     * * * * *
//                   *       *
//                 *       *
//               *       *
//             * * * * *
// conditons we only have to make the spaces print and have to pritn the hollow rectangle
    // logic
    public static void Hollow_Rhombus(int n){
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1 ; j <= n - i ; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= n ; j++) {
                if(i == 1 || i == n || j == 1 || j ==n){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    // Diamond
    public static void Diamond(int n){
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <=(n - i) ; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i = n; i >= 1 ; i--) {
            // spaces
            for (int j = 1; j <=(n -i) ; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2*i) - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        Hollow_Rectangle(4,5);
        System.out.println("--- --- -- -- -- - -- ---- ");
        inv_rot(4);
        System.out.println("--- --- -- -- -- - -- ---- ");
        Half_Pyramid(5);
        System.out.println("--- --- -- -- -- - -- ---- ");
        Inverted_Pyramid(5);
        System.out.println("--- --- -- -- -- - -- ---- ");
        Floyds_triangle(5);
        System.out.println("--- --- -- -- -- - -- ---- ");
        Zero_One_Triangle(5);
        System.out.println("--- --- -- -- -- - -- ---- ");
        Butterfly(5);
        System.out.println("--- --- -- -- -- - -- ---- ");
        Solid_Rhombus(5);
        System.out.println("--- --- -- -- -- - -- ---- ");
        Hollow_Rhombus(5);
        System.out.println("--- --- -- -- -- - -- ---- ");
        Diamond(4);



    }
}
