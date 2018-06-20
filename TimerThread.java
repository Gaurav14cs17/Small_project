class TimerThread extends Thread
{
public void run()
{
while(true)
{
try
{
Thread.sleep(1000);
int a=Integer.parseInt(MyGame.l.getText());
a++;
MyGame.l.setText(""+a);
}
catch(Exception e)
{
}
}
}
}