import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener{
	private View view;
	private View1 view1;
	private View2 view2;
	private Model1 model;
	public Controller(View v) {
		view = v;
	}
	public Controller(View1 v,Model1 m) {
		view1 = v;
		model = m;
	}
	public Controller(View2 v,Model1 m) {
		view2 = v;
		model = m;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		if (view != null) {
			if(evt.getSource() == view.getButtonMobile()) {
				Model1 modelk = new Model1();
				View1 vk = new View1(modelk);
				new Controller(vk,modelk);
			}
		}
 
		if (view1 != null && model != null) {
			if (evt.getSource() == view1.getFideloNumero0() || evt.getSource() == view1.getFideloNumero1() || evt.getSource() == view1.getFideloNumero2()
					|| evt.getSource() == view1.getFideloNumero3() ||evt.getSource() == view1.getFideloNumero4() || evt.getSource() == view1.getFideloNumero5()
					|| evt.getSource() == view1.getFideloNumero6() || evt.getSource() == view1.getFideloNumero7() || evt.getSource() == view1.getFideloNumero8()
					|| evt.getSource() == view1.getFideloNumero9()) {
				model.setCodeFidelio(((JButton)evt.getSource()).getText());
				view1.action1(model.getCodeFidelio());
				}
			if (evt.getSource() == view1.getEffacerFidelo()) {
				model.setCodeFidelioEff("");
				view1.action1(model.getCodeFidelio());
			}
			if(evt.getSource() == view1.getAnnulerAchat()) {
			       view1.dispose();
			}
			if(evt.getSource() == view1.getPayerAchat()) {
				view1.action2(view1,model);
			}
		}
		if(view2 != null && model != null) {
			if(evt.getSource() == view2.getAnnulerPaiement()) {
				view2.dispose();
			}
			if(evt.getSource() == view2.getValiderPaiement()) {
				view2.action1(view2,model);
			}
		}
	}
}
