package com.supply.entity;

import java.util.List;

import com.supply.entity.base.BaseEntity;


public class PageInfo<T> extends BaseEntity
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 71202666408338674L;
	//当前页
	private long currentPage = 1;
	//总页数
	private long totalPage;
	//每页记录数
	private int itemNum = 20;
	//总记录数
	private long totalNum;
	
	private List<T> list;
	/**
	 * 从第几条记录开始(从0开始)
	 * @return
	 */
	public long getStartItemNum()
	{
		return currentPage * itemNum - itemNum;
	}
	
	public int getItemNum()
	{
		return itemNum;
	}

	public void setItemNum(int itemNum)
	{
		this.itemNum = itemNum;
	}

	public long getCurrentPage()
	{
		return currentPage;
	}


	public void setCurrentPage(long currentPage)
	{
		this.currentPage = currentPage;
	}


	public long getTotalPage()
	{
		return totalPage;
	}


	public void setTotalPage(long totalPage)
	{
		this.totalPage = totalPage;
	}

	public List<T> getList()
	{
		return list;
	}

	public void setList(List<T> list)
	{
		this.list = list;
	}

	public long getTotalNum()
	{
		return totalNum;
	}

	public void setTotalNum(long totalNum)
	{
		this.totalNum = totalNum;
	}

	
	public long calcTotalPage()
	{
		return Math.round(Math.ceil(totalNum * 1.0 / itemNum));
	}
}
