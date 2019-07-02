package com.krish.flashing.model;

public class Brand 
{
	private int BrandId;
	private String BrandName;
	private int FoundedYear;
	private String OriginCountry;
	private String Ambassador;
	
	public int getBrandId() 
	{
		return BrandId;
	}
	public void setBrandId(int BrandId) 
	{
		this.BrandId = BrandId;
	}
	public String getBrandName() 
	{
		return BrandName;
	}
	public void setBrandName(String BrandName) 
	{
		this.BrandName = BrandName;
	}
	public int getFoundedYear() 
	{
		return FoundedYear;
	}
	public void setFoundedYear(int FoundedYear) 
	{
		this.FoundedYear = FoundedYear;
	}
	public String getOriginCountry() 
	{
		return OriginCountry;
	}
	public void setOriginCountry(String OriginCountry) 
	{
		this.OriginCountry = OriginCountry;
	}
	public String getAmbassador() 
	{
		return Ambassador;
	}
	public void setAmbassador(String Ambassador) 
	{
		this.Ambassador = Ambassador;
	}
}
