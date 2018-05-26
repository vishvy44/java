package vbv;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.JTableHeader;
class abc implements ActionListener
{
    
     JFrame f;
     JButton b1,b2,b3,b4;
     JPanel p,p1,p2;
  JLabel l,l1,l2;
  JTextField t1,t2;
  GridLayout g;
     abc()
     {
       g=new GridLayout(3,2);
         f=new JFrame("home");
         b1=new JButton("add");
         b2=new JButton("subtract");
         b3=new JButton("multiply");
         b4=new JButton("divide");
         l=new JLabel("calculator");
         l1=new JLabel("first number");
         l2=new JLabel("second number");
        
         t1=new JTextField(20);
         t2=new JTextField(20);
         
         p=new JPanel();
         p1=new JPanel();
         p2=new JPanel();
     
         f.add(p,BorderLayout.NORTH);
         f.add(p1,BorderLayout.CENTER);
          f.add(p2,BorderLayout.SOUTH);
         p.add(l);
         p1.add(l1);
          p1.add(t1);
           p1.add(l2);
            p1.add(t2);
            
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            p2.add(b4);
            
            p1.setLayout(g);
         
         f.setVisible(true);
        //f.setSize(500, 300);
        f.pack();
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
     }
  @Override
    public void actionPerformed(ActionEvent e) {
        int a,b,c;
        Object o=e.getSource();
        if(o==b1)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
           c=a+b;
             
             JOptionPane.showMessageDialog(null,"Addition is--- '"+c+" '");
        }
        if(o==b2)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
           c=a-b;
             
             JOptionPane.showMessageDialog(null,"subtraction is--- '"+c+" '");
        }
        if(o==b3)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
           c=a*b;
             
             JOptionPane.showMessageDialog(null,"multiplication is---'"+c+" '");
        }
        if(o==b4)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
           c=a/b;
             
             JOptionPane.showMessageDialog(null,"divison is---'"+c+" '");
        }
    }
    public static void main(String[] args) {
  new abc();    
    }

    

   
   
    

    
}