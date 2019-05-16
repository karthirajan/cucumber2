package com.cts.test.login;

import java.util.*;
import java.util.Map.Entry;

public class HDFC {
	public static void main(String[] args) {
		Map<Integer, String> mp = new TreeMap();

		mp.put(10, "Farith");
		mp.put(20, "Vel");
		mp.put(30, "Subash");
		mp.put(40, "Subash");
		mp.put(10, "Syed");

		System.out.println(mp);

		boolean b = mp.containsKey(20);
		System.out.println(b);
		boolean c = mp.containsValue("vel");
		System.out.println(c);
		// to print keys alone
		Set<Integer> k = mp.keySet();
		System.out.println(k);
		// values alone
		Collection<String> v = mp.values();
		System.out.println(v);
		// To iterate the map
		Set<Entry<Integer, String>> e = mp.entrySet();
		// enhanced for loop or foreach
		for (Entry<Integer, String> x : e) {

			// iterate both keys and values
			System.out.println(x);
           //iterate keys alone
			System.out.println(x.getKey());
			//iterate values alone
			System.out.println(x.getValue());

		}
	}

}
