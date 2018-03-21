package test1;

import java.util.Scanner;

public class Player
{
    Scanner input = new Scanner(System.in);
    String PlayerID;
    String PlayerName;
    
    Player()
    {
        this.PlayerID = "Unknown";
        this.PlayerName = "Unknown";
    }
    
    Player(String PId, String PNm)
    {
        this.PlayerID = PId;
        this.PlayerName = PNm;
    }   
    
    Player(Player object)
    {
        this.PlayerID = object.PlayerID;
        this.PlayerName = object.PlayerName;
    }
    
    void readData()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Player ID : ");
        this.PlayerID = input.nextLine();
        
        System.out.println("Enter Player Name : ");
        this.PlayerName = input.nextLine();
    }
    
    void displayData()
    {
        System.out.println("Player ID : " + this.PlayerID);
        System.out.println("Player Name : " + this.PlayerName);
    }
}
