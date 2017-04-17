import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Minimal Java Swing application.
 * 
 * @author Nathan Sprague
 * 
 */
public class GUIDemo extends JFrame
{
    private JPanel panel;
    private JButton biggerButton;
    private JButton smallerButton;
	private JButton massiveButton;

    /**
     * Set up the application.
     */
    public GUIDemo()
    {
 	setTitle("Bigger/Smaller/MASSIVE");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        biggerButton = new JButton("BIGGER");
        smallerButton = new JButton("SMALLER");
	massiveButton = new JButton("MASSIVE");
        biggerButton.addActionListener(new ButtonHandler());
        smallerButton.addActionListener(new ButtonHandler());
 	massiveButton.addActionListener(new ButtonHandler());
        add(panel);
        panel.add(biggerButton);
        panel.add(smallerButton);
	panel.add(massiveButton);
        setVisible(true);
	// CONSTRUCTOR NEEDS TO BE FINISHED!
    }

    /**
     * This inner class exists to handle button events. There are other ways
     * this could have been done:
     * 
     * 1. GUIDemo could implement ActionListener itself. 
     * 2. Anonymous inner classes could be used to hand the events.
     */
    private class ButtonHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            Dimension size = getSize();

            if (e.getSource().equals(biggerButton))
            {
                setSize(size.width + 10, size.height + 10);
            }
            if(e.getSource().equals(smallerButton))
            {
                setSize(size.width - 10, size.height - 10);
            }
		if(e.getSource().equals(massiveButton))
{
		setSize(size.width +100, size.height + 100);
}

        }
    }

    /**
     * Start the app by creating a GUIDemo object.
     */
    public static void main(String[] args)
    {
        GUIDemo app = new GUIDemo();
    }
}
