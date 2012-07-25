package framework;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import launcher.Launcher;
import framework.Framework;
import framework.ui.FrameworkImplWindow;
import framework.ui.Window;

public class FrameworkImpl extends Framework
{
  public FrameworkImpl()
  {
  }

  public void firstLaunch()
  {
  }

  public String getName()
  {
    return "FrameworkImpl Test";
  }

  public String getVersion()
  {
    return "1.0";
  }

  public Window getWindow()
  {
    return FrameworkImplWindow.instance();
  }

  public boolean isFirstLaunch()
  {
    return false;
  }

  public void postLaunch()
  {
    FrameworkImplWindow.instance().setVisible(true);
  }

  public void preLaunch()
  {
  }

  public static void main(String[] args)
  {
    FrameworkImpl fi = new FrameworkImpl();
    Launcher.instance().setFramework(fi);
    Launcher.instance().run();
  }
}
