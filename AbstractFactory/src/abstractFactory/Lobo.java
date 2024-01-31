package abstractFactory;

/**
 * Class Lobo AbstractProductB
 */
public class Lobo extends Carnivoro
{
	// Methods
	public void devora(Herbivoro h)
	{
		// caça Bisonte
		System.out.println(this + " caça o " + h);
	}

	public String toString()
	{
		return "Lobo";
	}
}
