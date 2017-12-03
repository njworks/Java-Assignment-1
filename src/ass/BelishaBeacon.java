package ass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;





public class BelishaBeacon extends JComponent{
	
	Color color = Color.ORANGE;
  //The window
 public static void main(String[] a){

  JFrame f = new JFrame("Belisha Beacon");
  f.setSize(700,700);
  f.add(new BelishaBeacon());
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setVisible(true);
  f.setResizable(false);
 
  //first button
  	 JButton flash = new JButton("Flash");
  	 flash.setVisible(true);
  	 flash.setPreferredSize(new Dimension(340, 30));
  
  //second button
	 JButton steady = new JButton("Steady");
	 steady.setVisible(true);
	 steady.setPreferredSize(new Dimension(340, 30));
	 
  //button layout
	 JPanel buttonPosition = new JPanel();
	 buttonPosition.add(flash);
	 buttonPosition.add(steady);
	 f.add(buttonPosition, BorderLayout.SOUTH);
	 
	 steady.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		   test = false;
		        
		    } 
		});
	 flash.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent i) { 
		    test = true;
		    }
		});
	
 }
 public static boolean test = true;



	//The flashing set up
public BelishaBeacon(){
	 
	Timer timer = new Timer(500, new ActionListener(){
	    public void actionPerformed(ActionEvent e){
	        
	    	if (color.equals(Color.ORANGE)){
	            color = Color.LIGHT_GRAY;
	        } else {
	            color = Color.ORANGE;
	        }
	        repaint();
	    }
	});
	timer.start();	
}

 //The beacon
 public void paintComponent(Graphics graphics){
//super.paintComponent(a);
	 if (test==true){
		  Graphics2D a=(Graphics2D) graphics;
		  a.setColor(color);
		  a.fillOval(280,100,100,100);
		 }
		 if (test == false){
			 Graphics2D a=(Graphics2D) graphics;
			  a.setColor(Color.ORANGE);
			  a.fillOval(280,100,100,100);
		 }
  
  
  Graphics2D d=(Graphics2D) graphics;
  d.setColor(Color.black);
  d.fillRect(320, 200, 21, 50);
  d.setColor(Color.black);
  d.drawRect(320, 250, 20, 50);
  d.setColor(Color.black);
  d.fillRect(320, 300, 21, 50);
  d.setColor(Color.black);
  d.drawRect(320, 350, 20, 50);
  d.setColor(Color.black);
  d.fillRect(320, 400, 21, 50);
  d.setColor(Color.black);
  d.drawRect(320, 450, 20, 50);
  d.setColor(Color.black);
  d.fillRect(320, 500, 21, 50);
  
 }
 
 	}



