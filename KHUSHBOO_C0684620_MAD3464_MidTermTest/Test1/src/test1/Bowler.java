package test1;

import java.util.Scanner;

public class Bowler extends Player
{
    Scanner input = new Scanner(System.in);
    double noOversThrown;
    double noRunsGiven;    
    double noWicketTaken;      
    double runsPerOver;
    double runsPerWicket;
    double bowlingPoints;
    
    Bowler()
    {
        super();
        this.noOversThrown = 20;
        this. noRunsGiven =  120; 
        this.noWicketTaken =  11;
        this. runsPerOver = 30 ;
        this. runsPerWicket = 2;
        this. bowlingPoints = 16 ;
    }
    
    Bowler(String PlId, String Pname, double not, double nrg,double nwt,double rpo,double rpw ,double bp)
    {
        super(PlId,Pname);
        this.noOversThrown = not;
        this. noRunsGiven =  nrg; 
        this.noWicketTaken =  nwt;
        this. runsPerOver = rpo ;
        this. runsPerWicket = rpw;
        this. bowlingPoints = bp ;
    }
    
    void readData()
    {
        super.readData();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Overs Thrown : ");
        this.noOversThrown = input.nextDouble();
        System.out.println("Enter Number of Runs Given : ");
        this.noRunsGiven = input.nextDouble();
        System.out.println("Enter Number of Wickets Taken : ");
        this.noWicketTaken = input.nextDouble();
        System.out.println("Player : Bowler ");
     }
    
    void displayData()
    {
        super.displayData();
        System.out.println("Runs Per Over : " + this. runsPerOver);
        System.out.println("Runs Per Wicket : " + this. runsPerWicket);
        System.out.println("Bowling Points : " + this. bowlingPoints);
    }
    
    void calAvg()
    {
        this.runsPerOver = noRunsGiven/noOversThrown;
        this.runsPerWicket = noRunsGiven/noWicketTaken;
    }
    
    void calPoints()
    {
         double points;
         double pointPerWicket = 5*noWicketTaken;
          int pointPerRun = 0;
          if(noRunsGiven<=3){
              pointPerWicket = 10;
          }
          else
          {
              pointPerWicket = 5;
          }
      points = pointPerWicket + pointPerRun;
      this.bowlingPoints = points;
    }
}
