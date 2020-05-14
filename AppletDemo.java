import java.applet.*;
import java.awt.*;

import java.awt.event.*;

/*<applet code=AppletDemo width=1000 height=1000 ></applet>*/

public class AppletDemo extends Applet implements ActionListener
{
    
	Button b1;
    
	TextField t1,t2,t3,t4;
    
	Label l,l1,l2,l3,l4;


		public void init()
		 {
    
  			l=new Label("COMPOUND INTEREST CALCULATOR");
			
			Font myFont = new Font("Serif",Font.BOLD,12);
 			l.setFont(myFont);		
			add(l);


 		        l1=new Label("Principal Amount");
     
  			l1.setBounds(100,40,100,20);
     
 			 t1=new TextField(10);
         
 			 t1.setBounds(210,40,100,20);
       
    			add(l1);
         
  			add(t1);

  
     
			l2=new Label("Interest Rate");
       
			l2.setBounds(100,80,100,20);
     
 			t2=new TextField(10);
       
			t2.setBounds(210,80,100,20);
           
			add(l2);
           
			add(t2);

  
    
			l3=new Label("Time Span");
      
 			l3.setBounds(100,120,100,20);
      
 			t3=new TextField(10);
       
			t3.setBounds(210,120,100,20);
           
			add(l3);
         
  			add(t3);

 
     
			l4=new Label("Result");
       
			l4.setBounds(100,160,100,20);
       
			t4=new TextField(10);
      
 			t4.setBounds(210,160,100,20);
          
 			add(l4);
           
			add(t4);


 
     
			b1=new Button("CALCULATE");
			add(b1);
		        b1.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e)
	{
        
 		try
		{
			int p=Integer.parseInt(t1.getText());
    
 			float r=Float.parseFloat(t2.getText());
   
  			int t=Integer.parseInt(t3.getText());
        
 			double result=0;
    
    
     
			result=p * (Math.pow((1 + r / 100), t));
    
 			t4.setText(String.valueOf(result)); 
   
 		}

   
 
		catch (NumberFormatException ex)
	
		{
 			System.out.println("NumberFormatException: " + ex.getMessage());
	     
 			System.out.println("Please Enter The valid Inputs......");
		}
	}

} 
