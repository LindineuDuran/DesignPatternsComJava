package abstractFactory;

/**
 * Class Jogo
 */
public class Jogo
{

	public static void main(String[] args)
	{
		// Criar e executar o Mundo Animal de Africa
		FabricaContinente africa = new FabricaAfrica();
		MundoAnimal mundo = new MundoAnimal(africa);
		mundo.executaCadeiaAlimentar();

		// Criar e executar o Mundo Animal de América
		FabricaContinente america = new FabricaAmerica();
		mundo = new MundoAnimal(america);
		mundo.executaCadeiaAlimentar();
	}
}
