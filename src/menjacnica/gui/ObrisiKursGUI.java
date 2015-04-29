package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JTextField tfSifra;
	private JTextField tfNaziv;
	private JTextField tfProdajniKurs;
	private JTextField tfKupovniKurs;
	private JTextField tfSrednjiKurs;
	private JTextField tfSkraceniNaziv;
	private JCheckBox chckbxZaistaObrisiKurs;
	
	private MenjacnicaGUI glavniProzor;



	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI glavniProzor) {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getTfSifra());
		contentPane.add(getTfNaziv());
		contentPane.add(getTfProdajniKurs());
		contentPane.add(getTfKupovniKurs());
		contentPane.add(getTfSrednjiKurs());
		contentPane.add(getTfSkraceniNaziv());
		contentPane.add(getChckbxZaistaObrisiKurs());
		
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
			lblNaziv.setBounds(209, 11, 46, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 79, 151, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(209, 79, 134, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 156, 118, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(209, 156, 106, 14);
		}
		return lblSkraceniNaziv;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					obrisi();
					
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 238, 182, 25);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(207, 238, 182, 25);
		}
		return btnOdustani;
	}
	private JTextField getTfSifra() {
		if (tfSifra == null) {
			tfSifra = new JTextField();
			tfSifra.setEditable(false);
			tfSifra.setColumns(10);
			tfSifra.setBounds(10, 36, 180, 20);
		}
		return tfSifra;
	}
	private JTextField getTfNaziv() {
		if (tfNaziv == null) {
			tfNaziv = new JTextField();
			tfNaziv.setEditable(false);
			tfNaziv.setColumns(10);
			tfNaziv.setBounds(209, 36, 180, 20);
		}
		return tfNaziv;
	}
	private JTextField getTfProdajniKurs() {
		if (tfProdajniKurs == null) {
			tfProdajniKurs = new JTextField();
			tfProdajniKurs.setEditable(false);
			tfProdajniKurs.setColumns(10);
			tfProdajniKurs.setBounds(10, 99, 180, 20);
		}
		return tfProdajniKurs;
	}
	private JTextField getTfKupovniKurs() {
		if (tfKupovniKurs == null) {
			tfKupovniKurs = new JTextField();
			tfKupovniKurs.setEditable(false);
			tfKupovniKurs.setColumns(10);
			tfKupovniKurs.setBounds(209, 99, 180, 20);
		}
		return tfKupovniKurs;
	}
	private JTextField getTfSrednjiKurs() {
		if (tfSrednjiKurs == null) {
			tfSrednjiKurs = new JTextField();
			tfSrednjiKurs.setEditable(false);
			tfSrednjiKurs.setColumns(10);
			tfSrednjiKurs.setBounds(10, 177, 180, 20);
		}
		return tfSrednjiKurs;
	}
	private JTextField getTfSkraceniNaziv() {
		if (tfSkraceniNaziv == null) {
			tfSkraceniNaziv = new JTextField();
			tfSkraceniNaziv.setEditable(false);
			tfSkraceniNaziv.setColumns(10);
			tfSkraceniNaziv.setBounds(209, 177, 180, 20);
		}
		return tfSkraceniNaziv;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(chckbxZaistaObrisiKurs.isSelected())
							btnObrisi.setEnabled(true);
					else {
						btnObrisi.setEnabled(false);
					}
							
				}
			});
			chckbxZaistaObrisiKurs.setBounds(10, 194, 200, 50);
		}
		return chckbxZaistaObrisiKurs;
	}
	private void obrisi(){
		try {
			String tekst ="Naziv sifre: " + tfSifra.getText() + " Naziv obrisanog kursa: "+ tfNaziv.getText() + 
					" Naziv prodajnog kursa: " + tfProdajniKurs.getText() + " Naziv kupovnog kursa: "+ tfKupovniKurs.getText() 
					+ " Naziv srednjeg kursa: "+ tfSrednjiKurs.getText() + " Skraceni naziv:"+ tfSkraceniNaziv.getText();
			glavniProzor.prikazi(tekst);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greška", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
}
