package com.company;

public class Main {

    public static void main(String[] args) {

        String someStr = "Java is good language-+-";

        StringFunc reverse = (str)->{
            String result = "";
            for(int i = str.length()-1; i>=0; i--){
                result+=str.charAt(i);
            }
            return result;
        };
        StringFunc changeCase = (str)->{
            String result = "";
            char ch;
            for(int i = 0; i<=str.length()-1; i++){
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result+=Character.toLowerCase(ch);
                else
                    result+=Character.toUpperCase(ch);
            }
            return result;
        };
        System.out.println(ChangeMethod.changeString(reverse,someStr));
        System.out.println(ChangeMethod.changeString(changeCase,someStr));
        System.out.println(ChangeMethod.changeString((str)->str.replace('-','_'),someStr));
    }
}
