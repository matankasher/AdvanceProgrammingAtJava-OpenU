import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine extends MyShape {

  public MyLine(int x1, int x2, int y1, int y2, Color color) {
    super(x1, x2, y1, y2, color);
    
  }
  public MyLine(MyLine o )
  {
    super(o.getX1(),o.getX2(),o.getY1(),o.getY2(), o.getColor());
  }
  protected MyLine clone()
  {
    return new MyLine(this);
  }
  public boolean equals(MyLine o)
    {
        double a = Math.sqrt(Math.pow(getX1() - getX2(),2) + Math.pow(getY1() - getY2(),2));
        double b = Math.sqrt(Math.pow(o.getX1() - o.getX2(),2) + Math.pow(o.getY1() - o.getY2(),2));
        return (a == b);
    }
  public void draw(GraphicsContext box)
  {
    box.setStroke(getColor());
    box.strokeLine(getX1() ,getY1() ,getX2() ,getY2());
  }
  @Override
  public boolean getFilled() {
    // TODO Auto-generated method stub
    return false;
  }
  @Override
  public void setFilled(boolean filled) {
    // TODO Auto-generated method stub
  }
  
}
