package garbageCollection;

public class gcDemo {
	
	int objId;

	gcDemo(int objId)
	{
		this.objId=objId;
		System.out.println(this +" Created "+ this.objId);
	}
	public static void main(String[] args) {

		new gcDemo(1);
		new gcDemo(2);

		for(int i=1;i<=100;i++)
		{
			System.gc();
				
		}
		
	}
	
		@Override
		protected void finalize()
		{
			
			System.out.println(this + " Finalized "+ this.objId);
			
		}
	}


