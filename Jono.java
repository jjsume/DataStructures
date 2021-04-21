
public class Jono extends DataStructs {
	
	public Jono() {
		super();
	}

	public  void jonoAdd(Integer x) {
		super.getList().add(x);
	}
	
	public  Integer jonoNext() {
		Integer t = super.getList().get(0);
		super.getList().remove(0);
		return t;
	}
	
	public void alustaJono(int y) {
		Integer temp = new Integer(super.getR().nextInt(100)+1);
		for (int x=0;x<y;x++) {
			super.getList().add(temp);
			temp = new Integer(super.getR().nextInt(100)+1);
		}
}
}
