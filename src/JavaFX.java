import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class JavaFX extends Application {
    Slider slider = new Slider();
    Ellipse ellipse;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        StackPane stackPane = new StackPane();
        BorderPane borderPane = new BorderPane();
        stackPane.getChildren().addAll(borderPane);
        Scene scene = new Scene(stackPane, 200, 200);
        stage.setScene(scene);


        ellipse = new Ellipse(50, 50, 50, 50);
        ellipse.setFill(Color.BLUE);
        ellipse.setStroke(Color.DARKBLUE);
        stackPane.getChildren().add(ellipse);

        slider.setMin(0);
        slider.setMax(10);
        slider.setValue(2);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            System.out.println("Uus v‰‰rtus on: " + uusVaartus.intValue());
            System.out.println(uusVaartus.doubleValue());
            ellipse.setStrokeWidth(uusVaartus.doubleValue());
        });
        borderPane.setBottom(slider);
        stage.show();
    }
}
