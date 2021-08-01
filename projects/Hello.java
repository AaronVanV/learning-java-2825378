import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Hello{

    public static void main(String[] args){
        //declaring variables
        int number= 9;
        String name= "Aaron";
        Boolean state= false;
        double decimal= 10.69;
        char firstInitial= 'A';
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        //output/printing
        System.out.println("Hello: "+name+" ,number: "+number+ " ,state: " +state + " ,decimal: " +decimal);
        
        System.out.format("Hello: %s+ ,number: %o ,state: %b ,decimal: %f " ,
        name, number, state, decimal);

        System.out.println("\n"+ firstInitial);
        System.out.println(cars[0]);
        System.out.println(myNum[1]);





        //if else
        if(number>=10){
            System.out.println("number is greater that or equal to 10");
        }else{System.out.println("number smaller than 10");}
        


        //input
        System.out.println("ENTER NEW NAME: ");

        Scanner input = new Scanner(System.in);
        name=input.next();

        System.out.println("New name: "+name);

        //loop
        int x=0;
        while(x<=10){
            System.out.println(x);
            x++;
        }
        System.out.println("Counter end");
    }
}