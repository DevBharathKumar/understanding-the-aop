package org.bharath.aop.understandingtheaop.business;

import org.bharath.aop.understandingtheaop.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 
{
	@Autowired
	Dao2 dao2;
	
	public String someBusiness2()
	{
		int x = 1/0;
		return dao2.retrieveData();
	}
}
