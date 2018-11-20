package controller;

import model.CreationMembers;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class CreationController
{
private CreationMembers event;
	
	public CreationController()
	{
		event = new CreationMembers();
	
	}

	public void start()
	{
		String userInput = JOptionPane.showInputDialog(null, "Just your friendly neighborhood computer! I wanted to ask what you were ranked at your last event?");
		int ranking = 0;
		if (validInt(userInput))
		{
			ranking = Integer.parseInt(userInput);
			event.setRanking(ranking);
		}
		
		userInput = JOptionPane.showInputDialog(null, "Alright! What place did you take at that event?");
		int placement = 0;
		if (validInt(userInput))
		{
			placement = Integer.parseInt(userInput);
			event.setPlacement(placement);
		}
		
		userInput = JOptionPane.showInputDialog(null, "Sweet! Finally, how much money did you make from it?");
		int revenue = 0;
		if (validInt(userInput))
		{
			revenue = Integer.parseInt(userInput);
			event.setRevenue(revenue);
		}
	
		
		//for-each(ranking, placement)
		//{
			//whatIntEnd(ranking && placement)
//		}
		
		JOptionPane.showMessageDialog(null, event);
	}

	
	
	String numberSuffix = new String[3];
	
	
	//private void numberSuffix()
	//{
	//	ArrayList<CreationMembers> numberSuffix = new ArrayList<CreationMembers>();
	//	
	//	CreationMembers st = st;
	//	CreationMembers nd = nd;
	//	CreationMembers rd = rd;
	//	numberSuffix.add(st);
	//	numberSuffix.add(nd);
	//	numberSuffix.add(rd);
		
//	}
/*
	public String whatIntEnd(String th)
	{
		th = "";
		if(userInput == 1)
		{
			return "st";
		}
		else if(ranking == 2)
		{
			return "nd";
		}
		else if(userInput == 3)
		{
			return "rd";
		}
		else(userInput < 3)
		{
			return "th";
		}
		return th;
	}
*/	
	/*Right here I was trying to set a for loop to check each of the ints that had been set, and if it equaled 1, 2, or 3
	 it would put the corresponding suffix behind it. I couldn't figure out which variables needed to be put in, and
	 I couldn't figure out how to format it. I was going to make a getter and setter for each of the things, but I didn't
	 have the time in the end because eclipse ended up randomly shutting down before I had saved a large portion of my
	 code, which meant that I couldn't do everything that I wanted to. I probably needed to set 2 different variables for 
	 both ranking and placement, but I just didn't have the time.
	*/
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		return isValid;
	}

	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number with a . in the middle");
		}
		return isValid;
	}
}
