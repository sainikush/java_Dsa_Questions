package Strings_StringsBuilder;

import java.util.Arrays;

public class method {
  public static boolean isPalindrome(String str){
      str = str.toLowerCase();
      if ( str == null || str.length() == 0){
          return true;
      }

      for (int i = 0; i < str.length()/2; i++) {
          char start = str.charAt(i);
          char end = str.charAt(str.length() -1 - i);
          if (start != end){
              return false;
          }
      }
      return true;
  }

    public static void main(String[] args) {
        String name = "vivek saini hellp world ko bolo jai shree ram";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf("v"));
        System.out.println(Arrays.toString(name.split(" ")));
        
        String plaidrome = "abcdcba";
        System.out.println(isPalindrome(plaidrome));
        


    }
}
