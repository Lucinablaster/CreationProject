package model;

public class CreationMembers
{
	private int ranking;
	private int placement;
	private int revenue;
	private String st;
	private String nd;
	private String rd;
	
	
	public CreationMembers()
	{
		
	}
	/*
	public numberSuffix()
	{
			
	}
	
	public numberSuffix(String st, String nd, String rd)
	{
		this.st = st;
		this.nd = nd;
		this.rd = rd;
	}
	
	*/
	public CreationMembers(int ranking, int placement, int revenue)
	{
		this.ranking = ranking;
		this.placement = placement;
		this.revenue = revenue;
	}
	
	public void setRanking(int ranking)
	{
		this.ranking = ranking;
	}
	
	public void setPlacement(int placement)
	{
		this.placement = placement;
	}
	
	public void setRevenue(int revenue)
	{
		this.revenue = revenue;
	}
	
	public int getRanking()
	{
		return ranking;
	}
	
	public int getPlacement()
	{
		return placement;
	}
	
	public int getRevenue()
	{
		return revenue;
	}
	/*
	public void setSt(String st)
	{
		this.st = st;
	}
	
	public void setNd(String nd)
	{
		this.nd = nd;
	}
	
	public void setRd(String rd)
	{
		this.rd = rd;
	}
	
	public String getSt()
	{
		return st;
	}
	
	public String getNd()
	{
		return nd;
	}
	
	public String getRd()
	{
		return rd;
	}
	*/
	public String toString()
	{
		String description = "So at this event you were ranked " + ranking + "th and you placed " + placement + "th while making $"
				+ revenue + "? That's really cool!!";

		return description;
	}
}
