package MainPanel;

import Button.button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainPage
{
    private static final int height = 800;
    private static final int width = 600;

    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;

    public MainPage()
    {
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane,height,width);
        mainStage = new Stage();
        mainStage.setScene(mainScene);

        mainStage.getIcons().add(new Image("E:\\AP\\Game Project.2\\src\\logo.png"));
        mainStage.setTitle("Pirates vs. Elfs");
    }

    public void createLogo() {
        ImageView logo = new ImageView("E:\\AP\\Game Project.2\\src\\logo.png");
        logo.setFitHeight(400);
        logo.setFitWidth(400);
        logo.setLayoutX(200);
        logo.setLayoutY(0);

        logo.setOnMouseEntered(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                logo.setEffect(new DropShadow());

            }
        });
        logo.setOnMouseExited(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                logo.setEffect(null);

            }
        });
        mainPane.getChildren().add(logo);

    }

    public void createBackground()
    {
        Image backgroundImage = new Image("E:\\AP\\Game Project.2\\src\\main.png", 800, 600, false, false);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,null);
        mainPane.setBackground(new Background(background));
    }

    public void createButton()
    {
        button startButton = new button("Start");
        startButton.setLayoutX(300);
        startButton.setLayoutY(425);
        mainPane.getChildren().add(startButton);

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game game = new Game();
                game.CreateNewGame(mainStage);
            }
        });

        button ExitButton = new button("Exit");
        ExitButton.setLayoutX(300);
        ExitButton.setLayoutY(500);
        mainPane.getChildren().add(ExitButton);

        ExitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mainStage.close();
            }
        });
    }

    public Stage getMainStage()
    {
        return mainStage;
    }
}
