import java.awt.Graphics;
import java.applet.Applet;
public class MyFirstJavaApplet extends Applet
{
        public String s;
        public void init()
        {     
             s=new String("Hello World !");
        }
        public void paint(Graphics g)
        {   
             g.drawString(s,25,25);  
        }
}
————————————————
版权声明：本文为CSDN博主「陈晨chen」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/chengchencheng/article/details/96852863