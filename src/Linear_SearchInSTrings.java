public class Linear_SearchInSTrings {

    public static boolean Search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    // for each
    public static boolean Search2(String str, char target){
        if (str.length() == 0){
            return true;
        }
        for(char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
     String name = "Vivek";
     char target = 'e';
        System.out.println(Search(name,target));
        System.out.println(Search2(name,target));
    }

}
