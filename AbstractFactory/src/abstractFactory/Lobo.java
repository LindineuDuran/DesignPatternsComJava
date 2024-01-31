package abstractFactory;

/**
 * Class Lobo AbstractProductB
 */
public class Lobo extends Carnivoro
{
	// Methods
	public void devora(Herbivoro h)
	{
		// ca�a Bisonte
		System.out.println(this + " ca�a o " + h);
	}

	public String toString()
	{
		return "Lobo";
	}
}