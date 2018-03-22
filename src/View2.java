import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View2 extends JFrame  {
	private JLabel paiement,methodePaiement,nomBank,iconMethodePayement,numCarte,dateExperation,moisCarte,anneeCarte,codeVerification,explicationCodeVerification,Confidencialite,AccepterCondition;
	private JComboBox<String> choixTypeCarte,choixNomBank,choixAnneeCarte,choixMoisCarte;
	private JButton annulerPaiement,validerPaiement; 
	private JPasswordField textCodeVerification;
	private JTextField textNumeroCatre;
	private JCheckBox checkCondition;
	private JPanel pane;
	public View2(Model1 model) {
		
		Controller controller = new Controller(this,model);
		
		Font  paiementFont  = new Font(Font.SANS_SERIF,  Font.BOLD, 26);
		
		paiement = new JLabel("  Paiement");
		paiement.setOpaque(true);
		paiement.setForeground(Color.white);
		paiement.setBackground(Color.decode("#f48024"));
		paiement.setBounds(0,0,500,40);
		paiement.setFont(paiementFont);

		
		methodePaiement = new JLabel("Méthode de paiement :");
		methodePaiement.setBounds(5, 75, 180, 20);
		
		String [] tabChoixTypeCarte = {"Visa","Master Card","CMI","Maestro"};
		choixTypeCarte = new JComboBox<String>(tabChoixTypeCarte);
		choixTypeCarte.setBounds(185,75,100,20);
		
		Icon iconPayement = new ImageIcon("/home/anonsurf/eclipse Workspace/Java Workspace/Maroc Telecom/src/image/methodePayement.PNG");
		iconMethodePayement = new JLabel(iconPayement);
		iconMethodePayement.setBounds(230,70,450,30);
		
		nomBank = new JLabel("Nom de votre banque :");
		nomBank.setBounds(5,120,170,20);
		
		String [] tabChoixNomBank = {"--------------------------------------","ARAB BANK","ATTIJARI WAFA BANK","AL BARID BANK","BANQUES POPULAIRES","BMCE BANK","BMCI","CDG CAPITAL","CFG Bank","CETELEM","CIH BANK","CREDIT AGRICOLE","CREDIT DU MAROC","DAR AL AMANE","SGMA","UMNIA BANK","DAR AL AMANE","AKHDAR BANK","NAJMAH","AL YOUSR","SAFA BANK","ARREDA"};
		choixNomBank = new JComboBox<String>(tabChoixNomBank);
		choixNomBank.setBounds(180,120,200,20);
		
		numCarte = new JLabel("Numero de carte de paiement : ");
		numCarte.setBounds(5,165,240,20);
		
		textNumeroCatre = new JTextField();
		textNumeroCatre.setBounds(240,165,180,20);
		
		dateExperation = new JLabel("Date d'expiration :");
		dateExperation.setBounds(5, 210, 140, 20);
		
		moisCarte = new JLabel("Mois");
		moisCarte.setBounds(150,210,35,20);
		
		String [] tabChoixMoisCarte = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		choixMoisCarte = new JComboBox<String>(tabChoixMoisCarte);
		choixMoisCarte.setBounds(195, 210, 50, 20);
		
		anneeCarte = new JLabel("Annee");
		anneeCarte.setBounds(260,210,45,20);
		
		String [] tabChoixAnneeCarte = {"18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37"};
		choixAnneeCarte = new JComboBox<String>(tabChoixAnneeCarte);
		choixAnneeCarte.setBounds(320, 210, 50, 20);
		
		codeVerification = new JLabel("Code de vérification de la carte : ");
		codeVerification.setBounds(5, 250, 240, 20);
		
		textCodeVerification = new JPasswordField();
		textCodeVerification.setBounds(245, 250, 50, 20);
		
		explicationCodeVerification = new JLabel("<html>(3 chiffres au dos de la carte,<a href=''>voir illustration</a> )</html>");
		explicationCodeVerification.setBounds(35, 270, 300, 30);
		
		Font  confidencialiteFont  = new Font(Font.SANS_SERIF,  Font.BOLD, 13);
		Confidencialite = new JLabel("<html>(Les informations sur le paiement vous concernant resteront confidentielles.)</html>");
		Confidencialite.setBounds(5,310,480,40);
		Confidencialite.setFont(confidencialiteFont);
		
		checkCondition = new JCheckBox();
		checkCondition.setBounds(5,370,20,30);
		
		Font  accepterConditionFont  = new Font(Font.SANS_SERIF,  Font.BOLD, 11);
		AccepterCondition = new JLabel("<html> Confirmer l'acceptation des conditions generales d'utilisation du service </html>");	
		AccepterCondition.setBounds(25,370,480,30);
		AccepterCondition.setFont(accepterConditionFont);
		
		annulerPaiement = new JButton("Annuler");
		annulerPaiement.setBounds(270,420,100,20);
		annulerPaiement.addActionListener(controller);
		
		validerPaiement = new JButton("Valider pour payer"); 
		validerPaiement.setBounds(70,420,180,20);
		validerPaiement.addActionListener(controller);
		
		pane = new JPanel();		
		pane.add(paiement);
		pane.add(methodePaiement);
		pane.add(choixTypeCarte);
		pane.add(iconMethodePayement);
		pane.add(nomBank);
		pane.add(choixNomBank);		
		pane.add(numCarte);
		pane.add(textNumeroCatre);
		pane.add(dateExperation);
		pane.add(moisCarte);
		pane.add(choixMoisCarte);
		pane.add(anneeCarte);
		pane.add(choixAnneeCarte);
		pane.add(textCodeVerification);
		pane.add(codeVerification);
		pane.add(explicationCodeVerification);
		pane.add(Confidencialite);
		pane.add(checkCondition);
		pane.add(AccepterCondition);
		pane.add(annulerPaiement);
		pane.add(validerPaiement);
		pane.setLayout(null);
		
		ImageIcon logo = new ImageIcon("/home/anonsurf/eclipse Workspace/Java Workspace/Maroc Telecom/src/image/iamLogo.png");
		this.setIconImage(logo.getImage());
		this.setContentPane(pane);
		this.setTitle("Paiement");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	public JCheckBox getCheckCondition() {
		return checkCondition;
	}
	public JPasswordField getTextCodeVerification() {
		return textCodeVerification;
	}
	public JTextField getTextNumeroCatre() {
		return textNumeroCatre;
	}
	public JLabel getCodeVerification() {
		return codeVerification;
	}
	public JLabel getConfidencialite() {
		return Confidencialite;
	}
	public JComboBox<String> getChoixTypeCarte() {
		return choixTypeCarte;
	}
	public JComboBox<String> getChoixNomBank() {
		return choixNomBank;
	}
	public JComboBox<String> getChoixAnneeCarte() {
		return choixAnneeCarte;
	}
	public JComboBox<String> getChoixMoisCarte() {
		return choixMoisCarte;
	}
	public JButton getAnnulerPaiement() {
		return annulerPaiement;
	}
	public JButton getValiderPaiement() {
		return validerPaiement;
	}
	
	public void action1(View2 view2,Model1 model) {
		String error = "";
		if(view2.getChoixNomBank().getSelectedItem().equals("--------------------------------------")) {
			error += "- choisir un valide nom de Bank\n";
		}
		if(view2.getTextNumeroCatre().getText().length() != 16) {
			error += "- inserer un valide Numero Carte\n";
		}
		if(view2.getTextCodeVerification().getPassword().length != 3) {
			error += "- inserer un valide Code de Confidentialite\n";
		}
		
		if(!view2.getCheckCondition().isSelected()) {
			error += "- Accepter Les conditions d'utilisation \n";
		}
		if(!error.equals("")) {
			JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
		}
		if(error.equals("")) {
			model.setTypeCarte((String) view2.getChoixTypeCarte().getSelectedItem());
			model.setNomBank((String) view2.getChoixNomBank().getSelectedItem());
			model.setNumCarte(view2.getTextNumeroCatre().getText());
			model.setMoisExperie((String) view2.getChoixMoisCarte().getSelectedItem());
			model.setAnneeExperie((String) view2.getChoixAnneeCarte().getSelectedItem());
			model.setCodeCarte(view2.getTextCodeVerification().getPassword());
			
			try {
				if(model.verifierSurBaseDonne2()>0) {		
					JOptionPane.showMessageDialog(null, "Merci , de payer vos factures !! ","Successful",JOptionPane.INFORMATION_MESSAGE);
					view2.dispose();
					new SendMail(model.getEmail());
				}
				else JOptionPane.showMessageDialog(null, "Service non disponible verifier vos informations Bancaire","Error",JOptionPane.ERROR_MESSAGE);
			} catch (SQLException e) {
			}
			
		}
	}
}
