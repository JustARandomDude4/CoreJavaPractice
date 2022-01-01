import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener
{   
    // making them class objects
    private    JFrame frame;
    private    JPanel panel;
    private    JButton button,button1,button2,button3;
    private    JLabel label;
    private    int count=0;

    public Gui()      //constructor that runs when we run main
    { 
        //Create Jframe and Jpanel and other  objectsz
        frame=new JFrame();                 //Frame is the window                         
        panel=new JPanel();                 // the box


        ImageIcon but=new ImageIcon("principal_SVR.png");
        ImageIcon but1=new ImageIcon("NagaRatna.png");
        ImageIcon but2=new ImageIcon("1558.png");
        ImageIcon but3=new ImageIcon("hari.png");
        button=new JButton("Punch Principal Invisible",but);  
        button1=new JButton("Punch SnakeDiamond",but1);
        button2=new JButton("Punch IdiotLaUnnaventi",but2);
        button3=new JButton("Punch GodAlsoFeelJealous",but3);
       // button.setIconTextGap(0);

        button.setFocusable(false);button1.setFocusable(false);button2.setFocusable(false);button3.setFocusable(false);


        button.addActionListener((ActionListener) this);
        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);
        label=new JLabel();

        button.setFont(new Font("Comic Sans",Font.BOLD,25));   button1.setFont(new Font("Comic Sans",Font.BOLD,25));   button2.setFont(new Font("Comic Sans",Font.BOLD,25));   button3.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setForeground(Color.green);        button1.setForeground(Color.red);        button2.setForeground(Color.green);        button3.setForeground(Color.red);
        button.setBackground(Color.yellow);        button1.setBackground(Color.black);         button2.setBackground(Color.yellow);        button3.setBackground(Color.black);
        button.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.cyan));  button1.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.cyan));  button2.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.cyan));        button3.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.cyan));


        //setup panel
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));  //Setting border to the panel      
        panel.setLayout(new GridLayout(5,1));   
     // Setting layout to panel
        panel.add(button);         //adding a button to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(label);          // adding a label to panel
        panel.setBackground(Color.red);


        //add the panel to frame
        frame.add(panel,BorderLayout.CENTER);
        //and set a few things of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit out of application
        frame.setTitle("Jard's Vasavi Puncher");           
        frame.setSize(500,500);    //sets x and y dimension
        frame.setVisible(true);    //make frame visible
        frame.setLayout(new GridLayout());
        ImageIcon image =new ImageIcon("coolccat.jpg");  //create e icona image
        frame.setIconImage(image.getImage());           //change iccon of frame    // ccha
        frame.getContentPane().setBackground(Color.green);


        ImageIcon image1 =new ImageIcon("punch.jpg");  //create e icona image
        Border border=BorderFactory.createLineBorder(Color.green,5);
        label.setText("Number of punches: 0");
        label.setIcon(image1);
        label.setForeground(Color.black);
        label.setFont(new Font("MV Boli",Font.BOLD, 44));
        label.setIconTextGap(-80);
        label.setBackground(Color.orange);
        label.setOpaque(true);
        label.setBorder(border);
        //label.setBounds(200,200,250,250);  //instead of pack() 
        //  label.setHorizontalTextPosition(JLabel.CENTRE);
        //    label.setVerticalTextPosition(JLabel.TOP);

        frame.pack();    // Make sure u keep it at end after addign all components
    }
   public static void main(String args[])
    {
        new Gui();   //calling the constructor to construct everything
    }
@Override
public void actionPerformed(ActionEvent e)
 {
    count++;
    label.setText("Number of Punches :"+count);    
    
}
    
}
