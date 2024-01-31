package abstractFactory;

/**
 * Class Leao AbstractProductB
 */
public class Leao extends Carnivoro
{
	// Methods
	public void devora(Herbivoro h)
	{
		// caça Antilope
		System.out.println( this + " caça o " + h );
	}

	/**
	 * @return String
	 */
	public String toString()
	{
		return "Leao";
	}
}
