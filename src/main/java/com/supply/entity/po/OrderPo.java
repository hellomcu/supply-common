package com.supply.entity.po;

import java.math.BigDecimal;
import java.util.List;

import com.supply.contant.OrderStatus;
import com.supply.entity.base.BasePo;

public class OrderPo extends BasePo
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4518621883899524021L;
	
	
	private long storeId;
	private BigDecimal totalPrice;
	private int productNum;
	private int totalNum;
	private String receivingAddress;
	private String receiver;
	private String contacts;
	private OrderStatus orderStatus;
	private String orderRemark;
	private String storeName;
	private List<ProductPo> details;

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
	public int getProductNum()
	{
		return productNum;
	}
	public void setProductNum(int productNum)
	{
		this.productNum = productNum;
	}
	public String getReceivingAddress()
	{
		return receivingAddress;
	}
	public void setReceivingAddress(String receivingAddress)
	{
		this.receivingAddress = receivingAddress;
	}
	public String getContacts()
	{
		return contacts;
	}
	public void setContacts(String contacts)
	{
		this.contacts = contacts;
	}
	public OrderStatus getOrderStatus()
	{
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus)
	{
		this.orderStatus = orderStatus;
	}
	public String getOrderRemark()
	{
		return orderRemark;
	}
	public void setOrderRemark(String orderRemark)
	{
		this.orderRemark = orderRemark;
	}
	public String getStoreName()
	{
		return storeName;
	}
	public void setStoreName(String storeName)
	{
		this.storeName = storeName;
	}
	public int getTotalNum()
	{
		return totalNum;
	}
	public void setTotalNum(int totalNum)
	{
		this.totalNum = totalNum;
	}
	public List<ProductPo> getDetails()
	{
		return details;
	}
	public void setDetails(List<ProductPo> details)
	{
		this.details = details;
	}
	public String getReceiver()
	{
		return receiver;
	}
	public void setReceiver(String receiver)
	{
		this.receiver = receiver;
	}
	

}
