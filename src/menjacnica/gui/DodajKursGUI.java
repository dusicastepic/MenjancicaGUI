package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField tfSifra;
	private JTextField tfNaziv;
	private JLabel lblProdajni;
	private JLabel lblKupovniKurs;
	private JTextField tfProdajniKurs;
	private JTextField tfKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblNewLabel;
	private JTextField tfSrednjiKurs;
	private JTextField tfSkraceniNaziv;
	private JButton btnNewButton;
	private JButton btnOdustani;
	private MenjacnicaGUI glavniProzor;
	

	/**
	 * Create the frame.
	 * @param menjacnicaGUI 
	 */
	public DodajKursGUI(MenjacnicaGUI glavniProzor) {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTfSifra());
		contentPane.add(getTfNaziv());
		contentPane.add(getLblProdajni());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTfProdajniKurs());
		contentPane.add(getTfKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfSrednjiKurs());
		contentPane.add(getTfSkraceniNaziv());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnOdustani());
		
		this.glavniProzor = glavniProzor;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 11, 46, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(200, 11, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getTfSifra() {
		if (tfSifra == null) {
			tfSifra = new JTextField();
			tfSifra.setBounds(10, 39, 180, 20);
			tfSifra.setColumns(10);
		}
		return tfSifra;
	}
	private JTextField getTfNaziv() {
		if (tfNaziv == null) {
			tfNaziv = new JTextField();
			tfNaziv.setColumns(10);
			tfNaziv.setBounds(200, 39, 180, 20);
		}
		return tfNaziv;
	}
	private JLabel getLblProdajni() {
		if (lblProdajni == null) {
			lblProdajni = new JLabel("Prodajni kurs");
			lblProdajni.setBounds(10, 70, 180, 14);
		}
		return lblProdajni;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(200, 70, 180, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTfProdajniKurs() {
		if (tfProdajniKurs == null) {
			tfProdajniKurs = new JTextField();
			tfProdajniKurs.setColumns(10);
			tfProdajniKurs.setBounds(10, 103, 180, 20);
		}
		return tfProdajniKurs;
	}
	private JTextField getTfKupovniKurs() {
		if (tfKupovniKurs == null) {
			tfKupovniKurs = new JTextField();
			tfKupovniKurs.setColumns(10);
			tfKupovniKurs.setBounds(200, 103, 180, 20);
		}
		return tfKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 151, 180, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Skraceni naziv");
			lblNewLabel.setBounds(200, 151, 180, 14);
		}
		return lblNewLabel;
	}
	private JTextField getTfSrednjiKurs() {
		if (tfSrednjiKurs == null) {
			tfSrednjiKurs = new JTextField();
			tfSrednjiKurs.setColumns(10);
			tfSrednjiKurs.setBounds(10, 175, 180, 20);
		}
		return tfSrednjiKurs;
	}
	private JTextField getTfSkraceniNaziv() {
		if (tfSkraceniNaziv == null) {
			tfSkraceniNaziv = new JTextField();
			tfSkraceniNaziv.setColumns(10);
			tfSkraceniNaziv.setBounds(200, 175, 180, 20);
		}
		return tfSkraceniNaziv;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dodaj();
				}
			});
			btnNewButton.setBounds(10, 228, 180, 23);
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
			btnOdustani.setBounds(200, 228, 180, 23);
		}
		return btnOdustani;
	}
	private void dodaj(){
		
			String text ="Naziv sifre: " + tfSifra.getText() + " Naziv kursa: "+ tfNaziv.getText() + 
					" Naziv prodajnog kursa: " + tfProdajniKurs.getText() + " Naziv kupovnog kursa: "+ tfKupovniKurs.getText() 
					+ " Naziv srednjeg kursa: "+ tfSrednjiKurs.getText() + " Skraceni naziv:"+ tfSkraceniNaziv.getText();
			
			        glavniProzor.prikazi(text);
					dispose();
		
		
	}
	
}
