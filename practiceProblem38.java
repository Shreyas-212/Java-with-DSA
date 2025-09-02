import java.util.Scanner;

public class practiceProblem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum = ");
        sum.display();

        System.out.print("Difference = ");
        diff.display();

        System.out.print("Product = ");
        prod.display();

    }
}

class Complex {
    double real;
    double imag;

    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    Complex multiply(Complex c) {
        double r = this.real * c.real - this.imag * c.imag;
        double i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }

    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}
