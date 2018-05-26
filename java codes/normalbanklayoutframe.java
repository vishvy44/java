package file;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
class read implements ActionListener
{  int count=1,d;
    int ae=7;
    JButton b,b1,b2,b0,b3;
    JLabel l1,l2,l3,l4,l5,l6;
     JTextField t,t1,t2;
      
      String line,line1,name,accno,bal,c,name1,accno1,bal1;
     void read()
    {
      
      JFrame f=new JFrame("BANK MEMBERS DETAILS");
      JPanel p1=new JPanel(new GridLayout(5,1));
      JPanel p2=new JPanel(new GridLayout(5,1));
      JPanel p3=new JPanel();
      
   
    t =new JTextField(20);
      t1=new JTextField(20);
     t2=new JTextField(20);
      b0=new JButton("start");
     b=new JButton("Next");
     b1=new JButton("Recently Added");
     b2=new JButton("Add");
     b3=new JButton("Insert new");
     l1=new JLabel("NAME");
     l2=new JLabel("account no.");
     l3=new JLabel("balance");
     p1.add(l1);
     p1.add(l2);
     p1.add(l3);
     p2.add(t);
     p2.add(t1);
     p2.add(t2);
     p3.add(b0);
     p3.add(b);
     p3.add(b1);
     p3.add(b3);
     p3.add(b2);
     f.add(p1,BorderLayout.WEST);
     f.add(p2,BorderLayout.EAST);
     f.add(p3,BorderLayout.SOUTH);
     
     
     
     f.setSize(500,500);
     f.setVisible(true);
     b0.addActionListener(this);
     b.addActionListener(this);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
    }
    
 
    public static void main(String []args) throws IOException
    {   read ob=new read();
    
    ob.read();
        
       
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object o=e.getSource();
       
       if(o==b0)
       {   try {
           
            FileReader fr=new FileReader("F:\\atm.txt");
    BufferedReader br=new BufferedReader(fr);
   
   
       line=br.readLine();
        name=line.substring(0,13);
        accno=line.substring(13,28);
        bal=line.substring(28,line.length()-1);
           
           t.setText(name);
           t2.setText(bal);
           t1.setText(accno);
           br.close();
           } catch (IOException ex) {
               Logger.getLogger(read.class.getName()).log(Level.SEVERE, null, ex);
           }
           
          
       }
       if(o==b)
       { count++;
        if(count>ae)
        {
            count=0;
        }
       if(count<ae){
           try { 
                FileReader fr=new FileReader("F:\\atm.txt");
    BufferedReader br=new BufferedReader(fr);
   
   
    for(int i=1;i<=count;i++)
   {
       line=br.readLine();
        name1=line.substring(0,13);
        accno1=line.substring(13,22);
        bal1=line.substring(22,line.length()-1);
   }
               
               t.setText(name1);
               t2.setText(bal1);
               t1.setText(accno1);
               br.close();
           }catch (IOException ex) {
               Logger.getLogger(read.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
    }
       if(o==b3)
       {
           t.setText(null);
           t1.setText(null);
           t2.setText(null);
           
       }
        if(o==b1)
       {   try {
           
            FileReader fr=new FileReader("F:\\atm.txt");
    BufferedReader br=new BufferedReader(fr);
   
   while((line=br.readLine())!=null){
       
        name=line.substring(0,13);
        accno=line.substring(13,20);
        bal=line.substring(23,line.length()-1);
           
           t.setText(name);
           t2.setText(bal);
           t1.setText(accno);
           }br.close();
           } catch (IOException ex) {
               Logger.getLogger(read.class.getName()).log(Level.SEVERE, null, ex);
           }
           
          
       }
        if(o==b2)
        { ae++;
            BufferedWriter Writer=null;
           try {
               File fr=new File("F:\\atm.txt");
              // File tempfile=new File("F:\\abc.txt");
               //BufferedReader br=new BufferedReader(new FileReader(fr));
               Writer = new BufferedWriter(new FileWriter(fr,true));
                              String str=t.getText();
               String a=t1.getText();
               String z=t2.getText();
               Writer.newLine();
               Writer.write(str);
               Writer.write(a);
               Writer.write(z);
                System.out.println("done");
               Writer.close();
               t.setText(null);
               t1.setText(null);
               t2.setText(null);
           } catch (IOException ex) {
               Logger.getLogger(read.class.getName()).log(Level.SEVERE, null, ex);
           } finally {
               try {
                   Writer.close();
               } catch (IOException ex) {
                   Logger.getLogger(read.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
            
            
        }
    }
}  

       
