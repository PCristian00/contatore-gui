
import java.awt.event.*;

import javax.swing.*;

public class CGui extends JFrame {

	private static final long serialVersionUID = 1L;

	Contatore c = new Contatore();

	public CGui() {
		//impostazioni finestra
		setTitle("Contatore");
		setSize(400, 800);
		//creazione pulsanti
		JButton mst = new JButton("MOSTRA");
		JButton inc = new JButton("INCREMENTA");
		JButton dec = new JButton("DECREMENTA");
		JButton azz = new JButton("AZZERA");
		//azioni dei pulsanti
		mst.addActionListener(new Ascolta());
		inc.addActionListener(new Ascolta());
		dec.addActionListener(new Ascolta());
		azz.addActionListener(new Ascolta());
		//creazione pannello
		JPanel panel = new JPanel();
		//aggiunta dei pulsanti creati al pannello
		panel.add(mst);
		panel.add(inc);
		panel.add(dec);
		panel.add(azz);

		this.getContentPane().add(panel);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class Ascolta implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String press = e.getActionCommand();

			if (press.equals("MOSTRA"))
				JOptionPane.showMessageDialog(null, c);

			if (press.equals("INCREMENTA"))
				c.incCount();

			if (press.equals("DECREMENTA"))
				c.decCount();

			if (press.equals("AZZERA"))
				c.zeroCount();
		}
	}

	public static void main(String[] args) {
		new CGui();
	}

}
