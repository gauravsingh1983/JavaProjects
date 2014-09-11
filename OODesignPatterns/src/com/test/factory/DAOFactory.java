package com.test.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory class containing the default implementation of createDAO
 */
public abstract class DAOFactory
{
	protected abstract DAO create();

	private static Map<String, DAOFactory> factories = new HashMap<String, DAOFactory>();


	/**
	 * Stores the given factory into a Map of factories with the supplied id
	 * 
	 * @param id the id of the factory
	 * @param f the factory to add
	 */
	public static void addFactory(String id, DAOFactory f)
	{
		factories.put(id, f);
	}

	/**
	 * Creates and returns an instance of a SubscriberDAO
	 * 
	 * @param id - fully qualified name of class
	 * @return The DAO object defined by the id specified
	 */
	public static final DAO createDAO(String id)
	{
		if (!factories.containsKey(id))
		{
			try
			{
				// Load dynamically - will cause class to run it static
				// initialization
				Class.forName(id);
			}
			catch (ClassNotFoundException e)
			{
				throw new RuntimeException("Bad shape creation: " + id);
			}

			// See if it was put in:
			// did loading class run it's static initializer?
			if (!factories.containsKey(id))
			{
				throw new RuntimeException("Bad shape creation: " + id);
			}
		}

		return ((DAOFactory) factories.get(id)).create();
	}
}
