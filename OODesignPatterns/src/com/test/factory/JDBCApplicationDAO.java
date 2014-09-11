package com.test.factory;

/**
 * Application-scoped DAO implementation. Defines persistence operations that
 * apply to and are shared by all entity-level persistence requirements.
 * 
 * Also serves as a utility implementation for helper persistence operations
 * 
 * @author obi.orjiekwe
 */
public class JDBCApplicationDAO implements DAO
{

	private static class Factory extends DAOFactory
	{
		@Override
		protected DAO create()
		{
			return new JDBCApplicationDAO();
		}
	}

	static
	{
		DAOFactory.addFactory(JDBCApplicationDAO.class.getName(), new Factory());
	}

	@Override
	public String doSomething()
	{
		return "This is doSomething() method in JDBCApplicationDAO";

	}

}