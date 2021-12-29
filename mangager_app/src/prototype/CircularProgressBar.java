package prototype;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class CircularProgressBar extends JPanel {
    float gpa;
    float value;
    public CircularProgressBar(float gpa){
        this.gpa = gpa;
        value = (gpa / 4) * 100;

    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.translate(getWidth()/2, getHeight()/2);
        g2.rotate(Math.toRadians(270));
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circle = new Ellipse2D.Float(0,0,110,110);
        arc.setFrameFromCenter(new Point(0,0), new Point(120, 120));
        circle.setFrameFromCenter(new Point(0,0), new Point(110, 110));
        arc.setAngleStart(1);
        arc.setAngleExtent(-value *  3.6);
        g2.setColor(Color.RED);
        g2.draw(arc);
        g2.fill(arc);
        g2.setColor(Color.WHITE);
        g2.draw(circle);
        g2.fill(circle);
        g2.setColor(Color.RED);
        g2.rotate(Math.toRadians(90));
        g.setFont(new Font(null, Font.BOLD, 40));
        FontMetrics fm = g2.getFontMetrics();
        Rectangle2D  r = fm.getStringBounds(gpa + "",g);
        int x = (0 - (int)r.getWidth())/2;
        int y = (0 - (int)r.getHeight())/2 + fm.getAscent();
        g2.drawString(gpa + "", x, y);
    }
}
