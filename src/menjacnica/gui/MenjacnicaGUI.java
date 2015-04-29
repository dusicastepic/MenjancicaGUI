package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;

import java.awt.FlowLayout;

import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.io.File;

import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JScrollPane scrollPane;
	private JTable table;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodaj;
	private JMenuItem mntmObrisi;
	private JMenuItem mntmZamena;
	private JPanel panel_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 374);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(15, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel());
		contentPane.add(getScrollPane_1());
		contentPane.add(getPanel_1(), BorderLayout.EAST);
		contentPane.add(getScrollPane_1_2(), BorderLayout.SOUTH);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(5, 5, 89, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setBounds(-44, 73, 89, 23);
		}
		return btnNewButton_1;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNewMenuItem());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Help");
			mnNewMenu.add(getMntmAbout());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Open");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ucitaj();

				}
			});
			mntmNewMenuItem.setIcon(new ImageIcon("E:\\Users\\Dusica\\Desktop\\open-smallicon.png"));
			mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sacuvaj();
				}
			});
			mntmSave.setIcon(new ImageIcon("E:\\Users\\Dusica\\Desktop\\save.png"));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ugasiAplikaciju();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent arg0) {
					prikaziAboutProzor();
					
				}
					
			});
		}
		return mntmAbout;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(5, 5));
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
					new Object[][] {
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
							{null, null, null, null, null, null},
					},
					new String[] {
							"\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
					}
					) {
				Class[] columnTypes = new Class[] {
						String.class, String.class, Double.class, Double.class, Double.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			addPopup(table, getPopupMenu_1());
			table.getColumnModel().getColumn(1).setPreferredWidth(85);
		}
		return table;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JPopupMenu getPopupMenu_1() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.setAlignmentY(Component.TOP_ALIGNMENT);
			popupMenu.add(getMntmDodaj());
			popupMenu.add(getMntmObrisi());
			popupMenu.add(getMntmZamena());
		}
		return popupMenu;
	}
	private JMenuItem getMntmDodaj() {
		if (mntmDodaj == null) {
			mntmDodaj = new JMenuItem("Dodaj kurs");
			mntmDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziDodajKursGUI();
				}
			});
		}
		return mntmDodaj;
	}
	private JMenuItem getMntmObrisi() {
		if (mntmObrisi == null) {
			mntmObrisi = new JMenuItem("Obrisi kurs");
			mntmObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziObrisiKursGUI();
				}
			});
		}
		return mntmObrisi;
	}
	private JMenuItem getMntmZamena() {
		if (mntmZamena == null) {
			mntmZamena = new JMenuItem("Izvrsi zamenu");
			mntmZamena.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziIzvrsiZamenuGUI();
				}
			});
		}
		return mntmZamena;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(100, 12));
			panel_1.setLayout(null);
			panel_1.add(getBtnNewButton_2());
			panel_1.add(getBtnNewButton_3());
			panel_1.add(getBtnNewButton_4());
		}
		return panel_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Dodaj kurs");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziDodajKursGUI();
				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnNewButton_2.setBounds(0, 11, 100, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Obri\u0161i kurs");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziObrisiKursGUI();
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnNewButton_3.setBounds(0, 45, 100, 23);
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("Izvr\u0161i zamenu");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziIzvrsiZamenuGUI();
				}
			});
			btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnNewButton_4.setPreferredSize(new Dimension(83, 23));
			btnNewButton_4.setBounds(0, 79, 110, 23);
		}
		return btnNewButton_4;
	}

	private JScrollPane getScrollPane_1_2() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane_1.setPreferredSize(new Dimension(100, 50));
			scrollPane_1.setViewportView(getTextArea_1());
		}
		return scrollPane_1;
	}
	private JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setPreferredSize(new Dimension(25, 25));
		}
		return textArea;
	}

	private void ucitaj(){

		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(contentPane);
			if (returnVal == JFileChooser.APPROVE_OPTION)  {
				File f = fc.getSelectedFile();
				textArea.append("\n");
				textArea.append("Ucitan fajl: " + f.getAbsolutePath());	
				
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}

	}
	private void sacuvaj(){

		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(contentPane);
			if(returnVal == JFileChooser.APPROVE_OPTION){
				File f = fc.getSelectedFile();
				textArea.append("\n");
				textArea.append("Sacuvan fajl: "+f.getAbsolutePath());
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void ugasiAplikaciju(){
		int opcija = JOptionPane.showConfirmDialog(contentPane, "Da li ZAISTA zelite da izadjete iz apliacije", "Izlazak",JOptionPane.YES_NO_CANCEL_OPTION);
	
		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	private void prikaziAboutProzor(){
		JOptionPane.showMessageDialog(contentPane, "Autor: Dusica Stepic, Verzija 1.0", "O programu Menjacnica",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	private void prikaziDodajKursGUI(){
		DodajKursGUI prozorDodaj = new DodajKursGUI(this);
		prozorDodaj.setLocationRelativeTo(contentPane);
		prozorDodaj.setVisible(true);
		
	}
	public void prikazi(String novi) {
		textArea.append(novi);
	}
	
	private void prikaziObrisiKursGUI(){
		ObrisiKursGUI prozorObrisi = new ObrisiKursGUI(this);
		prozorObrisi.setLocationRelativeTo(contentPane);
		prozorObrisi.setVisible(true);
	}
	
	private void prikaziIzvrsiZamenuGUI(){
		IzvrsiZamenuGUI prozorIzvrsiZamenu = new IzvrsiZamenuGUI(this);
		prozorIzvrsiZamenu.setLocationRelativeTo(contentPane);
		prozorIzvrsiZamenu.setVisible(true);
	}

}

