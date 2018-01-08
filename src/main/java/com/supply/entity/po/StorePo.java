package com.supply.entity.po;

import java.math.BigDecimal;

import com.supply.entity.base.BasePo;

public class StorePo extends BasePo
{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -932709462221273061L;
	
	private String storeName;
	private String storePlace;
	private String contacts;
	private String contactWay;
	private BigDecimal balance;
	private String description;
	private int storeType;

	public String getStoreName()
	{
		return storeName;
	}
	public void setStoreName(String storeName)
	{
		this.storeName = storeName;
	}
	public String getStorePlace()
	{
		return storePlace;
	}
	public void setStorePlace(String storePlace)
	{
		this.storePlace = storePlace;
	}
	public String getContacts()
	{
		return contacts;
	}
	public void setContacts(String contacts)
	{
		this.contacts = contacts;
	}
	public String getContactWay()
	{
		return contactWay;
	}
	public void setContactWay(String contactWay)
	{
		this.contactWay = contactWay;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public int getStoreType()
	{
		return storeType;
	}
	public void setStoreType(int storeType)
	{
		this.storeType = storeType;
	}
	public BigDecimal getBalance()
	{
		return balance;
	}
	public void setBalance(BigDecimal balance)
	{
		this.balance = balance;
	}
	
	
	
}
