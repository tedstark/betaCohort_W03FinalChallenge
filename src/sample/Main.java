package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /*For this application, you will be upgrading your assessment from week 1.
    This was the application where the user entered their name, age, and current year,
        then produced how old they would be next year, in five years, and in ten years.
    In this version of the application, you will create a JavaFX based user interface for the application.
    The application should load and greet the user with a "Hello" and a prompt
        with an entry field asking them their name.
    Additionally there should be a 'Confirm' button.
    Once the 'Confirm' button is clicked, the prompt should ask their age.
    Clicking the 'Confirm' button again should move to the next question, which asks the current year.
    Once they click the 'Confirm' button a final time, they should be able to see the information
        like in the first application and as mentioned above.
    There should be a button at the bottom of the application in the final view that resets the application.
    *****
        Weekend One Challenge:
        Write an application that when loads, asks "Hello! Please enter your name", allowing the user to enter their name. Once the user enters their name, ask the user their current age. Finally, ask them the current year.
        Once the user enters their information, the application should output their name, how old the user will be next year, in 5 years, and in 10 years, along with the associated years of those ages.
        An example of the final output of the application:
            Sam, you are currently 42 years old.
            In 2018, you will be 43 years old.
            In 2022, you will be 47 years old.
            In 2027, you will be 52 years old.*/

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
