import java.awt.BorderLayout;


import javax.swing.JFrame;

public class ProgLogin  {

	public static void main(String[] args) {
		
		Login c1 = new Login();
		
		c1.setTitle("Login");
		c1.setLayout(null);
		c1.setSize(400,250);	//tamanho da Janela
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		c1.setLocationRelativeTo(null);	//CENTRALIZA A JFrame
		c1.setResizable(false);		//NÃO DEIXA MAXIMIZAR
		c1.setVisible(true);
	}

}
