import org.junit.Assert;

public class JUnit_TestFecha {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(12,4,1940);
		Assert.assertEquals(true, fecha.fechaCorrecta());
		//se comprueba que un formato valido devuelva el valor deseado
		
		fecha.setDia(41);
		Assert.assertEquals(false, fecha.fechaCorrecta());
		//se comprueba lo contrario con una fecha invalida
		
		Fecha fecha2 = new Fecha(24,7,2030);
		Assert.assertEquals("14/7/2030", fecha.toString());
		//se comprueba que el formato de salida se de correctamente
		
	}

}
