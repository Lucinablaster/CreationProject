package model;

public class numberSuffix
{
	private String st;
	private String nd;
	private String rd;
	
	
	public numberSuffix()
	{
			
	}
	
	public numberSuffix(String st, String nd, String rd)
	{
		this.st = st;
		this.nd = nd;
		this.rd = rd;
	}
	
	
	public void setSt(String st, String nd, String rd)
	{
		this.st = st;
		this.nd = nd;
		this.rd = rd;
	}
	
	for (int index = 0; index < duckArray.length; index += 1)
	{
		if (index % 2 == 0)
		{
			duckArray[index] = new Duck();
		}
		else
		{
			duckArray[index] = new Duck(index * 30);
		}
	}
	/*
	public void setNd(String nd)
	{
		this.nd = nd;
	}
	
	public void setRd(String rd)
	{
		this.rd = rd;
	}
	*/
//	public String getSt(), getNd(), getRd()
//	{
///		return st;
//		return nd;
//		return rd;
	}
	/*
	public String getNd()
	{
		return nd;
	}
	
	public String getRd()
	{
		return rd;
	}
	*/
//}
