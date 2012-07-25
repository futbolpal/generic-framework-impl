package framework.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.WritableRaster;
import java.util.Random;

import javax.swing.JComponent;

public class FrameworkImplWindow extends Window
{
  private static FrameworkImplWindow this_;

  public FrameworkImplWindow()
  {
    super();
    this.setJMenuBar(new FrameworkImplWindowMenuBar());
    this.addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent arg0)
      {
        System.exit(0);
      }
    });
    
    
  }

  public static FrameworkImplWindow instance()
  {
    if(this_ == null)
    {
      this_ = new FrameworkImplWindow();
    }
    return this_;
  }
}
