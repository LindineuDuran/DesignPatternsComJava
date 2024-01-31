public class MaquinaDeRefrigerante extends MaquinaDeBebidas
{
	public Bebida entregaBebida()
	{
		return new Refrigerante();
	}
}
