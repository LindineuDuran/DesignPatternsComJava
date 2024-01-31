package abstractFactory;

/**
 * Class Leao AbstractProductB
 */
public class Leao extends Carnivoro
{
	// Methods
	public void devora(Herbivoro h)
	{
		// ca�a Antilope
		System.out.println( this + " ca�a o " + h );
	}

	/**
	 * @return String
	 */
	public String toString()
	{
		return "Leao";
	}
}
