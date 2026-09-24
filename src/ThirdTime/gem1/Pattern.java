package ThirdTime.gem1;

public class Pattern {

    public  static void Square(int n ){
        for(int i = 1;i <= n; i++){
            for (int j = 1; j <= n ; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }

    // Rectangle
    public  static void Rectangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // Right Angles Triangle
    public static void RightTriangle(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
//  Inverse Right angles triangle
    public static void InverseTriangle(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // Solid Rhombus
    public static void SolidRhombus(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n -1 ; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // alpahbets
    public static void Alphabet(int n){
        for (int i = 1; i <= n ; i++) {
            char ch = 'A';

            for (int j = i; j <= n ; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    // solid Pyramid
    public static void Pyramid(int n){
        for (int i = 1; i <= n ; i++) {
            // spaces
            for (int j = 1; j <= n - i ; j++) {

                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // hoolow square
    public  static void HollowSquare(int n,int c){

        for (int i = 1; i <= n ; i++) {
            // stars
            for (int j = 1;j <=c ; j++) {
                if (i == 1 || i == n || j == 1 || j == c){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }

    // hollow Triangle
    public static void TriangleHollow(int n){

        for (int i = 1; i <= n ; i++) {
            // stars
            for (int j = 1; j <= i ; j++) {
                if (i ==1 || i == n || j == 1 || j == i){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Hollow Pyramid
    public static void HhPyramid(int n){
        for (int i = 1; i <= n ; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= 2*i-1; j++) {

                if (i == 1 || i == n || j == 1 || j == 2*i - 1){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        // square
        Square(5);

        System.out.println("===== ======== ========= =========");
        // Rectangle
        Rectangle(3);

        System.out.println("===== ======== ========= =========");

        // Right Angle Triangle
        RightTriangle(4);

        System.out.println("===== ======== ========= =========");

        // Inverse triangle
        InverseTriangle(4);

        System.out.println("===== ======== ========= =========");

        // Solid Rhombus
        SolidRhombus(5);

        System.out.println("===== ======== ========= =========");

        // Alphabet
        Alphabet(5);

        System.out.println("===== ======== ========= =========");

        // Pyramid
        Pyramid(5);

        System.out.println("===== ======== ========= =========");

        //  Hollow Square
        HollowSquare(5,4);
        System.out.println("===== ======== ========= =========");

        // Hollow traingle
        TriangleHollow(5);

        System.out.println("===== ======== ========= =========");

        // Hollow Pyramid
        HhPyramid(5);


    }
}
