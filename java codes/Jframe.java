
package vish;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class abc implements ActionListener
{
     JFrame f;
  JPanel p,p1;
  JTextField t;
  JLabel l;
  JButton b;
  abc()
        {
            f=new JFrame("checker");
            t=new JTextField(20);
            p=new JPanel();
          
            f.add(p);
          
            l=new JLabel("enter the number ->");
           
            b=new JButton("check");
            p.add(b);
             p.add(l);
            p.add(t);
            f.setVisible(true);
            b.addActionListener(this);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int a;
        
        Object o=e.getSource();
        if(o==b)
        {
            a=Integer.parseInt(t.getText());
            if(a%2==0)
            {
                JOptionPane.showMessageDialog(null,"number is even");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"number is odd");
            }
        }
    }
    public static void main(String sa[])
    {
        new abc();
    }
}
    

