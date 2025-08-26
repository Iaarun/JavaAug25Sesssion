package testlearn;

public class _004String {
    public static void main(String[] args) {
        _004String str = new _004String();
        str.stringFunctions();
    }

    public void stringObject(){
        // String class is used to creat the immutable string object

        //2 ways to create String object
        //using literal
        String str = "Hello";
        String str1 = "Hello";
        //using new keyword
        String str2= new String("Hello");
        String str3= new String("Hello");
        System.out.println(str);
        System.out.println(str2);

        //ternary operator
       String res=  (str==str1)? "stored at same address": "stored at different address";
        System.out.println(res);

        String res1=  (str2==str3)? "stored at same address": "stored at different address";
        System.out.println(res1);

        //equals method
        String res2=  (str.equals(str1))? "same value": "different value";
        System.out.println(res2);

        String res3=  (str2.equals(str3))? "same value": "different value";
        System.out.println(res3);

        System.out.println("====String immutable example====="  );

        String a="Hello";
      a =  a.concat(" world");
        System.out.println(a);

    }

    public void stringFunctions(){
        String str = "Test Data";
      //  String str1=null;
        //check string length
        System.out.println(str.length());
        //convert to upper case
        System.out.println(str.toUpperCase());
        //convert to lower case
        System.out.println(str.toLowerCase());
        //convert the String into TitleCase
      //data at specific index
        System.out.println(str.charAt(str.length()-1));

        //find index of specific char
        System.out.println(str.indexOf('a'));
        //last index of specific char
        System.out.println(str.lastIndexOf('a'));
        // check if string is empty
        String str2 = "test data";
        System.out.println(str.isEmpty());

        System.out.println(str.equals(str2)); //case sensitive
        System.out.println(str.equalsIgnoreCase(str2)); //not case sensitive

        System.out.println(str2.compareTo(str)); //0
        System.out.println(str2.compareToIgnoreCase(str)); //0







    }
}
