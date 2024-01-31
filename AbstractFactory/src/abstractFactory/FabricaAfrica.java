package abstractFactory;

/**
 * Class FabricaAfrica
 */
public class FabricaAfrica extends FabricaContinente
{
	// Methods
	public Carnivoro criaCarnivoro()
	{
		return new Leao();
	}

	public Herbivoro criaHerbivoro()
	{
		return new Antilope();
	}
}
