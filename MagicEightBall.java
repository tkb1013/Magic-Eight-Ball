/*
	This is a GUI of the Magic 8 Ball.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MagicEightBall extends JFrame
{
   private final int WINDOW_WIDTH = 420;
   private final int WINDOW_HEIGHT = 100;
   private JPanel panel;
   private JButton subButton;// submit button
   private JTextField questionField;
   private JLabel messageLabel;
   
   /**
    * Constructor
    */
    
   public MagicEightBall()
   {
      // Call the JFrame constructor.
      super("Magic Eight Ball");
      
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Build the panel and add it to the frame.
      buildPanel();
      
      //Add the panel to the frame's content pane.
      add(panel);
      
      // Display the window.
      setVisible(true);
   } 
   
   private void buildPanel()
   {
      // Create the label, text field, and button components.
      messageLabel = new JLabel("Ask a question:");
      questionField = new JTextField(20);
      subButton = new JButton("Submit");
      
      //Add an action listener to the button.
      subButton.addActionListener(new SubButtonListener());
      
      // Create a panel to hold the components.
      panel = new JPanel();
      
      //Add the label, text field, and button to the panel.
      panel.add(messageLabel);
      panel.add(questionField);
      panel.add(subButton);
   }
   
   private class SubButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int answer;
         
         Random rand = new Random();// create Random object
         
         answer = rand.nextInt(20);// create random number 0-19 inclusively
         
         switch(answer)
         {
            case 0: 
               JOptionPane.showMessageDialog(null, "It is certain.");
               break;
            case 1:
               JOptionPane.showMessageDialog(null, "It is decidedly so.");
               break;
            case 2:
               JOptionPane.showMessageDialog(null, "Without a doubt.");
               break;
            case 3:
               JOptionPane.showMessageDialog(null, "Yes, definitely.");
               break;
            case 4:
               JOptionPane.showMessageDialog(null, "You may rely on it.");
               break;
            case 5:
               JOptionPane.showMessageDialog(null, "As I see it, yes.");
               break;
            case 6:
               JOptionPane.showMessageDialog(null, "Most likely.");
               break;
            case 7:
               JOptionPane.showMessageDialog(null, "Outlook good.");
               break;
            case 8:
               JOptionPane.showMessageDialog(null, "Yes.");
               break;
            case 9:
               JOptionPane.showMessageDialog(null, "Signs point to yes.");
               break;
            case 10:
               JOptionPane.showMessageDialog(null, "Reply hazy try again.");
               break;
            case 11:
               JOptionPane.showMessageDialog(null, "Ask again later.");
               break;
            case 12:
               JOptionPane.showMessageDialog(null, "Better not tell you now.");
               break;
            case 13:
               JOptionPane.showMessageDialog(null, "Cannot predict now.");
               break;
            case 14:
               JOptionPane.showMessageDialog(null, "Concentrate and ask again.");
               break;
            case 15:
               JOptionPane.showMessageDialog(null, "Don't count on it.");
               break;
            case 16:
               JOptionPane.showMessageDialog(null, "My reply is no.");
               break;
            case 17:
               JOptionPane.showMessageDialog(null, "My sources say no.");
               break;
            case 18:
               JOptionPane.showMessageDialog(null, "Outlook not so good.");
               break;
            case 19:
               JOptionPane.showMessageDialog(null, "Very doubtful.");
         }
         
         System.exit(0);
      }
   }
    
   public static void main(String[] args)
	{
      new MagicEightBall();
   }
}
