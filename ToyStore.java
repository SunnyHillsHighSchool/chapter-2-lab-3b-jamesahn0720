//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String[] toys )
	{
		for(String x : toys)
    {
      toyList.add(new Toy(x));
    }

    for(int i = toyList.size()-1; i >= 0; i--)
    {
      for(int j = 0; j < i; j++)
      {
        if(toyList.get(i).getName().equals(toyList.get(j).getName()))
        {
          toyList.get(j).setCount(toyList.get(j).getCount()+1);
          toyList.remove(i);
        }
      }
    }
	}
  
  	public Toy getThatToy( String nm )
  	{
  	for(Toy x : toyList)
      {
        if(x.getName().equals(nm))
        {
          return x;
        }
      }
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy max = toyList.get(0);
      for(int i = 0; i < toyList.size(); i++)
      {
        if(toyList.get(i).getCount()>max.getCount())
        {
          max = toyList.get(i);
        }
      }
  		return max.getName()
  	}  
  
  	public void sortToysByCount()
  	{
	for(int i = 0; i < toyList.size()-1; i++)
      {
        for(int j = i+1; j < toyList.size(); j++)
        {
          if(toyList.get(i).getCount()>toyList.get(j).getCount())
          {
            Toy temp = toyList.get(i);
            toyList.set(i, toyList.get(j));
            toyList.set(j, toyList.get(i));
          }
        }
      }	
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}
