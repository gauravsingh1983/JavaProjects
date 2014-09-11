package hacker;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Keyboard1 extends Applet
   implements KeyListener {

   int width, height;
   int x=400, y=400;
   String s = "";

   public void init() {
      //width = getSize().width;
      //height = getSize().height;
      setBackground( Color.black );

      //x = width/2;
      //y = height/2;

      
      //addKeyListener( this );
      this.setSize(x, y);
      TextArea area = new TextArea(100,200);
      area.setSize(x, y);
      area.setEditable(true);
      //area.setFont(new Font().)
      area.addKeyListener(this);
      this.add(area);

   }

   public void keyPressed( KeyEvent e ) { }
   public void keyReleased( KeyEvent e ) { }
   public void keyTyped( KeyEvent e ) {
      char c = e.getKeyChar();
      if ( c != KeyEvent.CHAR_UNDEFINED ) {
         s = s + c;
         repaint();
         e.consume();
      }
   }


}


