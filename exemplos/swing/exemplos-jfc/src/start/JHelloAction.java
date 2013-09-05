package start;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import misc.ActionDemo;

public class JHelloAction extends AbstractAction {

	public JHelloAction() {
		super();
        putValue(SHORT_DESCRIPTION, "curta");		
        putValue(LONG_DESCRIPTION, "descrição longa");		
        putValue(NAME, "nome");	
        java.net.URL imageURL = ActionDemo.class.getResource("left.gif");
        putValue(SMALL_ICON, new ImageIcon(imageURL ));	

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Apertaram!");
	}
}
