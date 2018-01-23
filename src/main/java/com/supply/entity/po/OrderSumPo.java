package com.supply.entity.po;

import java.math.BigDecimal;

import com.supply.entity.base.BasePo;

public class OrderSumPo extends BasePo
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -583804733583015684L;

	private BigDecimal totalPrice;
	private long totalCount;
	public BigDecimal getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	public long getTotalCount()
	{
		return totalCount;
	}
	public void setTotalCount(long totalCount)
	{
		this.totalCount = totalCount;
	}
	
	
}
