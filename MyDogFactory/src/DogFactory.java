public class DogFactory
{
	public static Dog getDog(String criteria)
	{
		if (criteria.contentEquals("small"))
		{
			return new Poodle();
		}
		else if (criteria.contentEquals("big"))
		{
			return new Rottweiler();
		}else if (criteria.contentEquals("working"))
		{
			return new SiberianHusky();
		}
		
		return null;
	}
}
