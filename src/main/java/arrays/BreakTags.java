package arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class BreakTags {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Set<String> dict = new LinkedHashSet<>();
//		dict.add("Strongly Connected Component");
//		dict.add("Minimum Spanning Tree");

//		dict.add("Bit Manipulation");
//		dict.add("Data Stream");
//		dict.add("Binary Search");
//		dict.add("Sliding Window");
//		dict.add("Two Pointers");
//		dict.add("Table Sorting");
//		dict.add("Dynamic Programming");
//		dict.add("Counting Sort");
//		dict.add("Divide and Conquer");
//		dict.add("Monotonic Stack");
//		dict.add("Binary Tree");
//		dict.add("Binary Search Tree");
//		dict.add("Union Find");
//		dict.add("Depth-First Search");
//		dict.add("Breadth-First Search");
//		dict.add("Bucket Sort");
//		dict.add("Radix Sort");
//		dict.add("Heap (Priority Queue)");
//		dict.add("Ordered Set");
//		dict.add("Monotonic Queue");
//		dict.add("Number Theory");
//		dict.add("Binary Indexed Tree");
//		dict.add("Segment Tree");
//		dict.add("Line Sweep");
//		dict.add("Topological Sort");
//		dict.add("Merge Sort");
//		dict.add("Linked List");
//		dict.add("Shortest Path");
//		dict.add("Game Theory");
//		dict.add("Game Theory");
//		dict.add("String Matching");
//		dict.add("Rolling Hash");
//		dict.add("Hash Function");
//		dict.add("Doubly-Linked List");
//		dict.add("Suffix Array");

//		dict.add("Array");
//		dict.add("Simulation");
//		dict.add("String");
//		dict.add("Prefix Sum");
//		dict.add("Matrix");
//		dict.add("Hash Table");
//		dict.add("Sorting");
//		dict.add("Couting");
//		dict.add("Math");
//		dict.add("Design");
//		dict.add("Enumeration");
//		dict.add("Geometry");
//		dict.add("Backtracking");
//		dict.add("Heap");
//		dict.add("Greedy");
//		dict.add("Stack");
//		dict.add("Queue");
//		dict.add("Backtracking");
//		dict.add("Tree");
//		dict.add("Recursion");
//		dict.add("Iterator");
//		dict.add("Trie");
//		dict.add("Quickselect");
//		dict.add("Graph");
//		dict.add("Randomized");
//		dict.add("Bitmask");
//		dict.add("Combinatorics");
//		dict.add("Memoization");
//		dict.add("Interactive");
//		dict.add("Brainteaser");

//		Map<String, String> map = new HashMap<>();
//		for (String tag : dict) {
//			String newTag = tag.replaceAll("[^a-zA-Z0-9]", "");
//			map.put(tag, "," + newTag + ",");
//		}

//		File tagFile = new File("c:\\migration\\Tags.csv");
//		try (BufferedReader br = new BufferedReader(new FileReader(tagFile))) {
//			String line;
//			while ((line = br.readLine()) != null) {
//				for (String tag : dict) {
//					if (line.contains(tag)) {
//						line = line.replace(tag, map.get(tag));
//					}
//				}
//				System.out.println(line);
//			}
//		}
//
//		File tagFile = new File("c:\\migration\\Tags.csv");
//		try (BufferedReader br = new BufferedReader(new FileReader(tagFile))) {
//			String line;
//			while ((line = br.readLine()) != null) {
//				String[] tokens = line.split(",");
//
//				String newLineToken = "";
//				for (int i = 0; i < tokens.length; i++) {
//					String x = tokens[i].trim();
//					newLineToken += x;
//					if (i == tokens.length - 1) {
//					} else {
//						newLineToken += ",";
//					}
//				}
//
//				System.out.println(newLineToken);
//			}
//		}

		File tagFile = new File("c:\\migration\\Tags.csv");

		Map<String, Map<String, Long>> tagRef = new HashMap<String, Map<String, Long>>();
		try (BufferedReader br = new BufferedReader(new FileReader(tagFile))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(",");
				String level = tokens[tokens.length - 1];
				for (int i = 0; i < tokens.length - 1; i++) {
					if (tagRef.containsKey(tokens[i])) {
						Map<String, Long> levelCnt = tagRef.get(tokens[i]);
						if (levelCnt.containsKey(level)) {
							Long cnt = levelCnt.get(level);
							levelCnt.put(level, ++cnt);
						} else {
							levelCnt.put(level, 1L);
						}
					} else {
						Map<String, Long> levelCnt = new HashMap<String, Long>();
						levelCnt.put(level, 1L);
						tagRef.put(tokens[i], levelCnt);
					}
				}
			}
		}

		for (Entry<String, Map<String, Long>> tag : tagRef.entrySet()) {

			String type = tag.getKey();
			long easy = 0;
			if (tag.getValue() != null && tag.getValue().containsKey("Easy")) {
				easy = tag.getValue().get("Easy");
			}
			long medium = 0;
			if (tag.getValue() != null && tag.getValue().containsKey("Medium")) {
				medium = tag.getValue().get("Medium");
			}

			long hard = 0;
			if (tag.getValue() != null && tag.getValue().containsKey("Hard")) {
				hard = tag.getValue().get("Hard");
			}

			String data = String.format("%-35s %-20s %-20s %-20s " //
					, type//
					, easy//
					, medium //
					, hard);
			System.out.println(data);
		}

		System.out.println(tagRef.size());
	}
}

class Tag {
	String name;
	String level;

	public Tag(String name, String level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}
