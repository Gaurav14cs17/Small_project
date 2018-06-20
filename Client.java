import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class Client implements ActionListener
{
Frame f;
List l;
TextField t;
Button b;
Socket s;
Client()
{
f=new Frame("Client");
t=new TextField();
b=new Button("Send");
l=new List();
f.add(t,BorderLayout.NORTH);
f.add(b,BorderLayout.SOUTH);
f.add(l);
b.addActionListener(this);
f.setSize(400,400);
f.setVisible(true);
try
{

s=new Socket("localhost",3002);
while(true)
{
ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
String str=ois.readObject().toString();
l.add("Friend:- "+str);
}
}
catch(Exception e)
{
}
}

public static void main(String ar[])
{
Client c=new Client();
}
public void actionPerformed(ActionEvent e)
{
try
{
ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
oos.writeObject(t.getText());
l.add("Me:-"+t.getText());
}
catch(Exception e1)
{
}
}


}