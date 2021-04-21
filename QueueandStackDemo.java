/*
 * Demo Class for Queue and Stack -data types
 * 
 * Demonstrating data structure including Integer -objects evolution.
 * 
 * Jere Sumell
 * 21.04.2021
 * jere.sumell@iki.fi
 * jjsume@github
 */

public class QueueandStackDemo {
	public static void main(String[] args) {
		Jono jono = new Jono();
		Pino pino = new Pino();
		//Alustetaan jono ja pino.
		jono.alustaJono(10);
		pino.alustapino(10);
		//Tulostetaan pinon kehitys
		System.out.println("pino");
		pino.tulosta();
		while (pino.getList().size()>0) {
			System.out.println(" pinon seuraava poistettava: " +pino.pinoNext());
			pino.tulosta();
		}
		if (pino.getList().size() <=0) {
			System.out.println("pino on tyhjä!");
		}

	//Tulostetaan jonon kehitys
	System.out.println("jono");
	jono.tulosta();
	while (jono.getList().size()>0) {
		System.out.println(" jonon seuraava poistettava: " +jono.jonoNext());
		jono.tulosta();
	}
	if (jono.getList().size() <=0) {
		System.out.println("jono on tyhjä!");
	}


	}
}
