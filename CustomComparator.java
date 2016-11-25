package com.test.basic;

import java.util.Comparator;

public class CustomComparator  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1.equals(o2)){
			return 0;
		}
		return 1;
	}

}
