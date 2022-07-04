package com.example.GameProject2;

import MainPanel.MainPage;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
        MainPage mainPage = new MainPage();
        stage = mainPage.getMainStage();

        mainPage.createButton();
        mainPage.createLogo();
        mainPage.createBackground();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}