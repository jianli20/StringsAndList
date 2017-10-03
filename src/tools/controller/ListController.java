package tools.controller;

import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;
import tools.view.PublicDisplay;


public class ListController
{
	private List<Kahoot> myKahoots;
	private PublicDisplay popup; 
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new PublicDisplay();
		
	}
	// Start method for Kahoot Class
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		for (int index = 0; index < myKahoots.size(); index ++)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
	}
	
	//Created a private list for Kahoots
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot nameContinents = new Kahoot("Jian", 7);
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		
	//Adds Kahoots to myKahoot list
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(nameContinents);
		myKahoots.add(animalColor);
		myKahoots.add(bigQuiz);
	}
}
