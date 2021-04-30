package projette;

public class TEST {
	
	public static void main(String[] args){
		IHMSaisie saisie = new IHMSaisie("toto");
		Choix choix = saisie.proposerChoix();
		System.out.println("Le choix de toto est " + choix);
	}

}
