class Task_3{
public static int longestsubs(String str) {
  int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (temp.indexOf(ch) == -1) {
                    temp += ch;
                    if (temp.length() > maxLength) {
                        maxLength = temp.length();
                    }
                } else {
                    break; 
                }
            }
        }

        return maxLength;
    }
public static void main(String []args){
System.out.println(longestsubs("abcbac"));


}


}