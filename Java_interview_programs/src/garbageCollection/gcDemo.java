package garbageCollection;

public class gcDemo {

	int objId;

	gcDemo(int objId) {
		this.objId = objId;
		System.out.println(this + " Created " + this.objId);
	}

	public static void main(String[] args) {

		gcDemo a = new gcDemo(1);
		new gcDemo(2);

		System.gc();

		System.out.println(a.getClass().getName());

		a = new gcDemo(3);
		System.gc();

	}

	@Override
	protected void finalize() {

		System.out.println(this + " Finalized " + this.objId);

	}
}
