import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.*;
import java.lang.*;
import javax.swing.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
public class Main extends Application {
  // JavaFX-Investment-Calculator
//   A simple future investment amount calculator written in JavaFX.
//   That's all there is to say here.
double i;
double p;
double n;
VBox sm = new VBox(13);
  HBox s1 = new HBox(10);
  HBox s2 = new HBox(10);
  HBox s3 = new HBox(10);
  HBox s4 = new HBox(10);
  HBox smWrap = new HBox();
  VBox AllWrap = new VBox(13);
  TextField t1 = new TextField();
  TextField t2 = new TextField();
  TextField t3 = new TextField();
  TextField t4 = new TextField();
  Label l1 = new Label("Investment Amount: ");
  Label l2 = new Label("Number of Years: ");
  Label l3 = new Label("Annual Interest Rate: ");
  Label percent = new Label("%");
  Label l4 = new Label("Future Value: ");
public void start(Stage pStage) throws Exception{
   JOptionPane.showMessageDialog(null, "Dear Ms. Mei Liang, " + "\n" + "Thanks for all your support in this course!" + "\n" + "\n" + "Yours sincerely," + "\n" + "Sun Young");
  JOptionPane.showMessageDialog(null, "Also, I'm posting this on GitHub." + "\n" + "You can check it out at lis13kgv-github/JavaFX-Investment-Calculator" + "\n" + "also follow me at @lis13kgv-github \n XD");
  BorderPane rootNode = new BorderPane();
  s1.getChildren().addAll(l1, t1);
  s2.getChildren().addAll(l2, t2);
  s3.getChildren().addAll(l3, t3, percent);
  s4.getChildren().addAll(l4, t4);
  t4.setEditable(false);
  HBox calculate = new HBox(10);
  Button calc = new Button("Calculate");
  calc.setOnAction(new CalculateAmount());
  calculate.getChildren().add(calc);
  sm.getChildren().addAll(s1,s2,s3,s4);
  smWrap.getChildren().add(sm);
  AllWrap.getChildren().addAll(smWrap, calculate);
  AllWrap.setPadding(new Insets(60,20,60,60));
  rootNode.setCenter(AllWrap);
  Scene pScene = new Scene(rootNode, 450, 250);
  pStage.setScene(pScene);
  pStage.setTitle("Future Value Calculator");
  pStage.setResizable(false); 
  pStage.show();
}
public double calculateTotalCompoundInterest(double i, double n, double p) {
  double futureValue = p * Math.pow(1 + ((i / 12) / 100),(n * 12));
        return futureValue;
}  class CalculateAmount implements EventHandler<ActionEvent>{
    public void handle(ActionEvent e){
      p = Float.parseFloat(t1.getText());
      n = Float.parseFloat(t2.getText());
      i = Float.parseFloat(t3.getText());
      t4.setText("" + calculateTotalCompoundInterest(i, n, p));
    }
  }
}