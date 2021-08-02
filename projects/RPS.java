import java.util.Scanner;
public class RPS {
    
    public static void main(String[] args){
        //creating input
        Scanner input = new Scanner(System.in);

        //declaring variables
        String choiceUser="";
        String choicePC="";
        int numberUser=0;
        int numberPC=0;
        Boolean notAnAnswer= false;

        //Intro
        System.out.println("Welcome to Rock Paper Scissors!");

        //Game
        //choice user
        System.out.println("Enter your choice here(\"Rock\", \"Paper\" or \"Scissors\"):");
        choiceUser=input.next();
        System.out.println("Choice User: "+ choiceUser);
        choiceUser= choiceUser.toLowerCase();
        

        switch(choiceUser){
            case "rock":
                numberUser=1;
                break;
            case "paper":
                numberUser=2;
                break;
            case "scissors":
                numberUser=3;
                break;
            default:
                System.out.println("You entered something else than \"Rock\", \"Paper\" or \"Scissors\"");
                notAnAnswer= true;
        }

        //System.out.println(numberUser);
        if(!notAnAnswer){
            //choice pc
            int min= 1;
            int max= 3;
            numberPC=(int)Math.floor(Math.random()*(max-min+1)+min);
            //System.out.println(numberPC);
            
            switch(numberPC){
                case 1:
                    choicePC="Rock";
                    break;
                case 2:
                    choicePC="Paper";
                    break;
                case 3:
                    choicePC="Scissors";
                    break;
            }

            System.out.println("Choice PC: "+choicePC);

            //results
            //tie
            if(numberPC==numberUser){
                System.out.println("Its a tie.");
            }else{
                //user win
                if((numberUser==1&& numberPC==3)||(numberUser==2&& numberPC==1)||(numberUser==3&& numberPC==2)){
                System.out.println("YOU WIN!!!!");
                }else{
                    //user loss
                    System.out.println("Too bad...you lose :( ");
                }
            }
        }    
    }
}
