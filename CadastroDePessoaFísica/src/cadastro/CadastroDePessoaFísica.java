package cadastro;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroDePessoaFísica extends JFrame{
	
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField();
	
	JLabel lblEnd = new JLabel("Endereço:");
	JTextField txtEnd = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro:");
	JTextField txtBairro = new JTextField();
	
	JLabel lblCEP = new JLabel("CEP:");
	MaskFormatter mskCEP = null;
	JFormattedTextField ftfCEP = new JFormattedTextField();
	
	JLabel lblCidade = new JLabel("Cidade:");
	JTextField txtCidade = new JTextField();
	
	JLabel lblEstado = new JLabel("Estado:");
	JComboBox cboEstado = new JComboBox();
	
	JLabel lblTelefone = new JLabel("Telefone:");
	MaskFormatter mskFone = null;
	JFormattedTextField ftfFone = new JFormattedTextField();
	
	JLabel lblCelular = new JLabel("Celular:");
	MaskFormatter mskCel = null;
	JFormattedTextField ftfCel = new JFormattedTextField();
	
	JLabel lblSexo = new JLabel("Sexo:");
	JRadioButton[] rdnSexo = new JRadioButton[2];
	ButtonGroup a = new ButtonGroup();
	
	JLabel lblRG = new JLabel("RG:");
	MaskFormatter mskRG = null;
	JFormattedTextField ftfRG = new JFormattedTextField();
	
	JLabel lblCPF = new JLabel("CPF:");
	MaskFormatter mskCPF = null;
	JFormattedTextField ftfCPF = new JFormattedTextField();
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnCancel = new JButton("Cancelar");
	
	public CadastroDePessoaFísica(){
		super ("Cadastro de pessoa física");
		
		Container painel = this.getContentPane();
		painel.setLayout(null);
		
		painel.add(lblNome);
		lblNome.setBounds(20, 20, 50, 20);
		painel.add(txtNome);
		txtNome.setBounds(100, 20, 300, 20);
		
		painel.add(lblEnd);
		lblEnd.setBounds(20, 50, 50, 20);
		painel.add(txtEnd);
		txtEnd.setBounds(100, 50, 300, 20);
		
		painel.add(lblBairro);
		lblBairro.setBounds(20, 80, 50, 20);
		painel.add(txtBairro);
		txtBairro.setBounds(100, 80, 300, 20);
		
		painel.add(lblCEP);
		lblCEP.setBounds(20, 110, 50, 20);
		try {
			mskCEP = new MaskFormatter("#####-###");
			ftfCEP = new JFormattedTextField(mskCEP);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		painel.add(ftfCEP);
		ftfCEP.setBounds(100, 110, 300, 20);
		
		painel.add(lblCidade);
		lblCidade.setBounds(20, 140, 50, 20);
		painel.add(txtCidade);
		txtCidade.setBounds(100, 140, 300, 20);
		
		painel.add(lblEstado);
		lblEstado.setBounds(20, 170, 50, 20);
		painel.add(cboEstado);
		cboEstado.setBounds(100, 170, 300, 20);
		cboEstado.addItem("AM");
		cboEstado.addItem("AL");
		cboEstado.addItem("AP");
		cboEstado.addItem("BA");
		cboEstado.addItem("CE");
		cboEstado.addItem("DF");
		cboEstado.addItem("ES");
		cboEstado.addItem("GO");
		cboEstado.addItem("MA");
		cboEstado.addItem("MT");
		cboEstado.addItem("MS");
		cboEstado.addItem("MG");
		cboEstado.addItem("PA");
		cboEstado.addItem("PB");
		cboEstado.addItem("PR");
		cboEstado.addItem("PE");
		cboEstado.addItem("PI");
		cboEstado.addItem("RJ");
		cboEstado.addItem("RN");
		cboEstado.addItem("RS");
		cboEstado.addItem("RO");
		cboEstado.addItem("RR");
		cboEstado.addItem("SC");
		cboEstado.addItem("SP");
		cboEstado.addItem("SE");
		cboEstado.addItem("TO");
		
		painel.add(lblTelefone);
		lblTelefone.setBounds(20, 200, 50, 20);
		try {
			mskFone = new MaskFormatter("(##)####-####");
			ftfFone = new JFormattedTextField(mskFone);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		painel.add(ftfFone);
		ftfFone.setBounds(100, 200, 300, 20);
		
		painel.add(lblCelular);
		lblCelular.setBounds(20, 230, 50, 20);
		try {
			mskCel = new MaskFormatter("(##)#####-####");
			ftfCel = new JFormattedTextField(mskCel);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		painel.add(ftfCel);
		ftfCel.setBounds(100, 230, 300, 20);
		
		painel.add(lblSexo);
		lblSexo.setBounds(20, 260, 50, 20);
		rdnSexo[0] = new JRadioButton("Feminino");
		rdnSexo[1] = new JRadioButton("Masculino");
		a.add(rdnSexo[0]);
		a.add(rdnSexo[1]);
		painel.add(rdnSexo[0]);
		painel.add(rdnSexo[1]);
		rdnSexo[0].setBounds(150, 260, 100, 20);
		rdnSexo[1].setBounds(260, 260, 100, 20);
		
		painel.add(lblRG);
		lblRG.setBounds(20, 290, 50, 20);
		try {
			mskRG = new MaskFormatter("#.###.###-A");
			ftfRG = new JFormattedTextField(mskRG);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		painel.add(ftfRG);
		ftfRG.setBounds(100, 290, 300, 20);
		
		painel.add(lblCPF);
		lblCPF.setBounds(20, 320, 50, 20);
		try {
			mskCPF = new MaskFormatter("###.###.###-AA");
			ftfCPF = new JFormattedTextField(mskCPF);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		painel.add(ftfCPF);
		ftfCPF.setBounds(100, 320, 300, 20);
		
		painel.add(btnCadastrar);
		btnCadastrar.setBounds(90, 360, 140, 35);
		painel.add(btnCancel);
		btnCancel.setBounds(250, 360, 140, 35);
		
		this.setSize(500, 450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		CadastroDePessoaFísica cad = new CadastroDePessoaFísica();
	}
}
