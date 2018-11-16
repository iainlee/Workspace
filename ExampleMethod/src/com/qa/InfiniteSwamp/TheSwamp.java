package com.qa.InfiniteSwamp;

import java.util.Scanner;

public class TheSwamp
{

	int X = 0;
	int Y = 0;
	int treasureX=10;
	int treasureY=15;
	boolean completed=false;
	
	protected void intro()
	{
		System.out.println("You are in the middle of an infinite grey swamp.");
		System.out.println("This grey swamp has one distinguishing characteristic, other than the fact that it is large and infinite and dreary.");
		System.out.println("This characteristic is atrociously poor visiblity, making it hard to see more than a few metres.");
		System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");
		System.out.println("You notice a small watch-like device in your left hand.");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time.");
		System.out.println("The dial reads " + getDistance() + "m");
		System.out.println("Enter 'north' 'south' 'east' or 'west' to move 5 metres in that direction.");
		gameLoop();
	}
	
	protected void gameLoop()
	{
		while (completed==false)
		{
			updateCoords(getInput());
			System.out.println("The dial reads " + getDistance() + "m");
			getDistance();
		}
	}
	
	public String getInput()
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("You move 5 metres to the " + input);
		return input;
	}
	
	protected void updateCoords(String input)
	{
		
        switch (input)
        {
            case "north": Y+=5;
            	break;
            case "south": Y+=5;
            	break;
            case "east": X+=5;
            	break;
            case "west": X+=5;
            	break;
        }

	}
	
	protected int getDistance()
	{
		
		/*pseudocode:
		if (X > treasureX)
		{
		distanceX = treasureX - X)
		}
		else if (X < treasureX)
		{
		distanceX = treasureX + X
		}
		int trueDistance = distanceX + distanceY;
		return trueDistance;
		*/
		
        int distance = ((treasureX - X) + (treasureY - Y));
		//I am aware that this is a terrible calculation
        if (distance == 0)
        {
        completed=true;
    	System.out.println("Treasure!");
        }
        else
        {
        }
        
        return distance;
	}
	
}