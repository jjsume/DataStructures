/* Queue -data Type
 *  
 * Jere Sumell
 * 21.04.2021
 * jere.sumell@iki.fi
 * jjsume@github
 */


public class Jono extends DataStructs {

	public Jono() {
		super();
	}

	public  void jonoAdd(Integer x) {
		super.getList().add(x);
		System.out.println(" - " +x +" - lisätty jonoon!");
	}

	public  Integer jonoNext() {
		Integer t = super.getList().get(0);
		super.getList().remove(0);
		return t;
	}

	
	public void alustaJono(int y) {
		Integer temp = new Integer(super.getR().nextInt(100)+1);
		for (int x=0;x<y;x++) {
			this.jonoAdd(temp);
			this.tulosta();
			temp = new Integer(super.getR().nextInt(100)+1);
		}
}
}