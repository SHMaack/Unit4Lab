package com.olympic.cis143.m04.student.tacotruck.set;

import java.util.*;
import com.olympic.cis143.m04.student.tacotruck.Orders;
import com.olympic.cis143.m04.student.tacotruck.TacoImpl;

public class OrdersSetImpl  implements Orders 
{
	private LinkedHashSet<TacoImpl> tacoQueue = new LinkedHashSet<>();
    @Override
    public void addOrder(TacoImpl tacoOrder) 
    {
    	this.tacoQueue.add(tacoOrder);
    }

    @Override
    public boolean hasNext() 
    {
        return !this.tacoQueue.isEmpty();
    }

    @Override
    public int howManyOrders()
    {
        return tacoQueue.size();
    }

	@Override
	public TacoImpl closeNextOrder()
	{
		Object [] tempArray = tacoQueue.toArray();
		Object tempTaco = tempArray[0];
		tacoQueue.remove(tempTaco);
		return (TacoImpl) tempTaco;
		
	}
}
