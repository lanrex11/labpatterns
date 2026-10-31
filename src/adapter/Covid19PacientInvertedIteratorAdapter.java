package adapter;

import java.util.Vector;

import domain.Covid19Pacient;
import domain.Symptom;


public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator {
	Covid19Pacient pacient;
	Vector<Symptom> symptoms;
	int position = 0;
	
	public Covid19PacientInvertedIteratorAdapter( Covid19Pacient p) {
		this.pacient = p;
		this.symptoms = new Vector<Symptom>(p.getSymptoms());
	}
	
	@Override
	public Object previous() {
		position--;
		return symptoms.get(position);
	}

	@Override
	public boolean hasPrevious() {
		return position > 0;
	}

	@Override
	public void goLast() {
		position= symptoms.size();
	}

}
