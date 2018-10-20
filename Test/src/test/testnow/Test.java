package test.testnow;


import com.sun.xml.internal.bind.util.Which;

public class Test
{           
	public static void main(String[] args)
	{
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};

        System.out.println(Kata.findNeedle(haystack1));




	}
}

 class Kata {
    public static String findNeedle(Object[] haystack) {
        String str = "found the needle at position ";
        int position = 0;
        for(int i = 0; i< haystack.length; i++){
            Object word = haystack[i];
           // String test = word.toString();
           // System.out.println(test);
            if(word =="needle") {
                position = i;
                System.out.println("found it!");
            }
        }
        System.out.println("p= "+ position);
        str += position;
        System.out.println(str);
        return str;
    }
}