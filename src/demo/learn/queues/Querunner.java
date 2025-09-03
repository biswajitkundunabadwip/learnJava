package demo.learn.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class Querunner {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Cat");
		queue.add("Rat");
		queue.add("Tiger");
		queue.offer("Lion");

		System.out.println(queue);
	}
}
