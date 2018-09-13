package fracciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUICalculadora extends JFrame {
	// Se definen los componentes graficos que se utilizaran
	private JPanel contentPane; // Paneles de contenido
	private JTextField txtValor1num; // Cajas de Texto
	private JTextField txtValor1den; // Cajas de Texto
	private JTextField txtValor2num;
	private JTextField txtValor2den; // Cajas de Texto
	private JTextField txtResultado;

	public static void main(String[] args) {
		try {
			GUICalculadora frame = new GUICalculadora();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GUICalculadora() {
		
		setTitle("Calculadora Fracciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,419,312);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		//Crea el Texto
		JLabel Valnum1=new JLabel("Fraccion 1:");
		Valnum1.setBounds(25,25,70,14);
		contentPane.add(Valnum1);
		JLabel Valnum2=new JLabel("Fraccion 2:");
		Valnum2.setBounds(25,95,70,14);
		contentPane.add(Valnum2);
		
		JLabel Frac1=new JLabel("/");
		Frac1.setBounds(200,25,20,14);
		contentPane.add(Frac1);
		JLabel Frac2=new JLabel("/");
		Frac2.setBounds(200,95,20,14);
		contentPane.add(Frac2);
		//Numeradores
		txtValor1num = new JTextField();
		txtValor1num.setBounds(106, 25, 90, 20);
		contentPane.add(txtValor1num);
		txtValor1num.setColumns(10);
		txtValor2num = new JTextField();
		txtValor2num.setColumns(10);
		txtValor2num.setBounds(106, 95, 86, 20);
		contentPane.add(txtValor2num);
		//Denominadores
		txtValor1den = new JTextField();
		txtValor1den.setBounds(206, 25, 90, 20);
		contentPane.add(txtValor1den);
		txtValor1den.setColumns(10);
		txtValor2den = new JTextField();
		txtValor2den.setColumns(10);
		txtValor2den.setBounds(206, 95, 90, 20);
		contentPane.add(txtValor2den);
		//Resultados
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(25, 159, 61, 14);
		contentPane.add(lblResultado);
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(106, 159, 86, 20);
		contentPane.add(txtResultado);
		
		//Botones
		JButton btnSumar=new JButton("+");
		btnSumar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int a,b,c,d;
				a=Integer.parseInt(txtValor1num.getText());
				b=Integer.parseInt(txtValor1den.getText());
				c=Integer.parseInt(txtValor2num.getText());
				d=Integer.parseInt(txtValor2den.getText());
				//Crea un objeto Fraccion
				Fraccion r1=new Fraccion(a,b);
				Fraccion r2=new Fraccion(c,d);
				txtResultado.setText(""+Fraccion.simplificar(Fraccion.sumar(r1, r2)));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Valores Incorrectos\n"+
							ex.getMessage());
			        txtValor1num.setText(""); //Limpia cajas de texto
			        txtValor2num.setText("");
			        txtValor1den.setText(""); //Limpia cajas de texto
			        txtValor2den.setText("");
				}
				
			}
			
		});
		btnSumar.setBounds(310, 21, 41, 23);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int a,b,c,d;
				a=Integer.parseInt(txtValor1num.getText());
				b=Integer.parseInt(txtValor1den.getText());
				c=Integer.parseInt(txtValor2num.getText());
				d=Integer.parseInt(txtValor2den.getText());
				//Crea un objeto Fraccion
				Fraccion r1=new Fraccion(a,b);
				Fraccion r2=new Fraccion(c,d);
				txtResultado.setText(""+Fraccion.simplificar(Fraccion.restar(r1, r2)));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Valores Incorrectos\n"+
							ex.getMessage());
			        txtValor1num.setText(""); //Limpia cajas de texto
			        txtValor2num.setText("");
			        txtValor1den.setText(""); //Limpia cajas de texto
			        txtValor2den.setText("");
				}
				
			}
			
		});
		btnRestar.setBounds(310, 61, 41, 23);
		contentPane.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int a,b,c,d;
				a=Integer.parseInt(txtValor1num.getText());
				b=Integer.parseInt(txtValor1den.getText());
				c=Integer.parseInt(txtValor2num.getText());
				d=Integer.parseInt(txtValor2den.getText());
				//Crea un objeto Fraccion
				Fraccion r1=new Fraccion(a,b);
				Fraccion r2=new Fraccion(c,d);
				txtResultado.setText(""+Fraccion.simplificar(Fraccion.multiplicar(r1, r2)));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Valores Incorrectos\n"+
							ex.getMessage());
			        txtValor1num.setText(""); //Limpia cajas de texto
			        txtValor2num.setText("");
			        txtValor1den.setText(""); //Limpia cajas de texto
			        txtValor2den.setText("");
				}
				
			}
			
		});
		btnMultiplicar.setBounds(310, 101, 41, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int a,b,c,d;
				a=Integer.parseInt(txtValor1num.getText());
				b=Integer.parseInt(txtValor1den.getText());
				c=Integer.parseInt(txtValor2num.getText());
				d=Integer.parseInt(txtValor2den.getText());
				//Crea un objeto Fraccion
				Fraccion r1=new Fraccion(a,b);
				Fraccion r2=new Fraccion(c,d);
				txtResultado.setText(""+Fraccion.simplificar(Fraccion.dividir(r1, r2)));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Valores Incorrectos\n"+
							ex.getMessage());
			        txtValor1num.setText(""); //Limpia cajas de texto
			        txtValor2num.setText("");
			        txtValor1den.setText(""); //Limpia cajas de texto
			        txtValor2den.setText("");
				}
				
			}
			
		});
		btnDividir.setBounds(310, 141, 41, 23);
		contentPane.add(btnDividir);
	}


}
