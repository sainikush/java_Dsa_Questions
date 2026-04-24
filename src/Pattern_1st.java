public class Pattern_1st {
    public static void main(String[] args) {
        // print star Pattern
        for(int i = 1; i<=4;i++){
            for (int j = 1; j<=i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
        System.out.println(" ----------  ----------");
        // print reverse star Pattern
        for(int a = 1; a<= 4;a++){
            for(int b = a; b<=4;b++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("------  ------ ------- -------");
        System.out.println("Print half Pyramid pattern: ");
        for(int c = 1; c<=4; c++){
            for(int d = 1; d<= c; d++){
                System.out.print(d);
            }
            System.out.println();

        }
        System.out.println("------------ -------- ------ ");
        System.out.println("print character pattern");
        char ch = 'A';
        for (int e = 1; e <= 4 ; e++) {
            for (int f = 1; f <= e; f++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}
