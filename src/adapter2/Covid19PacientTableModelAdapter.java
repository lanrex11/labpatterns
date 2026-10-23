package adapter2;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };
	  protected Vector<Symptom> symptoms;

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	    symptoms = new Vector<Symptom>(p.getSymptoms());
	  }

	  public int getColumnCount() {
		 return 2; //Sintomak eta Pisua
	  }

	  public String getColumnName(int i) {
		  if(i<0 || i>1) return "";
		  return columnNames[i];
	  }

	  public int getRowCount() {
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
		  if(col<0 || col>1) return new Object();
		  if(col == 0)
			  //Sintoma itzuli
			  return symptoms.get(row).getName();
		  //Sintomaren pisua
		  return pacient.getWeight(symptoms.get(row));
	  }
	}
