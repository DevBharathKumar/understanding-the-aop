package org.bharath.aop.understandingtheaop.dao;

import org.bharath.aop.understandingtheaop.aspect.TimeTaken;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	@TimeTaken
	public String retrieveData()
	{
		return "DAO 1";
	}
}
