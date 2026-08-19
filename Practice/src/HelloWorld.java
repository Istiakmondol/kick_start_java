import java.util.Scanner;


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

//Program that will take your age in year(s) as input and print it.
class UserInput{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
        System.out.println("Your Age Is: "+age);
    }
}

//Program that will receive the values of an integer, a floating point number, a character from the keyboard and print those values.
class TestCase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer value: ");
        int i=input.nextInt();
        System.out.print("Enter the float value: ");
        double d=input.nextDouble();
        System.out.print("Enter the character value: ");
        char c=input.next().charAt(0);

        System.out.println("Integer value is: "+i);
        System.out.println("Float value is: "+d);
        System.out.println("Character value is: "+c);

    }
}

//Program that will take three integer numbers from keyboard but assign only the first and last inputs to variables and skip any assignment of the middle one.
class TestCase2{
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter 1st value: ");
        int first = input.nextInt();
        System.out.println("Enter 2nd value: ");
        input.nextInt();
        System.out.println("Enter 3rd value: ");
        int third = input.nextInt();

        System.out.println("First value is: "+first);
        System.out.println("Third value is: "+third);
    }
}

//Program that will declare a variable from each data type: double, boolean. Then it will initialize them with values and print them.
class TestCase3{
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double d;
        boolean b;

        System.out.print("Enter double value: ");
        d=input.nextDouble();
        System.out.print("Enter boolean value either 1 or 0: ");
        int value=input.nextInt();
        b=(value==1);

        System.out.println("The Double value is: "+d);
        System.out.println("The Boolean value is: "+b);

    }
}

//Program that will define a constant using “CONST” and print the value.
class TestCase4{
    public static void main(String[] args){
        final double pi= 3.14;
        final double  goldenRatio= 1.62;

        System.out.println("The value of PI: "+pi);
        System.out.println("The value of Golden Ration: "+goldenRatio);
    }
}

//Program that will define a global and a local variable with the same name but with different
//values, and then do the following steps in order
// A. Print the value of the variable before defining the local variable
//B. Print the value of the variable after defining the local variable
//C. Explicitly print the value of the variable as global

class TestCase5{
    static int global=20;
    public static void main(String[] args) {
        System.out.println("The value of Global: "+global);
        int global=10;
        System.out.println("The value of Local 2: "+global);
        System.out.println("The value of Local 2: "+TestCase5.global);

    }
}

//Program that will take two numbers X and Y as inputs, then calculate and print the values of their addition, subtraction, multiplication, division (quotient and reminder).
class TestCase6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = input.nextInt();

        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division Quotient: "+(a/b));
        System.out.println("Division Reminder: "+(a%b));

    }
}

//Program that will calculate the area of a circle having radius r. Area, A = 2 * Pi * r
class TestCase7{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        double A;
        System.out.print("Enter the value of r: ");
        double r = input.nextDouble();
        A=(2*3.14159)*r;
        System.out.printf("The Area of Circle is: %.2f%n", A);

    }
}

//Program that will take two numbers (a, b) as inputs and compute the value of the equation– (Without using math.h) X = (3.31 * a^2 + 2.01 * b^3) / (7.16 * b^2 + 2.01 * a^3)

class TestCase8{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double a=input.nextDouble();
        System.out.print("Enter 2nd number: ");
        double b=input.nextDouble();
        double x = (3.31*(a*a)+2.01*(b*b*b)) / (7.16 * (b*b) + 2.01 * (a*a*a));

        System.out.printf("The Result is: %.6f%n",x);
    }
}

//Program that will increment and decrement a number X by 1 inside the printf function. (Use ++ and - - operators)
class TestCase9{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int x = input.nextInt();

        System.out.println("x++: "+ x++);
        System.out.println("++x: "+ ++x);
        System.out.println("x--: "+ x--);
        System.out.println("--x: "+ --x);
    }
}

//Program that will increment and decrement a number X by Y. (Use += and -= operators)
class TestCase10{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a=input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=input.nextInt();

        a+=b;
        System.out.println("Incremented Value: "+ a);
        a-=(2*b);
        System.out.println("Decremented Value: "+ a);

    }
}

//Program that will multiply and divide a number X by Y. (Use *= and /= operators)
class TestCase11{
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a=input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=input.nextInt();

        a*=b;
        System.out.println("Multiplication Value: "+ a);
        a=a/b;
        a/=b;
        System.out.println("Division Value: "+ a);
    }
}

//Program that will declare and initialize an integer and a floating point number. Then it will
//perform floating to integer and integer to floating conversions using
//(a) Assignment operation
//(b) Type casting
