package GUI;
import PROJECTS.Project;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


//图形界面
public class Ui {
    JFrame jf = new JFrame();

    public void showUI(){
        jf.setLayout(new BorderLayout());
        jf.setSize(1000,618);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setTitle("Code Visuable");

//        FlowLayout flow = new FlowLayout();
//        jf.setLayout(flow);


        JPanel panel1 = new JPanel(null);
        JLabel label03 = new JLabel();
        label03.setFont(new Font(null, Font.PLAIN, 25));
        label03.setText("show");
//        label03.setLocation(300,20);
        label03.setSize(200, 50);
        panel1.add(label03);

 //       jf.setContentPane(panel1);
        MyPanel mp=new MyPanel();


 //       jf.setContentPane(mp);
//        jf.add(mp);
        Graphics g =mp.getGraphics();
        mp.paint(g);
        jf.getContentPane().add("West", panel1);
        jf.getContentPane().add("Center", mp);
//        jf.pack();
        jf.setVisible(true);
//        String static void main(String[] args)throws Exception{
//
//        }
    }
    class MyPanel extends JPanel{
        Image image= null;
        public void paint(Graphics g){
            try {
                System.out.println("to write");
                image= ImageIO.read(new File("e.png" ));
                BufferedImage image2= ImageIO.read(new File("e.png" ));
                int a=image2.getWidth();
                int b=image2.getHeight();
                g.drawImage(image,   0  , 0 , a,b  ,null );
            }
            catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("no write");
            }
        }
    }
}



//public class Test extends JFrame{
//    MyPanel mp=null;
//    public Test(){
//        mp= new  MyPanel();
//        this.add(mp);
//        this.setSize(550,400);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
//    }
//    public static void main(String[] args){
//        new Test();
//    }
//}






