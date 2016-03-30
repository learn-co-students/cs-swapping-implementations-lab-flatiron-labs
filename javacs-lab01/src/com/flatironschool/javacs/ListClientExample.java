package com.flatironschool.javacs;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListClientExample {
	private List list;
	
	public ListClientExample() {
		list = new ArrayList();
	}

	public List getList() {
		return list;		
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		List list = lce.getList();
		System.out.println(list);
	}
}
