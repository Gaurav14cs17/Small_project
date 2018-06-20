import java.awt.*;
import java.awt.event.*;

class MyGame implements ActionListener
{
static Frame f;
static Button target,tank;
static Label l;
MyGame()
{
f=new Frame();
target=new Button();
tank=new Button();
tank.addActionListener(this);
l=new Label("0");
f.setLayout(null);
target.setBounds(10,30,40,20);
tank.setBounds(180,380,40,20);
l.setBounds(10,380,40,20);
f.add(target);
f.add(tank);
f.add(l);
f.setVisible(true);
f.setSize(400,400);
TargetThread t=new TargetThread();
t.start();
TimerThread t1=new TimerThread();
t1.start();

}
public static void main(String ar[])
{
MyGame g=new MyGame();
}
public void actionPerformed(ActionEvent e)
{
BulletThread t1=new BulletThread();
t1.start();
}
}