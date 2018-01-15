package com.supply.entity.po;

import java.math.BigDecimal;

import com.supply.entity.base.BasePo;

public class CartDetailPo extends BasePo
{


	/**
	 * 
	 */
	private static final long serialVersionUID = -3432523962522621732L;
	private long cartId;
	private long productId;
	private String productName;
	private long productNum;
	private BigDecimal unitPrice;
	private String productUnit;
	public long getCartId()
	{
		return cartId;
	}
	public void setCartId(long cartId)
	{
		this.cartId = cartId;
	}
	public long getProductId()
	{
		return productId;
	}
	public void setProductId(long productId)
	{
		this.productId = productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public long getProductNum()
	{
		return productNum;
	}
	public void setProductNum(long productNum)
	{
		this.productNum = productNum;
	}
	public BigDecimal getUnitPrice()
	{
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	public String getProductUnit()
	{
		return productUnit;
	}
	public void setProductUnit(String productUnit)
	{
		this.productUnit = productUnit;
	}
	
	
	
}
