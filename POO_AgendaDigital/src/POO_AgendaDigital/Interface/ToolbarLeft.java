package POO_AgendaDigital.Interface;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import POO_AgendaDigital.Core.Pessoa;
import POO_AgendaDigital.Infraestrutura.SQLite;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class ToolbarLeft extends JPanel {

	private JButton btnNovo;
	private JButton btnEditar;
	private JList jListPessoas;
	private JTextField txtTes;
	
	/**
	 * Create the panel.
	 */
	public ToolbarLeft() {
		
		//Region ToolbarLeft Config
		
		this.setBackground(new Color(240, 240, 240));
		this.setLayout(null);
		this.setBorder(new MatteBorder(0, 0, 0, 1, (Color) SystemColor.activeCaption));
		
		//EndRegion
		
		//Region Buttons
		
		btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 11, 83, 32);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(144, 11, 89, 32);
		
		//EndRegion
		
		//Region JList
		
		DefaultListModel<Pessoa>  model = new DefaultListModel<Pessoa>(); //Aqui vai receber a list pelo SQL
		for (int i = 0; i < SQLite.qtdePessoasRegistradas(); i++) {
			model.add(i, SQLite.getPessoaByIndex(i));
		}
		
		jListPessoas = new JList(model);
		jListPessoas.setForeground(Color.BLACK);
		jListPessoas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jListPessoas.setSelectedIndex(0);
		jListPessoas.setFont(new Font("Simplified Arabic Fixed", Font.BOLD, 17));
		jListPessoas.setBackground(new Color(240, 240, 240));
		jListPessoas.setBounds(0, 144, 245, 545);
		
		//EndRegion

		//Region Label e Input
		
		JLabel lblPessoas = new JLabel(" Pessoas");
		lblPessoas.setForeground(Color.GRAY);
		lblPessoas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblPessoas.setHorizontalAlignment(SwingConstants.LEFT);
		lblPessoas.setBounds(0, 101, 201, 32);
		
		txtTes = new JTextFieldPlaceholder();
		txtTes.setBounds(20, 54, 194, 25);
		txtTes.setColumns(10);
		//EndRegion
		
		add(btnNovo);
		add(btnEditar);
		add(jListPessoas);
		add(lblPessoas);
		add(txtTes);
		
		setVisible(true);
		
	}
}