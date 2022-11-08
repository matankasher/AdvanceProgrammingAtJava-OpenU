

import java.util.ArrayList;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MainSenceController {

    @FXML
    private Canvas ShapeBox;
    @FXML
    private Button drawbtn;

    public int getRandom() {
        Random random = new Random();
        return random.nextInt(200);
    }

    @FXML
    public void drawShape(ActionEvent event)
    {
        ArrayList <MyShape> list = new ArrayList <MyShape>();
        ArrayList <MyShape> clonelist = new ArrayList <MyShape>();
        GraphicsContext box = this.ShapeBox.getGraphicsContext2D();
        box.clearRect(0,0,400,400);
        list.add(new MyOval(getRandom(), getRandom(), getRandom(), getRandom(), Color.RED, true));
        list.add(new MyOval(getRandom(), getRandom(), getRandom(), getRandom(), Color.RED, true));
        list.add(new MyRectangle(getRandom(), getRandom(), getRandom(), getRandom(), Color.RED, true));
        list.add(new MyRectangle(getRandom(), getRandom(), getRandom(), getRandom(), Color.RED, true));
        list.add(new MyLine(getRandom(), getRandom(), getRandom(), getRandom(), Color.RED));
        list.add(new MyLine(getRandom(), getRandom(), getRandom(), getRandom(), Color.RED));
        for(int i = 0 ; i < 6 ; i++)
        {
            clonelist.add(list.get(i).clone());
            clonelist.get(i).setX1(clonelist.get(i).getX1() + 10);
            clonelist.get(i).setY1(clonelist.get(i).getY1() + 10);
            clonelist.get(i).setColor(Color.GREEN);
            clonelist.get(i).setFilled(false);
        }
        for(int i = 0 ; i < 6 ; i++)
            list.get(i).draw(box);
        for(int i = 0 ; i < 6 ; i++)
            clonelist.get(i).draw(box);
    }

}