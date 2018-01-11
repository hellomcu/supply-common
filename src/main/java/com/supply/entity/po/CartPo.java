package com.supply.entity.po;

import java.math.BigDecimal;
import java.util.List;

import com.supply.entity.base.BasePo;

public class CartPo extends BasePo
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3462591519498779795L;

	
	private long userId;
	private long storeId;
	private BigDecimal totalPrice;
	private long productNum;
	private String cartRemark;
	private int cartStatus;
	private List<CartDetailPo> details;
	
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
	public BigDecimal getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	public long getProductNum()
	{
		return productNum;
	}
	public void setProductNum(long productNum)
	{
		this.productNum = productNum;
	}
	public String getCartRemark()
	{
		return cartRemark;
	}
	public void setCartRemark(String cartRemark)
	{
		this.cartRemark = cartRemark;
	}
	public int getCartStatus()
	{
		return cartStatus;
	}
	public void setCartStatus(int cartStatus)
	{
		this.cartStatus = cartStatus;
	}
	public List<CartDetailPo> getDetails()
	{
		return details;
	}
	public void setDetails(List<CartDetailPo> details)
	{
		this.details = details;
	}
	
	
}
