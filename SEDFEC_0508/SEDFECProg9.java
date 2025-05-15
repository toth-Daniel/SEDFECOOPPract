import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SEDFECProg9 extends JFrame implements ActionListener, ItemListener
{
	JLabel label = new JLabel("Szöveg");
	JButton button = new JButton("Törlés");
	JTextField textField = new JTextField(20);
	JCheckBox checkBoxFont = new JCheckBox("Kis/nagybetű");
	JCheckBox checkBoxColor = new JCheckBox("Kék/piros");

	public SEDFECProg9(String name)
	{
		super(name);
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.gray);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		checkBoxFont.setSelected(false);

		add(label);
		label.setVisible(true);
		add(textField);
		add(checkBoxFont);
		checkBoxColor.setVisible(true);
		add(checkBoxColor);
		add(button);

		button.addActionListener(this);
		checkBoxFont.addItemListener(this);
		checkBoxColor.addItemListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button)
		{
			textField.setText("");
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == checkBoxColor && e.getStateChange() == e.SELECTED)
		{
			textField.setForeground(Color.red);
		}
		else
		{
			textField.setForeground(Color.blue);
		}

		if (e.getSource() == checkBoxFont && e.getStateChange() == e.SELECTED)
		{
			textField.setText(textField.getText().toUpperCase());
		}
		else
		{
			textField.setText(textField.getText().toLowerCase());
		}
	}

	public static void main(String[] args)
	{
		SEDFECProg9 window = new SEDFECProg9("Jelölőnégyzet");
	}
}
