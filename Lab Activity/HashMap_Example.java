/*
* @Author Kamlendra Pandey
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class CountryMap {
	public HashMap<String, String> M1;

	public CountryMap() {
		M1 = new HashMap<String, String>();
	}

	public HashMap<String, String> storeCountryCapital(String CountryName, String Capital) {
		M1.put(CountryName, Capital);
		return M1;
	}

	public String retriveCapital(String CountryName) {
		return M1.get(CountryName);
	}

	public String retriveCountry(String CapitalName) {

		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();

			if (me.getValue().equals(CapitalName))
				return me.getKey();
		}

		return null;
	}

	public HashMap<String, String> swapKeyValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();

		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}

		return M2;
	}

	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();

		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}

		return list;
	}
}

public class HashMap_Example {

	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();

		countryMap.storeCountryCapital("India", "Delhi");
		countryMap.storeCountryCapital("Japan", "Tokyo");
		// countryMap.saveCountryCapital("USA", "Washington, D.C.");

		System.out.println(countryMap.retriveCapital("India"));
		System.out.println(countryMap.retriveCountry("Tokyo"));
		System.out.println(countryMap.retriveCapital("Japan"));
		System.out.println(countryMap.retriveCountry("Delhi"));
		System.out.println(countryMap.toArrayList());

		HashMap<String, String> M2 = countryMap.swapKeyValue();
		System.out.println(M2);
	}

}