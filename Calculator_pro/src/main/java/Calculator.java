import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel  displayLabel;
	JButton sevenButton,fiveButton,sixButton,twoButton;
	JButton eightButton,nineButton,fourButton,oneButton,threeButton;
	JButton dotButton,zeroButton,equalButton,clearButton;
	JButton divButton,mulButton,minusButton,plusButton;
	boolean isoperatorClicked=false;
	String oldValue,oldvalue1,oldvalue2,oldvalue3;
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(200, 200);
		displayLabel =new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
	    sevenButton= new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton); 
		
		eightButton= new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.addActionListener(this);
		jf.add(eightButton); 
		
	    nineButton= new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.addActionListener(this);
		jf.add(nineButton); 
		
	    fourButton= new JButton("4");
		fourButton.setBounds(30,230,80,80);
		fourButton.addActionListener(this);
		jf.add(fourButton); 
		
		fiveButton= new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton); 
		
		sixButton= new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.addActionListener(this);
		jf.add(sixButton); 
		
		oneButton= new JButton("1");
		oneButton.setBounds(30,330,80,80);
		oneButton.addActionListener(this);
		jf.add(oneButton); 
		
	    twoButton= new JButton("2");
		twoButton.setBounds(130,330,80,80);
		twoButton.addActionListener(this);
		jf.add(twoButton); 
		
		threeButton= new JButton("3");
		threeButton.setBounds(230,330,80,80);
		threeButton.addActionListener(this);
		jf.add(threeButton); 
		
		 dotButton= new JButton(".");
		dotButton.setBounds(30,430,80,80);
		dotButton.addActionListener(this);
		jf.add(dotButton); 
		
		zeroButton= new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton); 
		
		equalButton= new JButton("=");
		equalButton.setBounds(230,430,80,80);
		equalButton.addActionListener(this);
		jf.add(equalButton); 
		
		divButton= new JButton("/");
		divButton.setBounds(330,130,80,80);
		divButton.addActionListener(this);
		jf.add(divButton); 
		
		 mulButton= new JButton("*");//swing jbutton text size
		mulButton.setBounds(330,230,80,80);
		mulButton.addActionListener(this);
		jf.add(mulButton); 
		
		minusButton= new JButton("-");
		minusButton.setBounds(330,330,80,80);
		minusButton.addActionListener(this);
		jf.add(minusButton); 
		
	    plusButton= new JButton("+");
		plusButton.setBounds(330,430,80,80);
		plusButton.addActionListener(this);
		jf.add(plusButton); 
		
		    clearButton= new JButton("clear");
			clearButton.setBounds(430,430,80,80);
			clearButton.addActionListener(this);
			jf.add(clearButton); 
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new Calculator();
}
public void actionPerformed(ActionEvent e) {
	//jf.getContentPane().setBackground(Color.blue);
	if(e.getSource()==sevenButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("7");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"7");
		}
	}
	else if(e.getSource()==eightButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("8");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"8");
		}
	}
	else if(e.getSource()==nineButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("9");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"9");
		}
	}
	else if(e.getSource()==fourButton)
	{
		if(isoperatorClicked)
		{
		  displayLabel.setText("4");
		  isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"4");
		}
	}
	else if(e.getSource()==fiveButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("5");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"5");
		}
		
	}
	else if(e.getSource()==sixButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("6");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"6");
		}
	}
	else if(e.getSource()==oneButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("1");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"1");
		}
	}
	else if(e.getSource()==twoButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("2");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"2");
		}
	}
	else if(e.getSource()==threeButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("3");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"3");
		}
	}
	else if(e.getSource()==dotButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText(".");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+".");
		}
	}
	else if(e.getSource()==zeroButton)
	{
		if(isoperatorClicked)
		{
			displayLabel.setText("0");
			isoperatorClicked=false;
		}
		else
		{
		displayLabel.setText(displayLabel.getText()+"0");
		}
	}
	else if(e.getSource()==equalButton)
	{
		 String newvalue=displayLabel.getText();
		 String newValue=displayLabel.getText();
		 String newvalue1=displayLabel.getText();
		 String newvalue2=displayLabel.getText();
		 
		float oldValuef=Float.parseFloat(oldValue);
		float newValuef=Float.parseFloat(newValue);
		float result=oldValuef+newValuef;
		displayLabel.setText(result+" ");
		
		float oldvaluef=Float.parseFloat(oldvalue1);
		float newvaluef=Float.parseFloat(newvalue);
		float re1=oldvaluef-newvaluef;
		displayLabel.setText(re1+" ");

		float oldvalue1f=Float.parseFloat(oldvalue2);
		float newvalue1f=Float.parseFloat(newvalue1);
		float res=oldvalue1f*newvalue1f;
		displayLabel.setText(res+" ");
		
		float oldvalue2f=Float.parseFloat(oldvalue3);
		float newvalue2f=Float.parseFloat(newvalue2);
		float res1=oldvalue2f/newvalue2f;
		displayLabel.setText(res1+" ");
			
	}
	else if(e.getSource()==divButton)
	{
		     isoperatorClicked=true;
			oldvalue3=displayLabel.getText();
			displayLabel.setText(displayLabel.getText()+"/");
			displayLabel.setText("/");
			
			
	}
	else if(e.getSource()==mulButton)
	{
		    isoperatorClicked=true;
			oldvalue2=displayLabel.getText();
			displayLabel.setText(displayLabel.getText()+"*");
			displayLabel.setText("*");
					
	}
	else if(e.getSource()==minusButton)
	{
		    isoperatorClicked=true;
			oldvalue1=displayLabel.getText();
			displayLabel.setText(displayLabel.getText()+"-");
			displayLabel.setText("-");
			
	}
	else if(e.getSource()==plusButton)
	{
            isoperatorClicked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText(displayLabel.getText()+"+");
			displayLabel.setText("+");

	}
	else if(e.getSource()==clearButton)
	{
		displayLabel.setText(" ");
	}
	
	}
	
}

