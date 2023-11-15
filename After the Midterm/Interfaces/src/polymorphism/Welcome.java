package polymorphism;

import java.util.HashMap;

public class Welcome 
{
	public Greet greeter;
	public HashMap<String, Greet> greeterMap;
	
	public Welcome(String language)
	{
		greeterMap = new HashMap<String, Greet>();
		greeterMap.put("English", new EnglishGreeter());
		greeterMap.put("French", new FrenchGreeter());
		greeterMap.put("Arabic", new ArabicGreeter());
		greeterMap.put("German", new GermanGreeter());
		greeterMap.put("Chinese", new ChineseGreeter());
		greeterMap.put("Japanese", new JapaneseGreeter());
		greeterMap.put("Spanish", new SpanishGreeter());
		
		greeter = greeterMap.get(language);
	}
	
	public void greet()
	{
		greeter.greet();
	}
	
	public void greetAll()
	{
		for(String language: greeterMap.keySet())
		{
			greeterMap.get(language).greet();
		}
	}
	
	
	public static void main(String[] args) 
	{
		Welcome w = new Welcome("Spanish");
		w.greet();
		
		System.out.println();
		w.greetAll();
	}

}
