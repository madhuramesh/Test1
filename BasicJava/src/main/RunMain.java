package main;

import java.util.*;//ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import domain.BinaryTree;
import overloadingriding.Circle;
import overloadingriding.Shape;
import overloadingriding.Square;
import thread.RunnableThreadExample;
import thread.ThreadExample;

public class RunMain {

	public static void main(String[] args) {
		String[] words1 = {"how","are"};
		String[] words2 = {"you","doing"};
		int[] array = {1, 5, 3, 19, 18, 25};//{11,2,3,4,55};
		int arrtoBin[] = {4, 8, 10, 12, 14, 20, 22, 25, 26, 27, 28, 30, 31, 32}; 
		
//Palindrome
		
		System.out.println("Is Palindrome "+isPalindrome("Kayak"));
//Binary search
		System.out.println(binarySearch(arrtoBin, 12));
		
//Sort characters in a String		
		System.out.println(sortCharInString("because"));
		
//IsPermutation
		System.out.println("Is a Permutation "+checkPermutation("ausebec","because"));
//Is Substring
		System.out.println("Is a substring "+isSubstring("caus","because"));
		
//LeftRotation 
		System.out.println(leftRotation("madhu", 5));
		
//LeftRotation times
		String[] arr = new String[5];
		arr = leftRotationTimes("madhu", 5);
		
		for(String w:arr) {
			System.out.print(w+" ");
		}
		
//minimum difference in an array		
		//System.out.println(minDiff(array));
		
//thread by extending thread class	
		//runnableThread();
		
//thread by implementing runnable interface
		//runnable();

//Overriding Overloading
		//overridingOverloading();
		
//reverse print int
		//reverseIntArray(array);
		
//LinkedList
		//linkedListTest1();
		//linkedListTest();
		
		
//HashMap
		//hashMap();
		
//array to binarytree
		//arrToBinary(arrtoBin);
//Binary Tree
		//binaryTree();
		
//Unique character
		//System.out.println(uniqueChar("madhuaa"));
		
//StringBuilder	
		//sampleStringbuilder(words1);
		
		
//ArrayList		
		/*ArrayList<String> sent = mergeArrayList(words1, words2);
		for(String w: sent) {
			System.out.print(w + "\t");
		}*/
		
	}
	
//	

//Left rotation --> madhu => dhuma
	
	public static String leftRotation(String word, int pl) {
		String ret = "";
		ret = word.substring(pl)+word.substring(0, pl);
		return ret;
	}
	
//Left Rotation number of times
	public static String[] leftRotationTimes(String word, int times) {
		String[] retArr = new String[times];
		for(int i=0; i<times; i++) {
			retArr[i] = word.substring(i+1)+word.substring(0,i+1);
			//System.out.println(retArr[i]);
		}
		
		return retArr;
	}
	
	
//Palindrome
	public static boolean isPalindrome(String word1) {
		StringBuilder word = new StringBuilder(word1.toLowerCase());
		try
		{
			for(int i=0; i<= (word.length()-1)/2; i++)
			{	
				//System.out.println(Character.isUpperCase(word1.charAt(i)) +" "+word1.charAt(word1.length()-1-i));
				if (word.charAt(i) != word1.charAt(word.length()-1-i))
					return false;
			}
			return true;
		}catch(Exception e)
		{
			System.out.println("Error"+e);
			return false;
		}
	}
	
	
//BinarySearch
	
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length;
		int mid =0;
		
		while(high >= low) {
			mid = (low + high)/2;
			System.out.println("mid value "+mid);
			if (key < arr[mid]) 
				high = mid - 1;
			else if (key > arr[mid])	
				low = mid + 1;
			else if (arr[mid] == key)
				return mid;
				
		}
		
		return -1;
	}
	
//Check for Permutation
	
	public static boolean checkPermutation(String source, String dest) {
		
		if (source.length() == dest.length())
			return sortCharInString(source).equalsIgnoreCase(sortCharInString(dest));
		/*else
		{
			String rsource = sourceLength > destLength? source:dest;//dest=because
			String rdest = sourceLength < destLength?source:dest;//source = bec
		
			System.out.println("Rearranged source "+rsource);
			System.out.println("Rearranged dest "+rdest);
			if (source.charAt(0) == dest.charAt(0))
				return rdest.equalsIgnoreCase(rsource.substring(0, rdest.length()));
				//return rsource.equalsIgnoreCase(rdest.substring(0, rsource.length()));
			else
				return rdest.equalsIgnoreCase(rsource.substring(rsource.indexOf(rdest.charAt(0)),rsource.indexOf(rdest.charAt(0))+rdest.length()));
		}*/	
		return false;	
	}
	
	//Check for Substring
	
	public static boolean isSubstring(String source, String dest) {
		int sourceLength = source.length();
		int destLength = dest.length();
		
		if (source.length() == dest.length()) {
			char[] arrSource = source.toCharArray();
			char[] arrDest = dest.toCharArray();
			
			return String.valueOf(arrSource).equalsIgnoreCase(String.valueOf(arrDest));
		}
		
		String rsource = sourceLength > destLength? source:dest;//dest=because
		String rdest = sourceLength < destLength?source:dest;//source = bec
	
		System.out.println("Rearranged source "+rsource);
		System.out.println("Rearranged dest "+rdest);
		if (source.charAt(0) == dest.charAt(0))
			return rdest.equalsIgnoreCase(rsource.substring(0, rdest.length()));
			//return rsource.equalsIgnoreCase(rdest.substring(0, rsource.length()));
		else
			return rdest.equalsIgnoreCase(rsource.substring(rsource.indexOf(rdest.charAt(0)),rsource.indexOf(rdest.charAt(0))+rdest.length()));
	
	}	
	
	
//Sort charaters in a string
	public static String sortCharInString(String source) {
		String dest = "";
		char[] arrChar = source.toCharArray();
		
		Arrays.sort(arrChar);
		dest = String.valueOf(arrChar);
		return dest;
	}
	
//FindMinimumDifference in an array
	/*public static int minDiff(int[] arr) {
		int diff = Integer.MAX_VALUE;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (Math.abs(arr[i]-arr[j]) < diff)
					diff = Math.abs(arr[i]-arr[j]);
			}
		}
		return diff;
	}*/
	
//array with minimum difference //TODO
	/*public static void smallestDiff(Integer arr1[], Integer arr2[]) {
		
		List<Integer> arrList1 = new ArrayList<Integer>(arr1.length);
		List<Integer> arrList2 = new ArrayList<Integer>(arr2.length);
		
		for(Integer i: arr1) {
			arrList1.add(i);
		}
		
		for(Integer i: arr2) {
			arrList2.add(i);
		}
		
		Collections.sort(arrList1);
		Collections.sort(arrList2);
		
		Iterator<Integer> iter = arrList1.iterator();
		while(iter.hasNext()) {
			if Collections.max(arrList1)
		}
		
	}*/

//thread by extending thread class	
	public static void runnableThread() {
		ThreadExample instance = new ThreadExample();
		
		instance.start();
		while(instance.count != 5) {
			try
			{
				Thread.sleep(250);
			}catch(InterruptedException e) 
			{
				System.out.println("Runnable thread interrupted "+e);
				e.printStackTrace();
			}
		
		}
		
	}

//thread by implementing runnable interface	
	public static void runnable() {
		RunnableThreadExample instance = new RunnableThreadExample();
		Thread thread = new Thread(instance);
		thread.start();
		
		while(instance.count != 5) {
			try
			{
				thread.sleep(250);
			}catch(InterruptedException e) 
			{
				System.out.println("Runnable thread interrupted "+e);
				e.printStackTrace();
			}
		
		}
	}
	
	
	public static void overridingOverloading() {
		Shape[] shapes = new Shape[2];
		
		Circle circ = new Circle();
		Square sq = new Square();
		
		shapes[0] = circ;
		shapes[1] = sq;
		
		for(Shape i:shapes) {
			i.print();
			System.out.println(i.computeArea());
		}
	}
	
	public static void reverseIntArray(int arr[]) {
		List<Integer> arrList = new ArrayList<>(arr.length);
		
		for(int i:arr) {
			arrList.add(i);
			//System.out.println(i);
		}
		Collections.reverse(arrList);
		System.out.println(Collections.max(arrList));
		System.out.println(Collections.min(arrList));
		System.out.println(arrList);
		
		List<Integer> clone = new ArrayList<Integer>(50);
		//Collections.copy(clone, arrList);
		System.out.println(clone);
	}
	
	public static void linkedListTest() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Steve");
		list1.add("Carl");
		list1.add("Raj");
		list1.addFirst("Negan");
		list1.addLast("Rick");
		list1.add(2, "Glenn");
		
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//reverse order
		Iterator<String> it = list1.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	/*public static void linkedListTest1() {
		LinkedList linkedList5 = new LinkedList(5);
		LinkedList linkedList10 = new LinkedList(10);
		LinkedList linkedList15 = new LinkedList(15);
		linkedList5.insert(10, linkedList10);
		linkedList10.insert(15, linkedList15);
		System.out.println(linkedList10.getPrev()+" "+linkedList10.getNext());
		
	}*/
	
	public static void hashMap() {
		HashMap<Integer, ArrayList<String>> mapList = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> arrList1 = new ArrayList<String>();
		arrList1.add("apple");
		arrList1.add("banana");
		arrList1.add("orange");
		arrList1.add("grapes");
		mapList.put(1, arrList1);
		
		ArrayList<String> arrList2 = new ArrayList<String>();
		arrList2.add("red");
		arrList2.add("green");
		arrList2.add("blue");
		arrList2.add("yellow");
		mapList.put(2, arrList2);
		
		if (mapList.containsKey(1))
			System.out.println(mapList.get(1));
		
		if (mapList.containsValue(arrList1))
			System.out.println(arrList1);
		
		//mapList.computeIfPresent(1, (key, value) -> value+1));
			
		System.out.println(mapList.keySet());
		System.out.println(mapList.values());
		
		mapList.putIfAbsent(1, arrList1);
		
		Iterator<Map.Entry<Integer, ArrayList<String>>> mapIter = mapList.entrySet().iterator();
		while(mapIter.hasNext())
		{
			Map.Entry<Integer, ArrayList<String>> entry = mapIter.next();
			mapIter.remove();
			System.out.println(mapList);
		}
		
		//mapList.replace(1, arrList2);
		
		Set<Map.Entry<Integer, ArrayList<String>>> mapping = mapList.entrySet();
		System.out.println(mapping);
	}
	
	public static void arrToBinary(int[] arr) {
		List<Integer> level = new ArrayList<Integer> ();
		
		
		Arrays.sort(arr);
		BinaryTree node1 = new BinaryTree(arr[0]);
		level.add(node1.getData(node1));
		for(int i=0; i<arr.length-1; i++) {
			node1 = new BinaryTree(arr[i]);
			//level.add(node1.getData(node1));
			BinaryTree node2 = new BinaryTree(arr[i+1]);
			
			if (arr[i] < arr[i+1])
			{
				node1.setRightNode(node2);
				level.add(node2.getData(node2));
				
			}
			else if (arr[i] > arr[i+1])
			{
				node1.setLeftNode(node1);
				level.add(node1.getData(node1));
			}
		}
		
		System.out.println("Level "+level);
		
		BinaryTree node3 = new BinaryTree(arr[0]);
		System.out.println("Is Binary tree "+node3.isBinaryTree(node3));
		System.out.println("Parent node of "+node3.getData(node3)+" "+node3.getParent(node3));
		int count =0;
		while(node3.getParent(node3)!= null) {
			node3 = node3.getParent(node3);
			//if ((node1.getParent(node1)!= null) && {
				count++;
			//}
		}
		System.out.println("Level of binaryTree "+count);
	}
	
	public static void binaryTree() {
		BinaryTree binTreeRoot = new BinaryTree(5);
		BinaryTree node1 = new BinaryTree(1);
		BinaryTree node2 = new BinaryTree(2);
		BinaryTree node3 = new BinaryTree(3);
		BinaryTree node4 = new BinaryTree(4);
		BinaryTree node6 = new BinaryTree(6);

		BinaryTree node7 = new BinaryTree(7);

		BinaryTree node8 = new BinaryTree(8);

		BinaryTree node9 = new BinaryTree(9);
		BinaryTree node10 = new BinaryTree(10);

		
		binTreeRoot.setLeftNode(node4);
		binTreeRoot.setRightNode(node7);
		node4.setLeftNode(node3);
		node4.setRightNode(node6);
		
		
		node7.setLeftNode(node6);
		node7.setRightNode(node8);

		System.out.println(binTreeRoot.isBinaryTree(binTreeRoot));
		System.out.println(binTreeRoot.find(8));
		System.out.println(binTreeRoot.find(18));
	}
	
	public static boolean uniqueChar(String word) {
		for(int i=0; i < word.length()-1;i++ ) {
			for(int j=i+1; j< word.length();j++) {
				if (word.charAt(i) == word.charAt(j))
					return false;
			}	
				
		}
		return true;
	}
	
	public static void sampleStringbuilder(String[] words) {
		StringBuilder sentence = new StringBuilder();
		for(String w: words) {
			sentence.append(w);
		}
		
		System.out.println(sentence);
		
	}
	
	public static ArrayList<String> mergeArrayList(String[] words, String[] more) {
		ArrayList<String> sentence = new ArrayList<>();
		for(String word:  words) {
			sentence.add(word);
		}
		for(String w: more) {
			sentence.add(w);
		}
		Collections.sort(sentence);
		System.out.println(sentence);
		
		for(String w:sentence) {
			if (w.equalsIgnoreCase("how"))
				System.out.println("Found "+w);
			
		}
		return sentence;
	}
	
	

}
