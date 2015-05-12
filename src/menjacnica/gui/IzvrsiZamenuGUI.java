package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBoxValuta;
	private JLabel lblIznos;
	private JTextField tfIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnNewButton;
	private JButton btnOdustani;

	private MenjacnicaGUI glavniProzor;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI glavniProzor) {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 445, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getComboBoxValuta());
		contentPane.add(getLblIznos());
		contentPane.add(getTfIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnOdustani());
		
		this.glavniProzor= glavniProzor;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(10, 11, 86, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(194, 11, 46, 14);
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(288, 11, 112, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 31, 146, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(288, 31, 146, 20);
		}
		return textField_1;
	}
	private JComboBox getComboBoxValuta() {
		if (comboBoxValuta == null) {
			comboBoxValuta = new JComboBox();
			comboBoxValuta.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBoxValuta.setBounds(192, 31, 75, 20);
		}
		return comboBoxValuta;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 73, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getTfIznos() {
		if (tfIznos == null) {
			tfIznos = new JTextField();
			tfIznos.setColumns(10);
			tfIznos.setBounds(10, 97, 146, 20);

		}
		return tfIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(194, 73, 126, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(194, 97, 126, 20);


		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(194, 127, 126, 20);

		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					tfIznos.setText(Integer.toString(slider.getValue()));
				}
			});
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setBounds(27, 154, 383, 49);
		}
		return slider;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Izvrsi zamenu");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					izvrsiZamenu();
				}
			});
			btnNewButton.setBounds(10, 214, 146, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(242, 214, 146, 23);
		}
		return btnOdustani;
	}
	private String izbor(){
		String radiobtn;
		if (rdbtnKupovina.isSelected())
			radiobtn = "Kupovina";
		else
			radiobtn = "Prodaja";
		return radiobtn;
	}

	private void izvrsiZamenu(){
		try {
			
			String tekst ="Zamenjena valuta je:  "+comboBoxValuta.getSelectedItem().toString()+
					" Iznos transakcije: "+tfIznos.getText() +" U pitanju je: "+ izbor();
			glavniProzor.prikazi(tekst);
			dispose();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),"Greška", JOptionPane.ERROR_MESSAGE);
		}
		
	}


}
