
package juegocarros;
import java.util.Random;

public class generarnumeros {
public int iValorTirada;

public int calcularnumero()
{

 Random rGenerador = new Random();  
 
iValorTirada = rGenerador.nextInt(6)+1; 

return iValorTirada;
}

    
}
