package net.tompy.ggt.component;


public abstract class EntityAbstractImpl implements Entity 
{
	private long id;
	private String name;
	
	public void setID(long i) 
	{
		id = i;
	}

	public long getID() 
	{
		return id;
	}

	public void setName(String n) 
	{
		name = n;
	}

	public String getName() 
	{
		return name;
	}

}
