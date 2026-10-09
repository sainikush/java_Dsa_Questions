package ThirdTime.gem1;



public class Method2 {
    public static String describe(String name) {

        return  "Hello " + name;
    }

    public static int subtract(int a, int b) {
        return  a - b;
    }
    public static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int result = subtract(243,78);
        System.out.println(result);

        boolean result1 = isEven(7);
        System.out.println(result1);

        String result2 = describe("Vivek is a Student");
        System.out.println(result2);
    }


}
