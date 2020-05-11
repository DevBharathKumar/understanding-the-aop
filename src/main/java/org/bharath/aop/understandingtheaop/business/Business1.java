package org.bharath.aop.understandingtheaop.business;

import org.bharath.aop.understandingtheaop.aspect.TimeTaken;
import org.bharath.aop.understandingtheaop.dao.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 
{
	@Autowired
	Dao1 dao1;
	
	@TimeTaken
	public String someBusiness1()
	{
		return dao1.retrieveData();
	}
}
