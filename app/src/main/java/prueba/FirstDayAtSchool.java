/**
 * Clase a probar en el c�digo ejemplo para el control de junio de 2022
 */
package Junio2022;

/**
 * @author Isabel Rom�n
 *
 */

import java.util.HashMap;
import java.util.Set;

public class FirstDayAtSchool {
	private HashMap<String, Integer> schoolbag = null;
	//private int things = 0;
	//private int number = 0;

	public FirstDayAtSchool() {
		this.schoolbag = new HashMap<String, Integer>();
		prepareMyBag();

	}

	public void prepareMyBag() {
		schoolbag.put("Pens", 1);
		schoolbag.put("Notebooks", 1);
	}

	public void addThings(String thingName, int number) {
		int things = number;
		if (schoolbag.containsKey(thingName)) {
			things = things + schoolbag.get(thingName).intValue();
		}
		schoolbag.put(thingName, things);
	}

	public int getNumberOf(String thingName) {
		int number = 0;
		if (schoolbag.containsKey(thingName)) {
			number = number + schoolbag.get(thingName).intValue();
		}
		return number;

	}

	public Set<String> getThings() {

		return schoolbag.keySet();
	}

	public void cleanMyBag() {
		schoolbag.clear();
	}

	public String toString() {
		String mybag = "These are the things in my bag: \n" + schoolbag.toString();
		return mybag;
	}
}
