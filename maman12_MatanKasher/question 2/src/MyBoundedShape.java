import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class MyBoundedShape  extends MyShape{

  private boolean filled;
  public MyBoundedShape(int x1, int x2, int y1, int y2, Color color , Boolean filled) {
    super(x1, x2, y1, y2, color);
    this.filled = filled;
  }
  public MyBoundedShape(MyBoundedShape o )
  {
    super(o.getX1(),o.getX2(),o.getY1(),o.getY2(), o.getColor());
    filled = o.getFilled();
  }
  public boolean getFilled()
  {
    return filled;
  }
  public void setFilled(boolean filled)
  {
    this.filled = filled;
  }
  public abstract void draw(GraphicsContext box);
}
