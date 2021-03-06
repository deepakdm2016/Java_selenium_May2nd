package collectionRevision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class treeSetStringBufferDemo {

	public static void main(String[] args) throws InterruptedException {

		Comparator<StringBuffer> c = (StringBuffer s1, StringBuffer s2) -> {
			return s2.toString().compareTo(s1.toString());
		};

		Comparator<StringBuffer> c2 = (StringBuffer s1, StringBuffer s2) -> {
			if (s1.toString().length() > s2.toString().length())
				return 1;
			else
				return -1;
		};

		Set<StringBuffer> treeSetDemo = new TreeSet<>(c2);
		treeSetDemo.add(new StringBuffer("Deepak"));
		treeSetDemo.add(new StringBuffer("Vinithra"));
		treeSetDemo.add(new StringBuffer("Nageshaaa"));
		treeSetDemo.add(new StringBuffer("Pavvvvvvithra"));

		System.out.println(treeSetDemo);

	}

}
