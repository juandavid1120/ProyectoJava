
package juegocarros;

import javax.swing.ImageIcon;

public class ImagenesResul {
 public ImageIcon iconImage;
public ImageIcon pngDadoR(int DadoR)
 {
     switch (DadoR) {
         case 1:
             iconImage=new ImageIcon("uno.jpg");
             break;
         case 2:
             iconImage=new ImageIcon("dos.jpg");
             break;
         case 3:
             iconImage=new ImageIcon("tres.jpg");
             break;
         case 4:
             iconImage=new ImageIcon("cuatro.png");
             break;
         case 5:
             iconImage=new ImageIcon("cinco.jpg");
             break;
         case 6:
             iconImage= new ImageIcon("seis.jpg");
             break;
         default:
             break;
     }
    
return iconImage;    
 }
 
 }

