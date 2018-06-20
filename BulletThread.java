
import java.awt.*;
class BulletThread extends Thread
{
public void run()
{
try
{
Button b=new Button();
b.setBounds(190,360,20,20);
MyGame.f.add(b);
for(int i=360;i>=0;i-=20)
{
b.setBounds(190,i,20,20);
Thread.sleep(10);
}
}
catch(Exception e)
{
}
}
}
