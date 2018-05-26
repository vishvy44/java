package filehand;
import java.util.*;
import java.io.*;
class read
{
    public static void main(String []args) throws IOException
    {
        Scanner s=new Scanner(System.in);
        FileWriter f=new FileWriter("f:\\visha.doc");
        String str=s.nextLine();
        int a=s.nextInt();
        f.write(str);
        f.write(String.valueOf(a));
        
      
        
        f.close();
        FileReader fin=new FileReader("f:\\visha.doc");
        int x=fin.read();
        while(x>=0)
        {
            char c=(char)x;
            System.out.print(c);
            x=fin.read();
        }
        fin.close();
    }
    
}

