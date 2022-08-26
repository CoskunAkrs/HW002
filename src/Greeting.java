public class Greeting {
    public static void main(String[] args) {
        //TODO: Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
    int hour=15;

    if (hour<12)
    {System.out.println("Good Morning!"); }
    else if(hour>=12|hour<17)
    {System.out.println("Good Afternoon");}
    else if(hour>=17)
    {System.out.println("Good Evening!");}
    }}
