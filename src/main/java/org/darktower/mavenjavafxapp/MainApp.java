package org.darktower.mavenjavafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.darktower.mavenjavafxapp.controller.MainController;

public class MainApp extends Application {

    private Stage primaryStage;

    private void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // Загрузка вьюшки
        String fxmlFile = "/fxml/Hello.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream(fxmlFile));

        //Инициализируем Подмостки и Сцену
        setPrimaryStage(stage);

        // Даём контроллеру доступ к главному приложению.
        MainController controller = loader.getController();
        controller.setMainApp(this);

        // Вывод на экран
        stage.setTitle("JavaFX and Maven");
        stage.setScene(new Scene(root));
        stage.show();
    }

    //Загружаем сцену инициативы, вместо сцены входа в систему
    public void loadInitiativeView() throws Exception{
        String fxmlFile = "/fxml/InitiativeView.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream(fxmlFile));

        primaryStage.setTitle("Initiative Desktop");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
