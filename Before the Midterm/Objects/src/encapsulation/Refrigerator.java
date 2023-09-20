package encapsulation;

public class Refrigerator 
{
	private int temperature;
	protected String color;
	
	//setTemperature
	public void setTemperature(int newTemperature)
	{
		if(newTemperature >= 0)
		{
			temperature = newTemperature;
		}
		else
		{
			resetTemperature();
		}
	}
	
	//getTemperature
	public int getTemperature()
	{
		return temperature;
	}
	
	//resetTemperature
	public void resetTemperature()
	{
		temperature = 275;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
