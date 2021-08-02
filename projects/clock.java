import java.util.Scanner;

public class clock {
    static int[] Time(int startHour, int startMinutes, int stopHour, int stopMinutes){
        

        //calculating workminutes
        int lessHour=0;
        int workMinutes= stopMinutes- startMinutes;
        if(workMinutes<0){
            lessHour+=1;
            workMinutes=60+workMinutes;
        }
        //calculating workhours
        int workHours= (stopHour-startHour)-lessHour;
        if (workHours<0){
            workHours=24+workHours;
        }

        //put 2 values into array to both be returned
        int[] workTime= new int [2];
        workTime[0]=workHours;
        workTime[1]=workMinutes;

        return workTime;
        
    }

    static double Money(double rate, double travel,int workHours,int workMinutes){
        double money= (rate*workHours)+(rate*workMinutes/60)+travel;
        return money;
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int startHour=25;
        int startMinutes=61;
        int stopHour=25;
        int stopMinutes=61;

        System.out.println("Welcome to worktime calculator");

        System.out.println("Please enter the time you start working:");

        while(startHour>24){
            System.out.println("Hour: ");
            startHour= Integer.parseInt(input.next());
        }
        
        while(startMinutes>60){
            System.out.println("Minutes: ");
            startMinutes= Integer.parseInt(input.next());
        }
        System.out.println("Please enter the time you stop working:");

        while(stopHour>24){
            System.out.println("Hour: ");
            stopHour= Integer.parseInt(input.next());
        }
        while(stopMinutes>60){
            System.out.println("Minutes: ");
            stopMinutes= Integer.parseInt(input.next());
        }

        System.out.println("Starttime: "+startHour+":"+ startMinutes);
        System.out.println("Stoptime: "+stopHour+":"+ stopMinutes);

        int workHours= Time(startHour,startMinutes,stopHour,stopMinutes)[0];
        int workMinutes=Time(startHour,startMinutes,stopHour,stopMinutes)[1];

        System.out.println("Time worked: "+workHours+"H, "+workMinutes+"mins");
        

        System.out.println("Do you want to calculate your work money? enter yes/no:");
        String answerUser= input.next();
        answerUser=answerUser.toLowerCase();
        System.out.println(answerUser);
        if(answerUser.equals("yes")){
            System.out.println("Please enter how much you get paid per hour: ");
            double rate=Double.parseDouble(input.next());
            System.out.println("Please enter how much you get paid for travel expenses per day: ");
            double travel=Double.parseDouble(input.next());
            System.out.println("Work money: "+Money(rate, travel,workHours,workMinutes));
        }
    }
}
