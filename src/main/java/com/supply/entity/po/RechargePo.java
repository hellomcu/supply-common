package com.supply.entity.po;

import java.math.BigDecimal;

import com.supply.entity.base.BasePo;

public class RechargePo extends BasePo
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 948645889123218245L;

	
	private long userId;
	private long storeId;
	private BigDecimal amount;
	private long fromId;
	public long getUserId()
	{
		return userId;
	}
	public void setUserId(long userId)
	{
		this.userId = userId;
	}
	public long getStoreId()
	{
		return storeId;
	}
	public void setStoreId(long storeId)
	{
		this.storeId = storeId;
	}
	public BigDecimal getAmount()
	{
		return amount;
	}
	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}
	public long getFromId()
	{
		return fromId;
	}
	public void setFromId(long fromId)
	{
		this.fromId = fromId;
	}
	
	
	
	
	
}
