package observer;

import java.awt.Dimension;
import java.util.Observable;

import adapter2.ShowPacientTableGUI;
import domain.Covid19Pacient;
import factory.FactorySymptom;

public class Main {


	public static void main(String args[]){
		//createPersonView("aitor", 35);
		createPersonView("ane", 67);
		//createPersonView("Sonion", 33);
	}

	private static void createPersonView(String name, int age) {
		Covid19Pacient pacient=new Covid19Pacient(name,age, new FactorySymptom());
		new PacientObserverGUI (pacient);
		new PacientSymptomGUI (pacient);
		new PacientThermometerGUI(pacient);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		System.out.println(gui);
		gui.setSize(new Dimension(300,200));
		gui.setVisible(true);
		System.out.println(gui);
		System.out.println("HOLA");
		
	}

}
