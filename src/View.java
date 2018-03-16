import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class View extends JFrame{
	
	private JPanel panel;
	private JLabel titre,introduction1,introduction2;
	private JButton buttonMobile,buttonFixe,buttonInternet;
	
	public View() {
		panel = new JPanel();
		
		Controller controller = new Controller(this);
		
		titre = new JLabel("Paiement de facture en ligne");
		Font  fontTitre  = new Font(Font.SANS_SERIF,  Font.BOLD, 15);
		titre.setFont(fontTitre);
		titre.setBounds(10,0,300,30);
		Color colorTitre = new Color(39,90,140); 
		titre.setForeground(colorTitre);
		
		introduction1 = new JLabel("Maroc Télécom met à votre disposition le service de paiement en ligne qui vous permet de régler vos factures du Fixe,");
		Font  fontIntroduction  = new Font(Font.SANS_SERIF,  Font.BOLD, 10);
		introduction1.setFont(fontIntroduction);
		introduction1.setBounds(15,30,850,30);
		
		introduction2 = new JLabel("Mobile et Internet en ligne par votre carte bancaire en toute sécurité .");
		introduction2.setFont(fontIntroduction);
		introduction2.setBounds(15,45,850,30);
		
	    Icon IconMobile = new ImageIcon("/home/anonsurf/eclipse Workspace/Java Workspace/Maroc Telecom/src/image/IconMobile.PNG");
		buttonMobile = new JButton(IconMobile);
		buttonMobile.setBounds(40,80,190,237);
		buttonMobile.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		buttonMobile.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonMobile.addActionListener(controller);
		
	    Icon IconFixe = new ImageIcon("/home/anonsurf/eclipse Workspace/Java Workspace/Maroc Telecom/src/image/IconFixe.PNG");
		buttonFixe = new JButton(IconFixe);
		buttonFixe.setBounds(250,80,190,237);
		buttonFixe.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		buttonFixe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	    Icon IconInternet = new ImageIcon("/home/anonsurf/eclipse Workspace/Java Workspace/Maroc Telecom/src/image/IconInternet.PNG");
		buttonInternet = new JButton(IconInternet);
		buttonInternet.setBounds(460,80,190,237);
		buttonInternet.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		buttonInternet.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel.add(titre);panel.add(introduction1);panel.add(introduction2);
		panel.add(buttonMobile);panel.add(buttonFixe);panel.add(buttonInternet);
		
		this.setContentPane(panel);
		ImageIcon logo = new ImageIcon("/home/anonsurf/eclipse Workspace/Java Workspace/Maroc Telecom/src/image/iamLogo.png");
		this.setIconImage(logo.getImage());
		this.setLayout(null);
		this.setTitle("Acceuil");
		this.setSize(690, 410);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JButton getButtonMobile() {
		return buttonMobile;
	}
	
	
}