package com.technoelevate.collection.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("pranshu", 101));
		arrayList.add(new Student("navnit", 102));
		arrayList.add(new Student("sidhu", 103));
		arrayList.add(new Student("manisha", 104));
		arrayList.add(new Student("chandru", 105));
		arrayList.get(1);
		System.out.println(arrayList.contains("chandru"));
		List list = new LinkedList();
		list.addAll(arrayList);
		list.add(2, "TestYanta");
		list.remove("chandru");
	}
}
