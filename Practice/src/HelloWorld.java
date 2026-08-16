//Program that will print “Hello World”
public class HelloWorld {

    public static void main(String[] args) {
        System.out.print("Hello World");
    }
}

//Program that will print new line
class NewLine {
    public static void main(String[] args) {
        System.out.println("Hello World \nThis is my first program. \nJava is fun");
    }
}

//Program that will print the following segment: The question is - “How to write a \comment/ in C programming language?”
class Printing{
    public static void main (String[] args){
        System.out.println("The question is - How to write a \n" + "\\comment/ in Java programming language?”");
    }
}

//Program that will declare an integer, a floating point number, a character. Then it will initialize them with values and print those values.
class Variable{
    public static void main (String[] args){
        int i;
        double f;
        char c;
        i=5;
        f=5.12348;
        c='C';
        System.out.println("The integer value: "+i);
        System.out.println("The float value: "+f);
        System.out.println("The character value: "+c);
    }
}

//Program that will do the followings:
//a) Declare a variable uninitialized
//b) Declare and initialize a variable in one statement
//c) Declare and initialize multiple variables with different values in one statement

class TestFive{
    public static void main(String[] args){
        int i;
        int j=5;
        int a=10,b=20,c=30;

        System.out.println( "j: "+j+"\n a: "+a+"\n b: "+b+"\n c: "+c);

    }
}
