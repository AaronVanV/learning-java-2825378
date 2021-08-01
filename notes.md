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
