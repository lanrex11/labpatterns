package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.FactorySymptom;

public class Main {


	public static void main(String args[]){
		createPersonView("aitor", 35);
		createPersonView("ane", 67);
		createPersonView("Sonion", 33);
	}

	private static void createPersonView(String name, int age) {
		Covid19Pacient pacient=new Covid19Pacient(name,age, new FactorySymptom());
		new PacientObserverGUI (pacient);
		new PacientSymptomGUI (pacient);
		new PacientThermometerGUI(pacient);
	}

}
