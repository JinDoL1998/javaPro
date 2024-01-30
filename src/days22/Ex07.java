package days22;

import java.util.LinkedList;
import java.util.Queue;

public class Ex07 {

	public static void main(String[] args) {

		// 큐(Queue) 구조
 		// 디큐(Deque 구조 = 더블 큐 구조 
		//			────────────────
		//	    →		C	B	A    →
		// 			────────────────
		// offer()			poll(), peek()
		// FIFO 구조
		//			  LinkedList() -> list, Deque ->Queue -> Collection
		Queue q = new LinkedList();
		q.offer("권맑음");
		q.offer("이동찬");
		q.offer("김영진");
		
		// Deque 추가
		// q.offerFirst(q);
		// q.offerLast(q);
		// q.pollFirst()
		// q.pollLast()
		
		// FIFO 구조
		while(!q.isEmpty()) {
			System.out.println( q.poll() );
		}
		
	}

}
