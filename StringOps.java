public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                c = (char) (c - 32);
                str = str + c;
            } else if ((c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
                str = str + c;
            } else if ((c >= 'A') && (c <= 'Z'))  {
                c = (char) (c + 32);
                str = str + c;
            } else {
                str = str + c;
            }
            
        } 
        return str;
    }

    public static String camelCase (String string) {
        String str = "";
        if (string.charAt(0) != ' ') {
            char chr = string.charAt(0);
            if ((chr >= 'A') && (chr <= 'Z')) {
                chr = (char) (chr +32);
                str = str + chr;
            } else {
                str = str + chr;
            }
        }
       
        for (int i = 1; i < string.length(); i++ ) {
          char c = string.charAt(i);
          if (c != ' ' ) {
             if ((c >= 'A') && (c <= 'Z') && (string.charAt(i-1) == ' ') && (str != "")) {
                str = str + c;
            } else if ((c >= 'a') && (c <= 'z') && (string.charAt(i-1) == ' ') && (str != "")) {
                    c = (char) (c -32);
                    str = str + c;
            } else if ((c >= 'A') && (c <= 'Z')) {
                c = (char) (c + 32);
                str = str + c;
            } else {
                str = str + c;
            }
          }
        }
        return str;
    }

    public static int[] allIndexOf (String string, char chr) {
        int x = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (chr == c) {
                x++;
            }
        }
        int array [] = new int [x];
        int y = 0;

        for (int i = 0; i < string.length(); i++) {
            for (int j = y; j < string.length(); j++) {
                if (string.charAt(i) == chr) {
                    array[j] = i;
                    y++;
                    j = string.length();
                }
            }
        }
        return array;
    }
}
