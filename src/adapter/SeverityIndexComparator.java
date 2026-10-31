package adapter;
import domain.Symptom;

import java.util.Comparator;

public class SeverityIndexComparator implements Comparator<Object> {

	@Override
	public int compare(Object arg0, Object arg1) {
		int ind0 = ((Symptom) arg0).getSeverityIndex();
		int ind1= ((Symptom) arg1).getSeverityIndex();
		return Integer.compare(ind0, ind1);
	}
}

