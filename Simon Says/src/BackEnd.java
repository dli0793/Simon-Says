import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List; 


public class BackEnd 
{
	@SuppressWarnings("unused")
	private static List<Score> readScoresFromCSV(String fileName) 
	{ 
		List<Score> scores = new ArrayList<>(); 
		Path pathToFile = Paths.get(fileName); 
		// create an instance of BufferedReader 
		// using try with resource, Java 7 feature to close resources 
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) 
		{ 
			// read the first line from the text file 
			String line = br.readLine(); 
			// loop until all lines are read 
			while (line != null) 
			{ 
				// use string.split to load a string array with the values from 
				// each line of 
				// the file, using a comma as the delimiter 
				String[] attributes = line.split(","); 
				Score score = createScore(attributes); 
				// adding book into ArrayList 
				scores.add(score); 
				// read next line before looping 
				// if end of file reached, line would be null 
				line = br.readLine(); 
			}
		}
				
		catch (IOException ioe)
		{ 	
			ioe.printStackTrace(); 
				
		} 
		
		return scores; 
	} 
	
	private static Score createScore(String[] metadata) 
	{ 	
		String name = metadata[0]; 
		int score = Integer.parseInt(metadata[1]); 
		// create and return score of this metadata 
		
		 Score a = new BackEnd.Score(name, score);
		 return a; 
	}
	
	static class Score
	{
		private String name;
		private int score;

		public Score(String name, int score)
		{
			this.name = name;
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
		
		public String toString() {
			return "Score [name=" + name + ", score=" + score + "]";
		}
	}
	
	 
	
	
	
	
	
	
	
	
	private int index; 
	private final int turns = 3; 
	public ArrayList<String> sequence; 
	private final String[] colors = {"green", "red", "yellow", "blue"};
	private boolean gameOn;
	/*
	  This is a constructor to create the SimonSays Object
	  It sets the index to zero, creates arrayList for sequence, and sets GameOn to false. 
	*/
	public BackEnd()
	{
		index = 0;
		sequence = new ArrayList<String>();
		setGameOn(false); 
	}
	
	/*
	  This starts the game by generating a random sequence and setting GameOn to true. 
	*/
	public void start()
	{
		sequence.clear();
		generateRandomSequence();
		setGameOn(true);
		index = 0; 
	}
	/*
	 This method generates a random sequence and adds random colors to the ArrayList.
	*/
	private void generateRandomSequence()
	{
		for(int i=0;i<turns;i++)
		{
			sequence.add(randomColor()); 
		}
	}
	/*
	  This checks whether the sequence entered is right or not. If the sequence is correct, a color will be added to the sequence. 
	*/
	public boolean checkSequence(String color)
	{
		if((sequence.get(index)).equals(color))
		{
			if(index==(sequence.size()-1))
			{
				addToSequence();
				index=0;
				return true;
			}
			index++;
			return true; 
		}
		else
		{
			endGame();
			return false; 
		}
	}
	/*
	  This ends the game and clears the sequence--resets game.
	*/
	public void endGame()
	{
		index = 0;
		sequence.clear();
		setGameOn(false); 
	}
	
	/*
	  This will add a random color to the sequence.
	*/
	public void addToSequence()
	{
		sequence.add(randomColor());
		for(String x:getSequence())
		{
			System.out.println(x);
		}
	}
	
	/*
	 This method will return a random color. 
	*/
	private String randomColor(){
		return colors[(int) (Math.random()*4)]; 
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public ArrayList<String> getSequence() {
		return sequence;
	}

	public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	public boolean isGameOn() {
		return gameOn;
	}
	
	public void setGameOn(boolean gameOn) {
		this.gameOn = gameOn;
	}
  
}

