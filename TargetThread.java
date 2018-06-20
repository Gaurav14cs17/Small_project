class TargetThread extends Thread
{
public void run()
{
while(true)
{
int x=MyGame.target.getX();
x+=10;
if(x==400)
x=10;
MyGame.target.setBounds(x,30,40,20);
try
{
Thread.sleep(200);
}
catch(Exception e)
{
}
}
}
}