package HCL;

public class reverse_each_word_string {

	public static void main(String[] args) {

		String input="HCL interview attended";
		String[] split = input.split(" ");
		StringBuffer result = new StringBuffer(" ");
		for(int i=0;i<split.length;i++)
		{
			StringBuffer a=new StringBuffer(split[i]);
			a.reverse();
			result.append(a).append(" ");
			System.out.println(result);
			
		}
		
		System.out.println(result);
		
	}

}
