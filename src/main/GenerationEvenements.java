package main;

import java.util.ArrayList;
import java.util.List;

public class GenerationEvenements {
	
	private List<Evenement> evenements = new ArrayList<Evenement>();
	
	public GenerationEvenements() {
		
	Evenement ev1 = new Evenement("Premier Amphi de l'annee","J'y vais !","J'y vais pas","J'arrive en retard",0,15,30,-10,10,0,20,-20,0,new Date(1,1,13));
	Evenement ev2 = new Evenement("Soiree de reprise !","J'y vais !","J'y vais pas",30,-25,-15,15,-15,0,new Date(1,1,20));
	Evenement ev3 = new Evenement("Pause Midi","Sandwich ?","Box de pâtes ?",0,0,10,20,0,-5,new Date(1,2,12));
	Evenement ev4 = new Evenement("Sport de la semaine","J'y vais","J'y vais pas",5,0,-30,25,10,15,new Date(1,2,17));
	Evenement ev5 = new Evenement("Deuxième Amphi de l'annee","J'y vais !","J'y vais pas","J'arrive en retard",0,15,30,-10,10,0,20,-20,0,new Date(1,1,13));
	Evenement ev6 = new Evenement("Premier DS de l'annee","Je révise à fond","Je révise moyen","Le talent !",-5,5,15,-30,-15,15,60,35,-50,new Date(1,4,14));
	Evenement ev7 = new Evenement("Pause midi ! Kiosque ou RU ?","Kiosque","RU",0,0,-5,-10,-15,20,new Date(1,5,12));
	Evenement ev8 = new Evenement("Troisième amphi ! Interro Surprise !","Ouf j'y étais","Merde, j'ai seche",0,10,0,10,20,-40,new Date(1,6,9));
	Evenement ev9 = new Evenement("Pause Midi ! Sandwich oublie","Je taxe un pote","Tant pis",0,0,5,-5,0,-5,new Date(1,6,12));
	Evenement ev10 = new Evenement("Soiree de ouf mec","Je me défonce comme jaja","Soyons raisonnable",0,70,-100,-30,0,-10,new Date(1,7,18));
	Evenement evAlea1 = new Evenement("TP d'Algo mon PC Crache","Je vais voir le technicien","tant pis pas de TP","Je le ferais plus tard",0,20,12,-50,10,-20,0,-10,-5,0.1,new Date(1,1,12));
	Evenement evAlea2 = new Evenement("Panne electrique dans l'IUT","J'attend ","je rentre chez moi","Je scanne les cours de mon copain",0,70,32,-70,0,-14,26,-30,-18,0.5,new Date(1,6,20));
	Evenement evAlea3 = new Evenement("Le prof a 1h00 de retard","J'attend ","je rentre chez moi","Je scanne les cours de mon copain",0,70,32,-70,0,-14,26,-30,-18,0.2,new Date(1,7,13));
	
	evenements.add(ev1);
	evenements.add(ev2);
	evenements.add(ev3);
	evenements.add(ev4);
	evenements.add(ev5);
	evenements.add(ev6);
	evenements.add(ev7);
	evenements.add(ev8);
	evenements.add(ev9);
	evenements.add(ev10);
	evenements.add(evAlea1);
	evenements.add(evAlea2);
	evenements.add(evAlea3);
	
	
	Evenement ev11 = new Evenement("Amphi analyse","J'y vais !","J'y vais pas",0,10,-10,10,10,-10,new Date(2,1,8));
	Evenement ev12 = new Evenement("Interro surprise","J'avais relu","Oups!",0,0,0,0,10,-10,new Date(2,2,8));
	Evenement ev13 = new Evenement("Pause Midi, Lan en salle tp","Je me depeche de manger pour aller jouer a Urbanterror!","Je me depeche de manger pour bosser",10,-10,0,0,-10,10,new Date(2,2,12));
	Evenement ev14 = new Evenement("Grasse mat'?","Oui","Non",0,0,10,-10,-10,10,new Date(2,3,6));
	Evenement ev15 = new Evenement("DS d'algo","J'ai pas révisé je triche","J'ai pas révisé j'y vais au talent",0,0,0,0,-100,-25,new Date(2,3,13));
	Evenement ev16 = new Evenement("Pause Midi","Sandwich ?","Box de pâtes ?",0,0,10,20,0,-5,new Date(2,4,12));
	Evenement ev17 = new Evenement("Soiréé étudiante","Je sors","Je sors pas",20,-20,-20,20,-15,20,new Date(2,4,20));
	Evenement ev18 = new Evenement("Amphi sysème avec Mr Beaufils","Je discute avec mon voisin","J'ecoute sagement",0,0,0,0,-100,30,new Date(2,5,10));
	Evenement ev19 = new Evenement("Révisions","Je revise seul","Je revise avec un pote","Je revise pas",0,0,0,-10,-5,10,20,-10,-10,new Date(2,6,10));
	Evenement ev20 = new Evenement("Mon pote me propose une aprem fifa","J'y vais","J'y vais pas",-10,10,0,0,0,-10,new Date(2,7,14));

	
	evenements.add(ev11);
	evenements.add(ev12);
	evenements.add(ev13);
	evenements.add(ev14);
	evenements.add(ev15);
	evenements.add(ev16);
	evenements.add(ev17);
	evenements.add(ev18);
	evenements.add(ev19);
	evenements.add(ev20);
	}
	
}
