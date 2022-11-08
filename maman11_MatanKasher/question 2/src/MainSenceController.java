import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.canvas.GraphicsContext;
import java.util.Random;

public class MainSenceController {
     @FXML
     private Canvas Lifebox;
     @FXML
     private Button newGame;
     @FXML
     private Button nextStep;
     private Random r = new Random();
     private Boolean[][] Lifematrix;
    @FXML
     void newClick(MouseEvent event)
      {
        nextStep.setVisible(true);
        Install();
      }
    private void  showMatrix()
    {
      double h = this.Lifebox.getWidth() / 10 , v = this.Lifebox.getHeight() / 10;
      double boxHeight = this.Lifebox.getHeight() , boxWidth =  this.Lifebox.getWidth();
      GraphicsContext box = this.Lifebox.getGraphicsContext2D();
      box.clearRect(0, 0,boxWidth, boxHeight);
      for(int i = 0; i <= 10; i++) {
        for(int j = 0; j <= 10; j++) {
            box.strokeLine(i * h, 0, i * h, boxHeight);
            box.strokeLine(0, j * v, boxWidth, j * v);
        }
      }
        for(int i = 0; i < 10; i++) {
          for(int j = 0; j < 10; j++) {
            if(Lifematrix[i][j])
            box.fillRect((j*h)+5, (i*v)+5, h-10, v-10);
          }
        
    }
    }
  
    private void Install() {
      Lifematrix = new Boolean [10][10];
      for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
        if(r.nextInt(2) == 1)
        this.Lifematrix[i][j] = true;
        else
        this.Lifematrix[i][j] = false;
      }
    }
      showMatrix();
      
  } 
  private int neighborsR(int i,int j) // recursion for neighbors check
    {
      if(i > - 1 && i < 10 && j > -1 && j < 10)   // check if the neightborrs in the matrix limit
      {
        if(Lifematrix[i][j])
         return 1;
        return 0;
      }
      return 0;
    }
    private  int neighbors(int i,int j)
    {
      return neighborsR(i-1, j-1) + neighborsR(i, j-1)   + neighborsR(i-1, j) + neighborsR(i-1, j+1) +
             neighborsR(i+1, j-1) + neighborsR(i+1, j+1) + neighborsR(i+1, j) + neighborsR(i, j+1);
            
    }
    @FXML
    private  void nextClick(ActionEvent event) 
    {
      Boolean [][] newMatrix = new Boolean [10][10];
      for(int i = 0; i < 10; i++)
       {
        for(int j = 0; j < 10; j++)
         {
          if(!Lifematrix[i][j])  // havn't life
          {
            if(neighbors(i,j) == 3)
            newMatrix[i][j] = true;
            else
            newMatrix[i][j] = false;
          }
          else // Have life
          {
            if(neighbors(i,j) < 2 || (neighbors(i,j) > 3))
            newMatrix[i][j] = false;
            else
             newMatrix[i][j] = true;
          }

          

         }
       }
       Lifematrix = newMatrix;
       showMatrix();
}
}
