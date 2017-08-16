import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Draw extends JPanel implements MouseListener,MouseMotionListener,ActionListener
{
 int xPressed,yPressed;
 int xReleased,yReleased;
 private JButton clear;
 int xDragged,yDragged;
 public Draw()
 {
  setBounds(0, 0, 480, 500);
  addMouseListener(this);
  clear=new JButton("CLEAR");
  add(clear);
  clear.setBounds(540, 5, 100, 25);
  clear.addActionListener(this);
  addMouseListener(this);
  addMouseMotionListener(this);
 }
 public void paintComponent(Graphics g)
 {
  g.drawLine(xPressed,yPressed,xDragged,yDragged);
  xPressed=xDragged;
  yPressed=yDragged;
 }
 public void actionPerformed(ActionEvent e) 
 {
   if(e.getSource()==clear)
   {
     setOpaque(false);
     repaint();
   }
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
