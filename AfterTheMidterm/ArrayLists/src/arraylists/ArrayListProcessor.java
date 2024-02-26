package arraylists;

import java.util.ArrayList;

public class ArrayListProcessor 
{
	public static double findMin(ArrayList<Double> list)
	{
		double minimum = list.get(0);
		//double minimum = Double.MAX_VALUE;
		for(double element : list)
		{
			if(element < minimum)
			{
				minimum = element;
			}
		}
		return minimum;
	}
	
	public static double findMax(ArrayList<Double> list)
	{
		double maximum = list.get(0);
		//double maximum = Double.MIN_VALUE;
		for(double element : list)
		{
			if(element > maximum)
			{
				maximum = element;
			}
		}
		return maximum;
	}
	
	public static ArrayList<Double> findExtremes(ArrayList<Double> list)
	{
		double min = findMin(list);
		double max = findMax(list);
		
		ArrayList<Double> extremes = new ArrayList<Double>();
		extremes.add(min);
		extremes.add(max);
		
		return extremes;
	}
	
	public static ArrayList<Double> removeRepeated(ArrayList<Double> list)
	{
		ArrayList<Double> copy = new ArrayList<Double>(list);
		copy.sort(null);
		
		int i = 0;
		while(i < copy.size() - 1)
		{
			//System.out.println(copy.get(i) + ", " + copy.get(i+1));
			
			//Could cast to primitive values to overcome the object problem
//			if((double)copy.get(i) == (double)copy.get(i + 1))
//				System.out.println("They're the same!");
			
			//Have to use .equals because ArrayLists are made up of OBJECT Doubles, not primitives!
			if(copy.get(i).equals(copy.get(i+1)))
			{
				copy.remove(i);
			}
			else
			{
				i++;
			}
		}
		
		return copy;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Double> data = new ArrayList<Double>();
		data.add(5.0);
		data.add(3.0);
		data.add(7.3);
		data.add(3.0);
		System.out.println(removeRepeated(data));
		System.out.println(findExtremes(data));
	}

}
