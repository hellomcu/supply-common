package com.supply.exception;

public class SupplyException extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5021779341030545803L;
	
	private int code;

	public SupplyException()
	{
		super();
	}

	public SupplyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SupplyException(String message, Throwable cause)
	{
		super(message, cause);
	}


	
	public SupplyException(String message)
	{
		super(message);
	}
	
	public SupplyException(String message, int code)
	{
		super(message);
		this.code = code;
	}

	public SupplyException(Throwable cause)
	{
		super(cause);
	}



}
