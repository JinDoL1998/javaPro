package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);

		// 1) a U b 합집합 [1,2,3,4,5,6,7,8]
		/*
		ArrayList<Integer> union = new ArrayList<>(a);
		// union.addAll(a);
		Iterator<Integer> ir = b.iterator();
		while (ir.hasNext()) {
			Integer i =  ir.next();
			if(!a.contains(i)) union.add(i);

		}
		System.out.println(union);
		*/
		/*
		HashSet<Integer> union = new HashSet<>(a);
		union.addAll(b);
		System.out.println(union);
		*/
		
		// 2) a - b 차집합 [1,2,3]
		/*
		ArrayList<Integer> diff = new ArrayList<>(a);
		Iterator<Integer> ir = b.iterator();
		while (ir.hasNext()) {
			Integer i =  ir.next();
			if(a.contains(i)) diff.remove(i);

		}
		System.out.println(intersection);
		*/
		/*
		a.removeAll(b);
		System.out.println(a);
		*/
		
		// 3) a ∩ b 교집합 [4,5]
		/*
		ArrayList<Integer> intersection = new ArrayList<>(a);
		
		Iterator<Integer> ir = b.iterator();
		while (ir.hasNext()) {
			Integer i =  ir.next();
			if(a.contains(i)) intersection.add(i);

		}
		System.out.println(intersection);
		*/
		
	} // main

} // class