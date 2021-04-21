import java.util.ArrayList;
import java.util.Random;

public class DataStructs {

	private ArrayList<Integer> list;
	private Random r;

	public DataStructs() {
		this.list = new ArrayList<Integer>();
		this.r = new Random();
	}

	public void tulosta() {
		for (int x=0;x<list.size();x++  ) {
			System.out.print("" +list.get(x).toString() +",");
		}
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

}