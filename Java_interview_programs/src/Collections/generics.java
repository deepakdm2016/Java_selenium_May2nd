package Collections;

public class generics<T> {
	
	T sample;

	public generics(T sample) {
		super();
		this.sample = sample;
	}

	public T getSample() {
		return sample;
	}

	public void setSample(T sample) {
		this.sample = sample;

	}
		
	public void displayObjectDetails()
	{
		System.out.println("Type of Object"+sample.getClass().getName());
	}
	
}
