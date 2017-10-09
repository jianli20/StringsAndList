package tools.controller;

import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;
import tools.view.PublicDisplay;


public class Controller
{
	private List<Kahoot> myKahoots;
	private PublicDisplay popup; 
	
	public Controller()
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
//		showTheList();
		changeTheList();
		practiceList();
	}
	
	private void showTheList()
	{
		String currentCreator = "";
		for (int index = 0; index < myKahoots.size(); index ++)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if (currentCreator.equals("nobody"))
			{
				for (int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("wow nobody does a lot");
				}
			}
		
		
		for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
		{
			popup.displayText(currentCreator.substring(currentLetterIndex,  currentLetterIndex + 1));
		}
		
		
		String topic = currentKahoot.getTopic();
		
		for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
		{
			popup.displayText(topic.substring(letter, letter + 1));
		}
		}
	}
	
	//Created a private list for Kahoots
	private void fillTheList()

	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The fifty United States");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "The Double data type");
		Kahoot nameContinents = new Kahoot("Jian", 7, "The 7 continnents in the world");
		Kahoot animalColor = new Kahoot("Branton", 10, "All the colors of the animals");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything - literally");
		
	//Adds Kahoots to myKahoot list
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(nameContinents);
		myKahoots.add(animalColor);
		myKahoots.add(bigQuiz);
	}
	
	private void changeTheList()

	{
	popup.displayText("The current list size is: " + myKahoots.size());
	Kahoot removed = myKahoots.remove(3);
	popup.displayText("I removed the Kahoot by " + removed.getCreator());
	popup.displayText("The list now has: " + myKahoots.size() + "items inside.");
	myKahoots.add(0, removed);
	
	popup.displayText("The list is still: " + myKahoots.size() + " items big.");
	removed = myKahoots.set(2, new Kahoot());
	popup.displayText("The kahoot by " + removed.getCreator() + " was repalced with on by: " +myKahoots.get(2).getCreator());
	}
  private void practiceList()
	{
		Kahoot myColors = new Kahoot("Jian", 2, " My sweatshirt colors");

		myKahoots.add(myColors);
		Kahoot remove = myKahoots.remove(5);
		popup.displayText("I removed the kahoot made by " + remove.getCreator());
		popup.displayText("The list now has " + myKahoots.size() + " items inside.");
		
		
		
		String getList = popup.getResponse("What list would you like to remove?");
		myKahoots.remove(getList);
		popup.displayText(" Removed item: " + getList + " from the list");
		
		
  }

	public PublicDisplay getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}
}
	

