import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Main choices = new Main();
    //Menu List
    do {
        System.out.println("Menu Options");
        System.out.println("  ");
        System.out.println("1. Area of a Circle");
        System.out.println("2. Volume of a Sphere");
        System.out.println("3. Factorial of a number");
        //Input number of method
        int choice;
        choice = input.nextInt();
        //Switch to appropriate method based on input
        switch (choice) {
            case 1:
                choices.areaOfCircle();
                break;
            case 2:
                choices.volumeOfSphere();
                break;
            case 3:
                choices.factorialOfNumber();
                break;
        }
        System.out.println();
        //Exit menu if choice is equal to 0
        if (choice == 0) {
            break;//exit loop
        }
    }while (true);


    }
    //Method to find Area of Circle
    public void areaOfCircle() {
        Scanner s = new Scanner(System.in);
        //Input width
        System.out.println("Enter the width of the Triangle:");
        double b = s.nextDouble();

        //Input height
        System.out.println("Enter the height of the Triangle:");
        double h = s.nextDouble();

        //Area of a triangle formula
        double area;
        area = (b * h) / 2;
        //Print out result
        System.out.println("Area of the triangle is " + area);
    }

    //Method to find Volume of Sphere
    public void volumeOfSphere(){
        Scanner s = new Scanner(System.in);
        //Input radius
        System.out.println("Enter the radius of the sphere: ");
        double r = s.nextDouble();

        //Volume of Sphere formula
        double volume = (4*22*r*r*r) / (3 * 7);

        System.out.println("Volume is:" + volume);
    }

    //Method to find factorial of number
    public void factorialOfNumber() {
        Scanner scn = new Scanner(System.in);
        //Input number to find its factorial
        System.out.print("Enter number: ");
        int num = scn.nextInt();

        //Factorial of 1 is 1
        if (num <= 1) {
            num = 1;
        } else {
            //for loop to find factorial
            for (int i = num; i >= 2; i--) {
                num *= i;
            }
        }
        //Print result
        System.out.println("Factorial: " + num);
    }


}
