import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.scene.layout.Background;

public class Login extends JFrame {

		private JLabel lbNome, lbSenha, lbAviso;
		private JTextField tfNome, tfSenha;
		private JButton btnEntrar, btnCadastrar;
		
		
		public Login() {
			//JLabels
			lbNome = new JLabel("Nome:");
			lbNome.setBounds(10,30,50,30);
			this.add(lbNome);
			
			lbSenha = new JLabel("Senha:");
			lbSenha.setBounds(10,60,50,30);
			this.add(lbSenha);
			
			//JTextField
			tfNome = new JTextField();
			tfNome.setBounds(60,30,300,30);
			this.add(tfNome);
			
			tfSenha = new JTextField();
			tfSenha.setBounds(60,60,300,30);
			this.add(tfSenha);
			
			//JButton
			btnEntrar = new JButton("ENTRAR");
			btnEntrar.setBounds(90,100,100,50);
			this.add(btnEntrar);
			
			btnCadastrar = new JButton("CADASTRAR");
			btnCadastrar.setBounds(200,100,150,50);
			this.add(btnCadastrar);
			

			
			
			
		}

}
