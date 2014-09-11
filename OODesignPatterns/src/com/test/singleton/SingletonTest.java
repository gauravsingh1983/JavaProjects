package com.test.singleton;

public class SingletonTest
{

	class CloneableSingleton  implements Cloneable
	{
		CloneableSingleton()
		{
		
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException
		{
			// TODO Auto-generated method stub
			return super.clone();
		}
	}
	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{
		// TODO Auto-generated method stub
		//Singleton s = Singleton.getInstance();
		//s.doSomething();

			//SingletonEarly se1 = SingletonEarly.getInstance();
		//	se1.doSomething();	
			try
			{
				////////////////SingletonEarly se1 = (SingletonEarly) SingletonEarly.getInstance().clone();
				//se1.doSomething();
				
				//SingletonEarly se2 = new SingletonEarly();
				//se2.doSomething();
				//throw new CloneNotSupportedException();
				
				MySingleton.resource.doSomething();
				
			}
			catch (CloneNotSupportedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
