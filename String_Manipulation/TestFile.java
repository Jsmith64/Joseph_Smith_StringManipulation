
public class TestFile {
    public static void main(String[] args){
       
        //Test 1
        StringManipulator manipulator1 = new StringManipulator();
        String str = manipulator1.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 

        //Test 2
        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Coding", letter);
        Integer b = manipulator2.getIndexOrNull("Hello World", letter);
        Integer c = manipulator2.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        
        //Test 3
        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator3.getIndexOrNull(word, subString);
        Integer e = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        //Test 4
        StringManipulator manipulator4 = new StringManipulator();
        String word2 = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld





    }
}