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
��������������������������������
��Ȩ����������ΪCSDN�������³�chen����ԭ�����£���ѭCC 4.0 BY-SA��ȨЭ�飬ת���븽��ԭ�ĳ������Ӽ���������
ԭ�����ӣ�https://blog.csdn.net/chengchencheng/article/details/96852863