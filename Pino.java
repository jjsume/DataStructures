/*
 * Stack -Data Type.
 * 
 * Jere Sumell
 * 21.04.2021
 * jere.sumell@iki.fi
 * jjsume@github
 */

public class Pino extends DataStructs {


	public Pino() {
		super();
	}

	public  void pinoAdd(Integer x) {
		super.getList().add(0, x);

	}

	public Integer pinoNext() {
		Integer t = null;
		if (super.getList().size() >0) {
			t =super.getList().get(super.getList().size()-1);
			super.getList().remove(super.getList().size()-1);
			return t;
		}
		return 0;
	}

	public void alustapino(int y) {

		Integer temp = new Integer(super.getR().nextInt(100)+1);
		for (int x=0;x<y;x++) {
			super.getList().add(temp);
			temp = new Integer(super.getR().nextInt(100)+1);
		}
	}
}
