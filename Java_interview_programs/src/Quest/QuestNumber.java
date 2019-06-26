package Quest;

public class QuestNumber {

	public static void main(String[] args) {

		String test="1234abcG789";
		test=test.replaceAll("[(A-Z a-z)]", "");
		System.out.println(test);
		int result=0;
		
		for(int i=0;i<test.length();i++)
		{
			String num = test.substring(i, i+1);
			Integer it=Integer.parseInt(num);
			result+=it;
			
		}
	
	System.out.println(result);
		
	}

}
