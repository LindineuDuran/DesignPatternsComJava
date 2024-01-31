public class MaquinaDeCafe extends MaquinaDeBebidas
{
	public Bebida entregaBebida(TipoDoCafe tipoDoCafe)
	{
		Bebida cafe = null;
		
		switch (tipoDoCafe)
		{
		case EXPRESSO: cafe = new CafeExpresso();
		case CARIOCA: cafe = new CafeCarioca();
		}
		return cafe;
	}

	@Override
	public Bebida entregaBebida()
	{
		return new Cafe();
	}
}
