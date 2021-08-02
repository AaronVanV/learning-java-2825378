# Java

## Starting Java

Install java: "https://www.oracle.com/java/technologies/javase-jdk16-downloads.html"

Install extension for easy running: "https://code.visualstudio.com/docs/java/java-tutorial"

Start project in VS: "projectname **.java**"

Starting layout:

```java
public class Hello{

    public static void main(String[] args){
        int number= 10;
        System.out.println("Hello World! "+number);
    }
}
```

## Coding

### To print

```java
System.out.println();
```

or (using formatters to input variables into string without using "+")
,put a formatter where the variable should be: "%s" if its a string, "%b" = boolean; than enter all variables in order after the string.

```java
System.out.format("Hello: %s+ ,number: %o ,state: %b ,decimal: %f " ,
        name, number, state, decimal);
```

### Declaring variables

```java
int number= 10;
Boolean state= false;
String name= "Aaron";
double decimal= 10.69;
char firstInitial= 'A';
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};
```

### Input

First you have to create an input using the Scanner class,then you can use it wherever, also import it using : "import java.util.Scanner;".

```java
Scanner input = new Scanner(System.in);

name=input.next();

```

### Random number

To get a random number between 2 numbers, like a random number between 1 & 10 for example we use this formula/code. Where the lowest number is "min" and highest number "max".

```java
int min=1;
int max=10;

int randomNumber=(int)Math.floor(Math.random()*(max-min+1)+min)
```

### If & Else

```java
 if(number>=10){
        System.out.println("number is greater that or equal to 10");
    }else{System.out.println("number smaller than 10");}

```

When checking Strings use ".equals()" instead of "==":

```java
if(string=="word"){
  //won't work most of the time
}

if(string.equals("word")){
  //will work
}

```

### Operators

```java
> : bigger than
< : smaller than
>= : bigger than or equal to
<= : smaller than or equal to
== : equal to
!= : not equal to
```

### Switch

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
```

### Loops

```java
while(x<11){
    System.out.println(x);
    x++;
}

for(int i = 0; i < 11; i++){
    System.out.println(i);
    System.out.println("reached 10")
}
```

### Methods

To create a method/function, put it in the class.

```java
static void myMethod(arguments) {
    // code to be executed
  }
```

Then call them in the main to use them.

```java
myMethod(arguments);
```

Here we use "void" to only execute code and not return any values, to return values, replace "void" by the type of the value you want to return.

```java
static double myMethod(double height,double width) {
  double area= height*width;
  return area
}

```

```java
double calculatedArea= myMethod(50,60.3);

```

### Object oriented

To create objects using constructors we create a new .java file where we define all attributes.
Then using the this. we make it possible create new objects and give values to these attributes.
We can also create functions that can be called onto the objects.

```java
public class Triangle {
    double base;
    double height;
    double sideLen0;
    double sideLen1;
    double sideLen2;

    public Triangle(double base, double height, double sideLen0,double sideLen1,double sideLen2){
        this.base=base;
        this.height=height;
        this.sideLen0=sideLen0;
        this.sideLen1=sideLen1;
        this.sideLen2=sideLen2;
    }

    public double findArea(){
        return(this.base*this.height)/2;
    }
}

```

Then we can create objects in the first .java project and call functions and attributes.

```java
 public static void main(String[] args){
        Triangle triangle1= new Triangle(15,3,6,2,3);
        Triangle triangle2= new Triangle(25,4,6,7,1);
        Triangle triangle3= new Triangle(65,6,6,9,4);
        System.out.println(triangle1.findArea());
        System.out.println(triangle2.base);
    }
```
