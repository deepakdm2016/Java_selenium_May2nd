package collectionRevision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class setDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Set<Integer> setDemo=new HashSet<>();
		List<Integer> listDemo=new ArrayList<>();
		Set<Integer> linkedsetDemo=new LinkedHashSet<>();
		Set<Integer> treeSetDemo=new TreeSet<>();
		
		Random random = new Random();
		for(int i=0;i<10;i++)
		{
			int nextInt = random.nextInt(5);
			System.out.println(nextInt);
			setDemo.add(nextInt);
			listDemo.add(nextInt);
			linkedsetDemo.add(nextInt);
			treeSetDemo.add(nextInt);

		}
		
		System.out.println(setDemo);
		System.out.println(listDemo);
		System.out.println(linkedsetDemo);
		System.out.println(treeSetDemo);
		
	}

}
