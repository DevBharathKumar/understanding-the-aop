package org.bharath.aop.understandingtheaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	public String retrieveData()
	{
		return "DAO 1";
	}
}
