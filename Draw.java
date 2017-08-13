import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Draw extends JPanel implements MouseListener,MouseMotionListener
{
 int xPressed,yPressed;
 int xReleased,yReleased;
 int xDragged,yDragged;
 public Draw()
 {
  setBounds(0, 0, 480, 500);
  addMouseListener(this);
  addMouseMotionListener(this);
 }
 public void paintComponent(Graphics g)
 {
  g.drawLine(xPressed,yPressed,xDragged,yDragged);
  xPressed=xDragged;
  yPressed=yDragged;
 }
 public void mouseDragged(MouseEvent arg0)
 {
  Graphics g = getGraphics();
  g.drawLine(xPressed, yPressed, arg0.getX(), arg0.getY());
  xDragged = arg0.getX();
  yDragged = arg0.getY();
  repaint();
 }
 public void mousePressed(MouseEvent arg0)
{
  xPressed = arg0.getX();
  yPressed = arg0.getY();
 }
 public void actionPerformed(ActionEvent e) 
 {}
 public void mouseMoved(MouseEvent arg0)
 {}
 public void mouseClicked(MouseEvent arg0)
 {}
 public void mouseEntered(MouseEvent arg0) 
 {}
 public void mouseExited(MouseEvent arg0) 
 {}
 public void mouseReleased(MouseEvent arg0) 
 {}
}
