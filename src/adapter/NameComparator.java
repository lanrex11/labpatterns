package adapter;
import domain.Symptom;

import java.util.Comparator;

public class NameComparator implements Comparator<Object> {

	@Override
	public int compare(Object arg0, Object arg1) {
		String name0 = ((Symptom) arg0).getName();
		String name1= ((Symptom) arg1).getName();
		return name0.compareTo(name1);

	}
	
}

