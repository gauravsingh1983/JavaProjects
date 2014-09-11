package serialization;

import java.io.Serializable;

public class Marks implements Serializable
{
	int	mathsMarks;
	int	historyMarks;
	int	scienceMarks;

	Marks(int mathsMarks, int historyMarks, int scienceMarks)
	{
		this.mathsMarks = mathsMarks;
		this.historyMarks = historyMarks;
		this.scienceMarks = scienceMarks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Marks [mathsMarks=" + mathsMarks + ", historyMarks=" + historyMarks + ", scienceMarks=" + scienceMarks + "]";
	}

}
