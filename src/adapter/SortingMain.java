package adapter;

import java.util.Iterator;

import domain.Covid19Pacient;
import domain.NeuroMuscularSymptom;
import domain.Symptom;
import factory.FactorySymptom;

public class SortingMain {
	public static void main(String[] args) {
		Covid19Pacient pertsona = new Covid19Pacient("Sami", 67, new FactorySymptom());
		Symptom s1 = new Symptom("fiebre", 100, 5);
		Symptom s2 = new Symptom("dolor de garganta", 100, 3);
		Symptom s3 = new Symptom("diarrea explosiva", 100, 4);
		Symptom s4 = new Symptom("congestion nasal", 100, 1);
		Symptom s5 = new Symptom("migraña", 100, 1);

		pertsona.addSymptom(s1,1);
		pertsona.addSymptom(s2,2);
		pertsona.addSymptom(s3,3);
		pertsona.addSymptom(s4,1);
		pertsona.addSymptom(s5,2);
		
		
		InvertedIterator iIterator = new Covid19PacientInvertedIteratorAdapter(pertsona);
		
		Iterator<Object> it1 = Sorting.sortedIterator(iIterator, new NameComparator());
		printIterator(it1);
		
		Iterator<Object> it2 = Sorting.sortedIterator(iIterator, new SeverityIndexComparator());
		printIterator(it2);
		

	}
	private static void printIterator(Iterator<Object> it) {
		while(it.hasNext()) {
			Object unekoa = it.next();
			System.out.print(unekoa + ", ");
		}
		System.out.print("\n");
	}
}
