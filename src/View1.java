import java.awt.Color;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View1 extends JFrame {
	private JPanel motherPane,telephonePane,fideloPane,emailPane,conditionPane;
	private JLabel telephone,codeFideloInfo,aideFidelo,email,confirmerEmail,confirmerCondition;
	private JButton fideloNumero0,fideloNumero1,fideloNumero2,fideloNumero3,fideloNumero4,
			fideloNumero5,fideloNumero6,fideloNumero7,fideloNumero8,fideloNumero9,effacerFidelo,annulerAchat,payerAchat;
	private JTextField numTelephone,emailText,confirmerEmailText;
	private JPasswordField codeFidelo;
	private JCheckBox accepterCondition;
	public View1(Model1 model) {
		Controller controller = new Controller(this,model);

		telephone = new JLabel("<html>Saisissez votre numero de Telephone Mobile :</html>");
		telephone.setBounds(10,0,300,40);
		
		numTelephone = new JTextField("");
		numTelephone.setBounds(40,50,200,20);
		
		telephonePane = new JPanel();
		telephonePane.add(telephone);
		telephonePane.add(numTelephone);
		telephonePane.setLayout(null);
		telephonePane.setBounds(10,10,300,200);
		telephonePane.setBackground(Color.white);
		telephonePane.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.decode("#f48024")));
		
		
		codeFideloInfo = new JLabel("<html>Cliquez pour composer les chiffres de votre code fidelio :</html>");
		codeFideloInfo.setBounds(10,5,300,40);
		
		fideloNumero0 = new JButton("0");fideloNumero5 = new JButton("5");
		fideloNumero1 = new JButton("1");fideloNumero6 = new JButton("6");
		fideloNumero2 = new JButton("2");fideloNumero7 = new JButton("7");
		fideloNumero3 = new JButton("3");fideloNumero8 = new JButton("8");
		fideloNumero4 = new JButton("4");fideloNumero9 = new JButton("9");
		fideloNumero0.setBounds(50,45,42,40);fideloNumero0.addActionListener(controller);
		fideloNumero1.setBounds(90,45,42,40);fideloNumero1.addActionListener(controller);
		fideloNumero2.setBounds(130,45,42,40);fideloNumero2.addActionListener(controller);
		fideloNumero3.setBounds(170,45,42,40);fideloNumero3.addActionListener(controller);
		fideloNumero4.setBounds(210,45,42,40);fideloNumero4.addActionListener(controller);
		fideloNumero5.setBounds(50,85,42,40);fideloNumero5.addActionListener(controller);
		fideloNumero6.setBounds(90,85,42,40);fideloNumero6.addActionListener(controller);
		fideloNumero7.setBounds(130,85,42,40);fideloNumero7.addActionListener(controller);
		fideloNumero8.setBounds(170,85,42,40);fideloNumero8.addActionListener(controller);
		fideloNumero9.setBounds(210,85,42,40);fideloNumero9.addActionListener(controller);
		
		codeFidelo = new JPasswordField("");
		codeFidelo.setBounds(50,125,115,20);
		codeFidelo.setEditable(false);
		
		effacerFidelo = new JButton("Effacer");
		effacerFidelo.setBounds(165,125,87,20);
		effacerFidelo.addActionListener(controller);
		
		aideFidelo = new JLabel("<html><span style=\"color: rgb(51, 51, 204); font-size: 16px;\"><font size=\"2\">A propos du code fidelio :<br>Vous pouvez recuperer votre code fidelio en envoyant un SMS au 1111 avec le texte du code.</span></html>");
		aideFidelo.setBounds(10,120,300,100);
		
		fideloPane = new JPanel();
		fideloPane.add(codeFideloInfo);
		fideloPane.add(fideloNumero0);fideloPane.add(fideloNumero1);fideloPane.add(fideloNumero2);fideloPane.add(fideloNumero3);
		fideloPane.add(fideloNumero4);fideloPane.add(fideloNumero5);fideloPane.add(fideloNumero6);fideloPane.add(fideloNumero7);
		fideloPane.add(fideloNumero8);fideloPane.add(fideloNumero9);
		fideloPane.add(codeFidelo);fideloPane.add(effacerFidelo);fideloPane.add(aideFidelo);
		fideloPane.setLayout(null);
		fideloPane.setBounds(350,10,300,200);
		fideloPane.setBackground(Color.WHITE);
		fideloPane.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.decode("#f48024")));

		
		email = new JLabel("<html>Saisissez votre adresse mail de notification :</html>");
		email.setBounds(10,5,300,30);
		
		emailText = new JTextField();
		emailText.setBounds(50,42,200,20);
		
		confirmerEmail = new JLabel("Confirmez votre adresse mail :");
		confirmerEmail.setBounds(10,60,220,30);
		
		confirmerEmailText = new JTextField();
		confirmerEmailText.setBounds(50,90,200,20);
		
		emailPane = new JPanel();
		emailPane.add(email);
		emailPane.add(emailText);
		emailPane.add(confirmerEmail);
		emailPane.add(confirmerEmailText);
		emailPane.setLayout(null);
		emailPane.setBounds(10,220,300,120);
		emailPane.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.decode("#f48024")));
		emailPane.setBackground(Color.white);
		
		confirmerCondition = new JLabel("<html>j'ai lu et j'accepte les conditions particulieres d'utilisation,notamment la mention relative de la protection des données personnelles</html>");
		confirmerCondition.setBounds(10,0,300,80);
		
		accepterCondition = new JCheckBox();
		accepterCondition.setBounds(130,80,22,15);
		
		conditionPane = new JPanel();
		conditionPane.add(confirmerCondition);
		conditionPane.add(accepterCondition);
		conditionPane.setLayout(null);
		conditionPane.setBounds(350,220,300,120);
		conditionPane.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.decode("#f48024")));
		conditionPane.setBackground(Color.white);
		
		payerAchat = new JButton("Consulter et payer en ligne");
		payerAchat.setBounds(140,350,230,20);
		payerAchat.addActionListener(controller);
		
		annulerAchat = new JButton("Annuler");
		annulerAchat.setBounds(390,350,100,20);
		annulerAchat.addActionListener(controller);
		
		motherPane = new JPanel();
		motherPane.add(telephonePane);
		motherPane.add(fideloPane);
		motherPane.add(emailPane);
		motherPane.add(conditionPane);
		motherPane.add(payerAchat);
		motherPane.add(annulerAchat);
		motherPane.setLayout(null);
		motherPane.setBackground(Color.white);
		motherPane.setBounds(0,0,675,420);
		
		this.add(motherPane);
		ImageIcon logo = new ImageIcon("/home/anonsurf/eclipse Workspace/Java Workspace/Maroc Telecom/src/image/iamLogo.png");
		this.setIconImage(logo.getImage());
		this.setTitle("Factures d'Internet");
		this.setResizable(false);
		this.setSize(675,420);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	public JTextField getNumTelephone() {
		return numTelephone;
	}
	public JTextField getEmailText() {
		return emailText;
	}
	public JTextField getConfirmerEmailText() {
		return confirmerEmailText;
	}
	public JCheckBox getAccepterCondition() {
		return accepterCondition;
	}
	public JPasswordField getCodeFidelo() {
		return codeFidelo;
	}
	public JButton getAnnulerAchat() {
		return annulerAchat;
	}
	public JButton getPayerAchat() {
		return payerAchat;
	}
	public JButton getEffacerFidelo() {
		return effacerFidelo;
	}
	public JButton getFideloNumero0() {
		return fideloNumero0;
	}
	public JButton getFideloNumero1() {
		return fideloNumero1;
	}
	public JButton getFideloNumero2() {
		return fideloNumero2;
	}
	public JButton getFideloNumero3() {
		return fideloNumero3;
	}
	public JButton getFideloNumero4() {
		return fideloNumero4;
	}
	public JButton getFideloNumero5() {
		return fideloNumero5;
	}
	public JButton getFideloNumero6() {
		return fideloNumero6;
	}
	public JButton getFideloNumero7() {
		return fideloNumero7;
	}
	public JButton getFideloNumero8() {
		return fideloNumero8;
	}
	public JButton getFideloNumero9() {
		return fideloNumero9;
	}
	
	public void action1(String S) {
		codeFidelo.setText(S);
	}
	public void action2(View1 view1,Model1 model) {
		String Error = "";
		if(view1.getNumTelephone().getText().length() != 10) Error += "- inserer un valide numero de Telephone\n";
		if(view1.getCodeFidelo().getPassword().length != 8) Error += "- inserer un valide code Fidelio \n";
		if(view1.getEmailText().getText().indexOf('@') == -1 || view1.getEmailText().getText().indexOf('.') == -1 || !view1.getEmailText().getText().equals(view1.getConfirmerEmailText().getText())) {
			Error += "- inserer une valide Adresse Email \n";
		}
		if(!view1.getAccepterCondition().isSelected()) Error += "- Accepter Les conditions d'utilisation \n";
		if(!Error.equals("")) {
			JOptionPane.showMessageDialog(null, Error, "Error", JOptionPane.ERROR_MESSAGE);
		}
		if(Error.equals("")) {
			model.setNumeroTele(view1.getNumTelephone().getText());
			model.setCodeFidelioPass(view1.getCodeFidelo().getPassword());
			model.setEmail(view1.getEmailText().getText());
			try {
				if(model.verifierSurBaseDonne()>0) {		
					Model1 modelk = new Model1();
					View2 vk = new View2(modelk);
					new Controller(vk,modelk);
				}
				else JOptionPane.showMessageDialog(null, "Service non disponible pour les clients Jawal","Error",JOptionPane.ERROR_MESSAGE);
			} catch (SQLException e) {
			}
		}
	}
}
