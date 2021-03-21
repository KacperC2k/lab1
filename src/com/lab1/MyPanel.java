package com.lab1;
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
    MyPanel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;

        //wypełnienie

        g2D.setStroke(new BasicStroke(4));
        Color darkGreen = new Color(43,143,69);
        Color lips = new Color(156,95,68);

        g2D.setPaint(darkGreen);
        int[] X ={61,75,99,124,149,189,235,271,283,320,360,390,395,433,444,453,456,444,431,418,403,426,431,441,431,420,420,391,340,241,156,84,65};
        int[] Y ={285,224,180,168,118,87,79,95,103,89,87,115,135,155,168,186,203,211,223,241,245,273,295,305,317,323,344,352,380,390,383,356,325};
        g2D.fillPolygon(X,Y,33);

        g2D.setPaint(Color.white);
        int[] X2 = {453,419,377,336,327,367,417,449};
        int[] Y2 = {187,174,172,188,206,220,216,208};
        g2D.fillPolygon(X2,Y2,8);
        int[] X3 = {327,329,287,255,213,198,233,277,304,304};
        int[] Y3 = {208,186,170,170,187,199,219,223,219,219};
        g2D.fillPolygon(X3,Y3,10);

        g2D.setPaint(lips);
        int[] X4 = {431,396,348,301,257,212,183,174,186,219,260,299,339,375,392,423,420,430,441};
        int[] Y4 = {297,308,314,310,303,295,301,320,330,335,342,349,349,351,352,342,324,317,304};
        g2D.fillPolygon(X4,Y4,19);




        g2D.setPaint(Color.black);   //rwrq

        //kontur


        g2D.drawLine(61,285,75,224);
        g2D.drawLine(75,224,99,180);
        g2D.drawLine(99,180,124,168);
        g2D.drawLine(124,168,149,118);
        g2D.drawLine(149,118,189,87);
        g2D.drawLine(189,87,235,79);
        g2D.drawLine(235,79,271,95);
        g2D.drawLine(271,95,283,103);
        g2D.drawLine(283,103,320,89);
        g2D.drawLine(320,89,360,87);
        g2D.drawLine(360,87,390,115);
        g2D.drawLine(390,115,395,135);
        g2D.drawLine(395,135,433,155);
        g2D.drawLine(433,155,444,168);
        g2D.drawLine(444,168,453,186);
        g2D.drawLine(453,186,456,203);
        g2D.drawLine(456,203,444,211);
        g2D.drawLine(444,211,431,223);
        g2D.drawLine(431,223,418,241);
        g2D.drawLine(418,241,403,245);
        g2D.drawLine(403,245,426,273);
        g2D.drawLine(426,273,431,295);
        g2D.drawLine(431,295,441,305);
        g2D.drawLine(441,305,431,317);
        g2D.drawLine(431,317,420,323);
        g2D.drawLine(420,323,420,344);
        g2D.drawLine(420,344,391,352);
        g2D.drawLine(391,352,340,380);
        g2D.drawLine(340,380,241,390);
        g2D.drawLine(241,390,156,383);
        g2D.drawLine(156,383,84,356);
        g2D.drawLine(84,356,65,325);
        g2D.drawLine(65,325,61,285);

        //oczy

        g2D.drawLine(453,187,419,174);
        g2D.drawLine(419,174,377,172);
        g2D.drawLine(377,172,336,188);
        g2D.drawLine(336,188,327,206);
        g2D.drawLine(327,206,367,220);
        g2D.drawLine(367,220,417,216);
        g2D.drawLine(417,216,449,208);
        g2D.drawLine(449,208,457,199);

        g2D.drawLine(327,208,329,186);
        g2D.drawLine(329,186,287,170);
        g2D.drawLine(287,170,255,170);
        g2D.drawLine(255,170,213,187);
        g2D.drawLine(213,187,198,199);
        g2D.drawLine(198,199,233,219);
        g2D.drawLine(233,219,277,223);
        g2D.drawLine(277,223,304,219);
        g2D.drawLine(304,219,304,219);
        g2D.drawLine(304,219,327,208);

        g2D.fillOval(369,171,50,50);
        g2D.fillOval(245,171,50,50);
        g2D.setPaint(Color.white);
        g2D.fillOval(252,180,10,10);
        g2D.fillOval(252,194,10,10);
        g2D.fillOval(267,189,10,10);
        g2D.fillOval(380,181,10,10);
        g2D.fillOval(381,195,10,10);
        g2D.fillOval(393,189,10,10);
        g2D.setPaint(Color.black);

        //usta

        g2D.drawLine(431,297,396,308);
        g2D.drawLine(396,308,348,314);
        g2D.drawLine(348,314,301,310);
        g2D.drawLine(301,310,257,303);
        g2D.drawLine(257,303,212,295);
        g2D.drawLine(212,295,183,301);
        g2D.drawLine(183,301,174,320);
        g2D.drawLine(174,320,186,330);
        g2D.drawLine(186,330,219,335);
        g2D.drawLine(219,335,260,342);
        g2D.drawLine(260,342,299,349);
        g2D.drawLine(299,349,339,349);
        g2D.drawLine(339,349,375,351);
        g2D.drawLine(375,351,391,351);

        g2D.drawLine(420,324,379,328);
        g2D.drawLine(392,326,248,319);
        g2D.drawLine(248,319,220,314);
        g2D.drawLine(220,314,199,315);

        //detale

        g2D.drawLine(157,332,163,346);
        g2D.drawLine(163,346,182,353);
        g2D.drawLine(250,256,275,251);
        g2D.drawLine(275,251,299,237);
        g2D.drawLine(357,248,368,257);
        g2D.drawLine(201,217,225,230);
        g2D.drawLine(225,230,256,235);
        g2D.drawLine(256,235,288,233);
        g2D.drawLine(288,233,314,229);
        g2D.drawLine(314,229,326,219);
        g2D.drawLine(326,219,326,210);
        g2D.drawLine(404,246,385,248);
        g2D.drawLine(385,248,357,247);
        g2D.drawLine(357,247,340,243);
        g2D.drawLine(282,105,291,120);
        g2D.drawLine(291,120,296,137);//
        g2D.drawLine(296,137,329,131);
        g2D.drawLine(329,131,367,131);
        g2D.drawLine(367,131,396,136);
        g2D.drawLine(296,137,269,127);
        g2D.drawLine(269,127,237,116);
        g2D.drawLine(237,116,213,121);
        g2D.drawLine(213,121,178,136);
        g2D.drawLine(296,137,304,151);
        g2D.drawLine(304,151,321,158);
        g2D.drawLine(321,158,325,165);
        g2D.drawLine(325,165,353,156);
        g2D.drawLine(353,156,392,152);
        g2D.drawLine(392,152,422,156);
        g2D.drawLine(422,156,433,160);
        g2D.drawLine(304,151,281,150);
        g2D.drawLine(281,150,245,151);
        g2D.drawLine(245,151,233,153);
        g2D.drawLine(233,153,216,168);
        g2D.drawLine(216,168,185,176);
        g2D.drawLine(123,168,120,184);
        g2D.drawLine(120,184,117,198);

























    }
}
