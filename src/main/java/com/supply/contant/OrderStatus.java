package com.supply.contant;


/**
 * 订单状态
 * @author ly
 *
 */
public enum OrderStatus
{
	STATUS_NONE,
	/**
	 * 已下单
	 */
	STATUS_UNDER,
	
	/**
	 * 出货中
	 */
	STATUS_OUTING,
	
	/**
	 * 配送中
	 */
	STATUS_DELIVERING,
	
	/**
	 * 已到达
	 */
	STATUS_ARRIVED,
	
	/**
	 * 已收货
	 */
	STATUS_RECEIVED,
}
