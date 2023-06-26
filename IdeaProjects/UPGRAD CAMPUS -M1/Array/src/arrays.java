public class arrays {
    public static void main(String[] args)
    {
        String students[];  // declaring array
        students = new String[4]; // memory allocation

        students[0] = "Adam"; // initializing an array at index (value= Adam is given in quest)
        System.out.println(students[0]);

        //assinging the value to these elements using indices
        students[1] = "Lucy";
        students[2] = "Emma";
        students[3] = "John";

        System.out.println(students[2]); // printing the value at index 2

        // another way to declare an array
        String names[] = {"Adam","Lucy","Emma","John"};
        System.out.println(names[3]);

        // throws an exception
        //System.out.println(names[5]);
    }
}

//array
//declare an array and memory allocated
//int[]marks= new int[6];            create arraylist object
// marks[1]=value;                   initialize an array at index
//System.out.println(marks[1]);              print the value at index

// user input
//imort.java.util.Scanner;                  import scanner class
//Scanner myObj=new Scanner(System.in);      create scanner class
//int marks=myObj.nextInt();               read user input
//System.out.println(marks);                       output user  input