package MainPanel;


import Heros.Elfs.NormalElf;
import Heros.Elfs.StrongElf;
import Heros.Elfs.WeakElf;
import Heros.Hero;
import Heros.Pirates.StrongPirate;
import Heros.Pirates.NormalPirate;
import Heros.Pirates.WeakPirate;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game
{
    static AnchorPane gamePane;
    Scene gameScene;
    Stage gameStage;

    private static final int GAME_WIDTH = 800;
    private static final int GAME_HEIGHT = 600;

    private Stage menuStage;

    private ImageView pirate1_Pic;
    private ImageView pirate2_Pic;
    private ImageView pirate3_Pic;

    private AnimationTimer gameTimer;

    Game()
    {
        gamePane = new AnchorPane();
        gameScene = new Scene(gamePane, GAME_WIDTH, GAME_HEIGHT, Color.BEIGE);
        gameStage = new Stage();
        gameStage.setScene(gameScene);

        gameStage.getIcons().add(new Image("E:\\AP\\Game Project.2\\src\\logo.png"));
        gameStage.setTitle("Pirates vs. Elfs");

        createBackground();
    }

    public void CreatePirate1()
    {
        StrongPirate pirate1 = new StrongPirate();
        pirate1_Pic = new ImageView(pirate1);
        pirate1_Pic.setLayoutX(5);
        pirate1_Pic.setLayoutY(5);
        pirate1_Pic.setFitWidth(150);
        pirate1_Pic.setFitHeight(100);
        gamePane.getChildren().add(pirate1_Pic);

        pirate1_Pic.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                pirate1_Pic.setEffect(new DropShadow());
                ImageView pirate1_Pic2 = new ImageView(pirate1);
                pirate1_Pic2.setLayoutX(5);
                pirate1_Pic2.setLayoutY(5);
                pirate1_Pic2.setFitWidth(150);
                pirate1_Pic2.setFitHeight(100);
                gamePane.getChildren().add(pirate1_Pic2);
                DraggableMaker.MakeDraggable(pirate1_Pic2);
            }
        });


    }

    public void CreatePirate2()
    {
        NormalPirate pirate2 = new NormalPirate();
        pirate2_Pic = new ImageView(pirate2);
        pirate2_Pic.setLayoutX(100);
        pirate2_Pic.setLayoutY(5);
        pirate2_Pic.setFitWidth(150);
        pirate2_Pic.setFitHeight(100);
        gamePane.getChildren().add(pirate2_Pic);

        pirate2_Pic.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                pirate2_Pic.setEffect(new DropShadow());
                ImageView pirate2_Pic2 = new ImageView(pirate2);
                pirate2_Pic2.setLayoutX(100);
                pirate2_Pic2.setLayoutY(5);
                pirate2_Pic2.setFitWidth(150);
                pirate2_Pic2.setFitHeight(100);
                gamePane.getChildren().add(pirate2_Pic2);
                DraggableMaker.MakeDraggable(pirate2_Pic2);
            }
        });

    }

    public void CreatePirate3()
    {
        WeakPirate pirate3 = new WeakPirate();
        pirate3_Pic = new ImageView(pirate3);
        pirate3_Pic.setLayoutX(200);
        pirate3_Pic.setLayoutY(5);
        pirate3_Pic.setFitWidth(150);
        pirate3_Pic.setFitHeight(100);
        gamePane.getChildren().add(pirate3_Pic);

        pirate3_Pic.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                pirate3_Pic.setEffect(new DropShadow());
                ImageView pirate3_Pic2 = new ImageView(pirate3);
                pirate3_Pic2.setLayoutX(200);
                pirate3_Pic2.setLayoutY(5);
                pirate3_Pic2.setFitWidth(150);
                pirate3_Pic2.setFitHeight(100);
                gamePane.getChildren().add(pirate3_Pic2);
                DraggableMaker.MakeDraggable(pirate3_Pic2);
            }
        });
    }

    public void CreateNewGame(Stage menuStage)
    {
        this.menuStage = menuStage;
        this.menuStage.hide();
        CreatePirate1();
        CreatePirate2();
        CreatePirate3();


        int random = RandomNumber.RandomNum();
        Hero elf;
        if (random == 1)
            elf = new Hero(CreateElfs.CreateElf1().getUrl());
        else if (random == 2)
            elf = new Hero(CreateElfs.CreateElf2().getUrl());
        else if (random == 3)
            elf = new Hero(CreateElfs.CreateElf3().getUrl());

        gameStage.setTitle("Pirates vs. Elfs");
        gameStage.show();
    }

    public void createBackground()
    {
        Image backgroundImage = new Image("E:\\AP\\Game Project.2\\src\\PlayGround.png", 800, 400, false, false);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,null);
        gamePane.setBackground(new Background(background));
    }
}
