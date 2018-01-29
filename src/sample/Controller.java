package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text question;
    @FXML
    private TextField userInput;
    @FXML
    private Text stageStatus;
    @FXML
    private Button restart;
    @FXML
    private Text hello;
    @FXML
    private Text feedbackName;
    @FXML
    private Text feedbackYear;
    @FXML
    private Text feedbackAge;
    @FXML
    private Text feedback5yrs;
    @FXML
    private Text feedback10yrs;
    @FXML
    private Button btnConfirm;
    @FXML
    private Button endApp;

    public String stringName;
    public String stringYear;
    public String stringAge;
    public int intYear;
    public int intYear5;
    public int intYear10;
    public int intAge;
    public int intAge5;
    public int intAge10;

    public void clickGreeting(ActionEvent actionEvent) {
        if (stageStatus.getText().equalsIgnoreCase("name")) {
            stringName = userInput.getText();
            userInput.clear();
            feedbackName.setText("Hello " + stringName + "! Nice to meet you!");
            hello.setVisible(false);
            stageStatus.setText("year");
            question.setText("What's the current year?");
        } else if (stageStatus.getText().equalsIgnoreCase("year")) {
            stringYear = userInput.getText();
            userInput.clear();
            feedbackName.setText("Thanks " + stringName + ",");
            feedbackYear.setText("The current year is " + stringYear);
            stageStatus.setText("age");
            question.setText("What's your age?");
        } else if (stageStatus.getText().equalsIgnoreCase("age")) {
            stringAge = userInput.getText();
            intYear = Integer.parseInt(stringYear);
            intAge = Integer.parseInt(stringAge);
            intYear5 = intYear + 5;
            intYear10 = intYear + 10;
            intAge5 = intAge + 5;
            intAge10 = intAge + 10;
            userInput.clear();
            feedbackName.setText(stringName + ", you are currently " + stringAge + " years old.");
            feedbackYear.setText("");
            feedbackAge.setText("");
            feedback5yrs.setText("In " + intYear5 + " you will be " + intAge5 + " years old.");
            feedback10yrs.setText("In " + intYear10 + " you will be " + intAge10 + " years old.");
            stageStatus.setText("end");
            question.setText("");
            userInput.setVisible(false);
            btnConfirm.setVisible(false);
            restart.setVisible(true);
        }
    }
    public void restart(ActionEvent actionEvent) {
        hello.setVisible(true);
        question.setText("What's your name?");
        stageStatus.setText("name");
        userInput.setVisible(true);
        btnConfirm.setVisible(true);
        restart.setVisible(false);
        feedbackName.setText("");
        feedbackYear.setText("");
        feedbackAge.setText("");
        feedback5yrs.setText("");
        feedback10yrs.setText("");
    }
    public void endApp(ActionEvent actionEvent) {
        Platform.exit();
    }
}



