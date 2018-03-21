package test1;

import java.util.Scanner;

public class Batsman extends Player
{
  Scanner input = new Scanner(System.in);
    
    double noBowlsPlayed;    
    double runsTaken [] = new double[6];;      
    double strikeRate;
    double TotalRuns;
    double batingPoints;
    
    
    Batsman()
    {
        super();
        this. noBowlsPlayed =  160; 
        for(int i =0; i<=6; i++)
        {
           this.runsTaken[i]=0;
           
         }
        this. strikeRate = 300 ;
        this. TotalRuns = 200;
        this. batingPoints = 160 ;
    }
    
    Batsman(String PlId, String Pname, double nbp, double rt,double sr,double tr,double btp)
    {
        super(PlId,Pname);
        this.noBowlsPlayed = nbp;
        for(int i =0; i<=6; i++)
        {
           this.runsTaken[i]=0;
           
       } 
        this.strikeRate =  sr;
        this. TotalRuns = tr ;
        this. batingPoints = btp;
    }
    
    void readData()
    {
        super.readData();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Bawls Played : ");
        this.noBowlsPlayed = input.nextDouble();
        System.out.println("Enter Number of Runs Taken : ");
        for(int i =0; i<7; i++)
        {
        System.out.println("enter no of 1's taken:  ");
         
            this.runsTaken[0]=input.nextInt(); 
         
         System.out.println("enter no of 4's taken:  ");
        
            this.runsTaken[2]=input.nextInt(); 
            
         System.out.println("enter no of 6's taken:  ");
        
            this.runsTaken[5]=input.nextInt();
         break;
        }
     }
        
    
    void displayData()
    {
        super.displayData();
        System.out.println("Strike Rate : " + this. strikeRate);
        System.out.println("Total Runs : " + this. TotalRuns);
        System.out.println("Bating Points : " + this. batingPoints);
    }
    
    void calAvg()
    {
        this.TotalRuns = (4*this.runsTaken[2])+(6*this.runsTaken[5]  + (runsTaken[0]));
        this.strikeRate = TotalRuns/noBowlsPlayed;
    }
    
    void calPoints()
    {
        Double points;
        Double pointsfour = 3*runsTaken[2];
        Double pointsfor5 = 5*runsTaken[5];
        
        points = pointsfour + pointsfor5;
        this.batingPoints = points;
        super.displayData();
         System.out.println("no of bowls played:" + this.noBowlsPlayed + "\n no of runs taken:" +(this.runsTaken[0]+ 4*this.runsTaken[2] + 6*this.runsTaken[5])  + "\n strike rate : " + this.strikeRate);
         System.out.println(" total runs: " + this.TotalRuns + "\nbating points: " + this.batingPoints);
          
    }

 
        
        
    
}
    
