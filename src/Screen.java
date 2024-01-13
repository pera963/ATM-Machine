// Screen.java
// Represents the screen of the ATM
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JButton;




public class Screen  extends JFrame 

{
	public Screen() {
	}
	public JFrame Mainframe;
	 public static JTextField Inputfield1;
	 public static JTextField Inputfield2;
	 public static JTextField Inputfield3;
	 public static JTextField Inputfield4;
	 public JLabel messageJLabel; 
	 public JLabel messageJLabel2; // displays message of game status
	 public JLabel messageJLabel3;
	 public JLabel messageJLabel4;
	 public JLabel messageJLabel5;
	 public JLabel messageJLabel8;
	 public JLabel messageJLabel9;
	 public JLabel messageJLabel10;
	 public JButton loginbutton; // creates new game
	 public JButton button1;
	 public JButton button2;
	 public JButton button3;
	 public JButton button4;
	 public JButton button5;
	 public JButton Exit;
	 public int accnum = 0;
	 public int PIN = 0;
	public JLabel messageJLabel6;
	public JLabel messageJLabel7;
	 
	
   // displays a message without a carriage return
   public void displayMessage(String message) 
   {
      System.out.print(message); 
   } // end method displayMessage

   // display a message with a carriage return
   public void displayMessageLine(String message) 
   {
      System.out.println(message);   
   } // end method displayMessageLine

   // display a dollar amount
   public void displayDollarAmount(double amount)
   {
      System.out.printf("$%,.2f", amount);   
   } // end method displayDollarAmount 
   
   //create the login GUI
public void createlogin() {
	
    Mainframe = new JFrame("ATM");
    messageJLabel4 = new JLabel("Insert your credit/debit card then                             ");
	messageJLabel = new JLabel("  Enter your PIN number:    ");
	
	 Inputfield1 = new JTextField( 10 );
	 
	 messageJLabel2 = new JLabel(" 														                  ");
	 Inputfield2 = new JTextField( 10 );
	 loginbutton = new JButton("Login");
	 messageJLabel3 = new JLabel("");
	 Mainframe.getContentPane().setLayout( new FlowLayout() ); // set layout
	 Mainframe.getContentPane().add(messageJLabel4);
	 Mainframe.getContentPane().add( messageJLabel ); // add first prompt
	 
	 Mainframe.getContentPane().add( Inputfield2 );
	 Mainframe.getContentPane().add( messageJLabel2 );
	 //Mainframe.add(loginbutton);
	  // add message label 
	 Mainframe.getContentPane().add(messageJLabel3);
	 Inputfield2.setEditable(false);
	 Mainframe.repaint();

	
}
//create the main menu GUI
public void createmenu(){
	Mainframe.getContentPane().removeAll();
	messageJLabel = new JLabel("Welcome");
	messageJLabel2 = new JLabel("1 - Balance");
	messageJLabel3 = new JLabel("2 - Withdrawal");
	messageJLabel4 = new JLabel("3 - Deposit");
	messageJLabel5 = new JLabel("4 - Exit");
	Mainframe.getContentPane().setLayout( new FlowLayout() ); // set layout
	Mainframe.getContentPane().add(messageJLabel);
	Mainframe.getContentPane().add( messageJLabel2 ); // add first prompt
	Mainframe.getContentPane().add( messageJLabel3 ); // add second prompt
	Mainframe.getContentPane().add( messageJLabel4 ); // add message label 
	Mainframe.getContentPane().add( messageJLabel5 );
	Mainframe.repaint();
}

//create the Balance GUI
public void creatBalanceGUI(){
	Mainframe.getContentPane().removeAll();
	messageJLabel = new JLabel("Balance Information:        ");
	messageJLabel2 = new JLabel("Avaliable Balance:");
	messageJLabel3 = new JLabel("Total Balance:");
	Exit = new JButton("Back");
	Mainframe.getContentPane().setLayout( new FlowLayout() );
	Mainframe.getContentPane().add(messageJLabel);
	Mainframe.getContentPane().add(messageJLabel2);
	Mainframe.getContentPane().add(messageJLabel3);
	Mainframe.getContentPane().add(Exit);
	Mainframe.repaint();
}

//Create the withdraw GUI
public void createWithdrawGUI(){
	Mainframe.getContentPane().removeAll();
	Mainframe.revalidate();
	messageJLabel = new JLabel("Withdraw Menu:                       ");
	messageJLabel2 = new JLabel("1 - $20 ");
	messageJLabel3 = new JLabel("2 - $40 ");
	messageJLabel4 = new JLabel("3 - $60 ");
	messageJLabel5 = new JLabel("4 - $100 ");
	messageJLabel6 = new JLabel("5 - $200 ");
	messageJLabel7 = new JLabel("            Choose an amount to withdraw");
	Exit = new JButton("Cancel");
	Mainframe.getContentPane().setLayout( new FlowLayout() );
	Mainframe.getContentPane().add(messageJLabel);
	Mainframe.getContentPane().add(messageJLabel2);
	Mainframe.getContentPane().add(messageJLabel3);
	Mainframe.getContentPane().add(messageJLabel4);
	Mainframe.getContentPane().add(messageJLabel5);
	Mainframe.getContentPane().add(messageJLabel6);
	Mainframe.getContentPane().add(Exit);
	Mainframe.getContentPane().add(messageJLabel7);
	Mainframe.repaint();
	
}

//Create the Deposit GUI
public void CreateDepositGUI(){
	Mainframe.getContentPane().removeAll();
	messageJLabel2 = new JLabel("Please enter a deposit amount in CENTS");
	messageJLabel3 = new JLabel("");
	Inputfield2 = new JTextField(10);
	Inputfield2.setEditable(false);
	button1 = new JButton("Deposit");
	Exit = new JButton("Cancel");
	Mainframe.getContentPane().add(messageJLabel2);
	Mainframe.getContentPane().add(messageJLabel3);
	Mainframe.getContentPane().add(Inputfield2);
	Mainframe.getContentPane().add(Exit);
	Mainframe.repaint();
}


public void setGUI(){
	repaint();
}

//Create the admin page GUI
public void createAdminpage(){
	messageJLabel = new JLabel("View Users:");
	messageJLabel2 = new JLabel("Account number:");
	messageJLabel3 = new JLabel("Avaliable Balance:");
	messageJLabel4 = new JLabel("Total Balance:");
	messageJLabel5 = new JLabel("________________________________________________");
	button1 = new JButton("Next");
	button4 = new JButton("Previous");
	Exit = new JButton("Back");
	Inputfield1 = new JTextField(10);
	Inputfield2 = new JTextField(10);
	Inputfield3 = new JTextField(10);
	Inputfield4 = new JTextField(10);
	Mainframe.getContentPane().setLayout( new FlowLayout() );
	messageJLabel6 = new JLabel("Add Account: ");
	messageJLabel7 = new JLabel("User name: ");
	Mainframe.getContentPane().add(messageJLabel);
	messageJLabel8 = new JLabel("          Account number: ");
	Mainframe.getContentPane().add(messageJLabel2);
	messageJLabel10 = new JLabel("                                       PIN: ");
	
	messageJLabel9 = new JLabel("              Balance number: ");
	button2 = new JButton("Add");
	button3 = new JButton("Delete");
	
	
	Mainframe.getContentPane().add(messageJLabel3);
	Mainframe.getContentPane().add(messageJLabel4);
	Mainframe.getContentPane().add(button4);
	Mainframe.getContentPane().add(button1);
	Mainframe.getContentPane().add(button3);
	Mainframe.getContentPane().add(messageJLabel5);
	Mainframe.getContentPane().add(messageJLabel6);
	Mainframe.getContentPane().add(messageJLabel7);
	Mainframe.getContentPane().add(Inputfield1);
	Mainframe.getContentPane().add(messageJLabel8);
	Mainframe.getContentPane().add(Inputfield2);
	Mainframe.getContentPane().add(messageJLabel10);
	Mainframe.getContentPane().add(Inputfield4);
	Mainframe.getContentPane().add(messageJLabel9);
	Mainframe.getContentPane().add(Inputfield3);
	
	Mainframe.getContentPane().add(button2);
	
	Mainframe.getContentPane().add(Exit);
	Mainframe.repaint();
}


} // end class Screen


