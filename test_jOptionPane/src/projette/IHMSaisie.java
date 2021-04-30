package projette;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IHMSaisie extends JOptionPane{
	
	private static final long serialVersionUID = -7189679970288341690L;
	JDialog dialogue;
	Choix[] choix = {Choix.CAILLOU, Choix.CISEAUX, Choix.PAPIER};
	
	public IHMSaisie(String nom){
		setMessage(nom + ", que jouez-vous ?");
		setOptions(choix);
		dialogue = createDialog(null, "Chifoumi");
	}
	
	Choix proposerChoix(){
		dialogue.setVisible(true);
		return (Choix)getValue();
	}
}
