package main;

public class Date {
	private int semaine;
	private int jour;
	private int heure;
	
	public Date(int semaine, int jour, int heure){
		this.semaine=semaine;
		this.jour=jour;
		this.heure=heure;
	}	
	
	public int getSemaine() {
		return semaine;
	}


	public int getJour() {
		return jour;
	}

	public int getHeure() {
		return heure;
	}


	public String toString(){
		return "\t\t\t\t\t Semaine " + this.semaine + " jour "+ this.jour + ", il est "+ this.heure +"h";
	}

}
