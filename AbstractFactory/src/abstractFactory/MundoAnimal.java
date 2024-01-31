package abstractFactory;

/**
 * Class MundoAnimal
 */
public class MundoAnimal
{
	// Fields
	private Carnivoro carnivoro;
	private Herbivoro herbivoro;

	// Constructores
	public MundoAnimal(FabricaContinente fabrica)
	{
		carnivoro = fabrica.criaCarnivoro();
		herbivoro = fabrica.criaHerbivoro();
	}

	// Methods
	public void executaCadeiaAlimentar()
	{
		herbivoro.pasta();
		carnivoro.devora(herbivoro);
	}
}
