package abstractFactory;

/**
 * Class FabricaAmerica
 */
public class FabricaAmerica extends FabricaContinente
{
	// Methods
	public Carnivoro criaCarnivoro()
	{
		return new Lobo();
	}

	public Herbivoro criaHerbivoro()
	{
		return new Bisonte();
	}
}
