import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyRectangle extends MyBoundedShape {

  public MyRectangle(int x1, int x2, int y1, int y2, Color color, boolean filled) {
    super(x1, x2, y1, y2, color, filled);
    
  }
  public MyRectangle(MyRectangle o )
  {
    super(o.getX1(),o.getX2(),o.getY1(),o.getY2(), o.getColor(), o.getFilled());
  }
  protected MyRectangle clone()
  {
    return new MyRectangle(this);
  }
  public boolean equals(MyBoundedShape o)
  {

      return (super.equals(o));
  }
  public void draw(GraphicsContext box)
  {
    box.setStroke(getColor());
    box.strokeRect(getX1() ,getY1() ,getX2() ,getY2());
    if(getFilled())
    {
      box.setFill(getColor());
      box.fillRect(getX1() ,getY1() ,getX2() ,getY2());;
    }
  }
}
