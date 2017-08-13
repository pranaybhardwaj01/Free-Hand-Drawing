
import java.awt.*;
import javax.swing.*;
public class Frame1 extends JFrame
 {
  Draw da;
  public Frame1()
  {
   da=new Draw();
   da.setLayout(new BorderLayout());
   add(da);
  }
 }