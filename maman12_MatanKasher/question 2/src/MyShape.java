import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class MyShape 
{
  private int x1;
  private int x2;
  private int y1;
  private int y2;  
  private Color color;

  public MyShape(int x1, int x2, int y1, int y2, Color color)
  {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
    this.color = color;
  }
  public MyShape(MyShape o)
  {
    this.x1 = o.getX1();
    this.x2 = o.getX2();
    this.y1 = o.getY1();
    this.y2 = o.getY2();
    this.color = o.getColor();
  }
  protected abstract MyShape clone();
  public int getX1 ()
  {
    return x1;
  }
  public int getX2 ()
  {
    return x2;
  }
  public int getY1 ()
  {
    return y1;
  }
  public int getY2 ()
  {
    return y2;
  }
  public void setX1(int x1)
  {
    this.x1 = x1;
  }
  public void setX2(int x2)
  {
    this.x2 = x2;
  }
  public void setY1(int y1)
  {
    this.y1 = y1;
  }
  public void setY2(int y2)
  {
    this.y2 = y2;
  }
  public Color getColor()
  {
    return color;
  }
  public void setColor(Color color)
  {
    this.color = color;
  }
  public abstract boolean getFilled();
  public abstract void setFilled(boolean filled);
  public abstract void draw(GraphicsContext box);
}
