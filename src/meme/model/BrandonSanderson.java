package meme.model;

public class BrandonSanderson implements Memeable
{

	public boolean isDank()
	{
		return false;
	}

	public boolean isNormie()
	{
		return false;
	}

	public double getDankness()
	{
		return 0;
	}

	public boolean isSpicy()
	{
		return false;
	}

	public String getName()
	{
		return this.getClass().getSimpleName();
	}

}
