import java.util.Scanner;
class complex_num
{
    private
    float real,imaginary; // Setting the variables of an object of class complex_num
    public
    complex_num() // Constructor
    {
        real = 1;
        imaginary = 1;
    }
    void display()
    {
        System.out.println("\t Complex num is :  " + real + " + "+ imaginary+"i"); // Displays the complex number in this specified format
    }
    void get_data() // this function takes the input and stores it in the object variables.
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part : ");
        real = sc.nextFloat();
        System.out.println("Enter imaginary part : ");
        imaginary = sc.nextFloat();
    }
    void add(complex_num c1, complex_num c2) // this function adds the complex num in specified format and stores the real value in the real part of complex no and same is with imaginary part
    {
        real = c1.real + c2.real;
        imaginary = c2.imaginary + c1.imaginary;
        // display();
        // System.out.println("Addition = " + real + " + "+ imaginary+"i");
    }
    void subtract(complex_num c1, complex_num c2)// performs subtraction of complex nums
    {
        real = c1.real - c2.real;
        imaginary = c2.imaginary - c1.imaginary;
        // display();
    }
    void multiply(complex_num c1, complex_num c2) // performs division of complex nums in the specified format
    {
        real = (c1.real * c2.real) - (c2.imaginary * c1.imaginary);
        imaginary = (c1.real * c2.imaginary) + (c1.imaginary * c2.real);
    }
    void division(complex_num c1, complex_num c2) // performs division in the specified format
    {
        float k = c2.real * c2.real + c2.imaginary * c2.imaginary;
        real = ((c1.real * c2.real) + (c2.imaginary * c1.imaginary))/k;
        imaginary = ((c1.real * c2.imaginary) - (c1.imaginary * c2.real))/k;

    }
}

public class Assignment1 {
    public static void main(String[] args) {
       
       
        complex_num c1 = new complex_num();
        c1.display();
        complex_num c2 = new complex_num();
        complex_num c3 = new complex_num();
        int d;
        System.out.println("Enter first complex num - ");
                        c1.get_data();
                        System.out.println("Enter second complex num - ");
                        c2.get_data();
                       
   
        // Menu driven -
       
        Scanner sp = new Scanner(System.in);
        do
        {
   
        System.out.println("Enter - 0)Change complex no 1)Add, 2)Subtract, 3)Multiply, 4)Divide, 5)End");
        d = sp.nextInt();

        switch(d)
        {   case 0:     System.out.println("Enter first complex num - ");
                        c1.get_data();
                        System.out.println("Enter second complex num - ");
                        c2.get_data();
                        break;

            case 1: c3.add(c1, c2);
            System.out.println("Addition is : ");
            break;
            case 2: c3.subtract(c1, c2);
            System.out.println("Subtraction is : ");
            c3.display();
            break;
            case 3: c3.multiply(c1, c2);
            System.out.println("Multiplication is : ");
            c3.display();
            break;
            case 4: c3.division(c1, c2);
            System.out.println("Division is : ");
            c3.display();
            break;
            case 5:
            break;
            default: System.out.println("Enter correct choice");
            }  
        }
        while(d != 5);
    }
}