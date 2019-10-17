package eg.edu.alexu.csd.oop.calculator.cs12;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public MenuItem pressed;
    mycalc app=new mycalc();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private Button equal;
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnplus;
    @FXML
    private Button btnminus;
    @FXML
    private Button btndot;
    @FXML
    private Button btndel;
    @FXML
    private Button btnclear;
    @FXML
    private Button btnmultiply;
    @FXML
    private Button btnbar;
    @FXML
    private Button btnmodule;
    @FXML
    private TextField text;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Label resultcalc;
    @FXML
    private ComboBox compo;
    @FXML
    private MenuButton menulabels;
    @FXML
    private MenuItem lab;
    @FXML
    private MenuItem lab1;
    @FXML
    private MenuItem lab2;
    @FXML
    private MenuItem lab3;
    @FXML
    private MenuItem lab4;
    @FXML
    private MenuItem lab5;

    ArrayList<String> latest=new ArrayList<String>();
    int counter=0;
    int counts=0;
    int pcounter=0;
    int curs=0;
    @FXML
    private void btn0(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn0.getText());
    }
    @FXML
    private void btn1(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn1.getText());
    }
    @FXML
    private void btn2(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn2.getText());
    }
    @FXML
    private void btn3(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn3.getText());
    }
    @FXML
    private void btn4(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn4.getText());
    }
    @FXML
    private void btn5(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn5.getText());
    }
    @FXML
    private void btn6(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn6.getText());

    }
    @FXML
    private void btn7(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn7.getText());

    }
    @FXML
    private void btn8(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn8.getText());

    }
    @FXML
    private void btn9(ActionEvent event) {

        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btn9.getText());

    }
    @FXML
    private void btnplus(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btnplus.getText());

    }
    @FXML
    private void btnminus(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btnminus.getText());

    }
    @FXML
    private void btnmultiply(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btnmultiply.getText());
    }
    @FXML
    private void btnbar(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btnbar.getText());
    }
    @FXML
    private void btnmodule(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btnmodule.getText());

    }
    @FXML
    private void btndel(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        if(!text.getText().equals(""))
            text.setText(text.getText().substring(0,text.getText().length()-1));

    }
    @FXML
    private void btnclear(ActionEvent event) {
        text.clear();
    }
    @FXML
    private void btndot(ActionEvent event) {
        if(text.getText().equals("Cannot divide by zero") ||text.getText().equals("Not Valid")){
            text.clear();
        }
        text.appendText(btndot.getText());

    }
    @FXML
    private void equalsbtn(ActionEvent event) {
        if(!text.getText().equals("")) {
            app.input(text.getText());
            String result=app.getResult();
            resultcalc.setText(result);
            if(!((result.equals("Not Valid")) || (result.equals("Cannot divide by zero")))){
                pcounter++;
            }
            if(!((result.equals("Not Valid")) || (result.equals("Cannot divide by zero"))) && counter<=4) {
                menulabels.getItems().get(counter).setText(app.func.get(app.func.size() - 1) + "=" + resultcalc.getText());
                counter++;
                counts=counter-1;
                System.out.println(counter);
            }else if(!((result.equals("Not Valid")) || (result.equals("Cannot divide by zero"))) && counter>4 && counts>-1){
                for(int i=0;i<5;i++){
                    if(i+1<5)
                        menulabels.getItems().get(i).setText(menulabels.getItems().get(i+1).getText());
                }
                menulabels.getItems().get(4).setText(app.func.get(app.func.size() - 1) + "=" + resultcalc.getText());
                System.out.println(counts);
            }
            text.clear();
        }
    }
    int inner=app.func.size()-1;
    @FXML
    private void textfield(ActionEvent event){
        text.setOnKeyPressed(keyEvent -> {
            if(keyEvent.getCode()== KeyCode.ENTER /*|| keyEvent.getCode()==KeyCode.EQUALS*/){
                equalsbtn(event);
            }
        });
    }

    public void clcs(MouseEvent mouseEvent) {
        if(lab.getText() != null) {
            String n[]= lab.getText().split("=");
            text.setText(n[n.length-1]);
        }
    }
    public void clcs2(MouseEvent mouseEvent) {
        if(lab1.getText() != null) {
            String n[]= lab1.getText().split("=");
            text.setText(n[n.length-1]);
        }
    }
    public void clcs3(MouseEvent mouseEvent) {
        if(lab2.getText() != null) {
            String n[]= lab2.getText().split("=");
            text.setText(n[n.length-1]);
        }
    }
    public void clcs4(MouseEvent mouseEvent) {
        if(lab3.getText() != null) {
            String n[]= lab3.getText().split("=");
            text.setText(n[n.length-1]);
        }
    }
    public void clcs5(MouseEvent mouseEvent) {
        if(lab4.getText() != null) {
            String n[]= lab4.getText().split("=");
            text.setText(n[n.length-1]);
        }
    }
    public String labs(String labers){
        String strlenght = null;
        if(labers!= null) {
            String n[]= labers.split("=");
            strlenght= n[n.length-1];
        }
        return strlenght;
    }
    int curss;
    boolean previous2=false;
    public void prevfn(ActionEvent actionEvent) {
        previous2=true;
        String prevs=app.prev();
        if(pcounter>=6){
            pcounter=5;
        }
        if(prevs !=null && pcounter>0 ) {
            pcounter = pcounter - 1;
            text.setText(prevs);
            resultcalc.setText(labs(menulabels.getItems().get(pcounter).getText()));
            curss=pcounter+1;
        }else{
            text.clear();
            pcounter=-1;
            resultcalc.setText("Not Valid");
        }
    }

    public void nextfn(ActionEvent actionEvent) {
        String nexts=app.next();
        if(nexts !=null ) {
            if(previous2==true){
                pcounter=pcounter+1;
                previous2=false;
            }else{

            }
            text.setText(nexts);
            resultcalc.setText(labs(menulabels.getItems().get(pcounter).getText()));
            pcounter++;
            curss=pcounter;

        }else{
            text.clear();
            resultcalc.setText("Not Valid");
        }
    }
    Alert a = new Alert(Alert.AlertType.NONE);
    public void save(ActionEvent actionEvent) {
        app.save();
        EventHandler<ActionEvent> event1 = new
                EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e)
                    {
                        // set alert type
                        a.setAlertType(Alert.AlertType.ERROR);

                        // show the dialog
                        a.show();
                    }
                };
    }

    public void load(ActionEvent actionEvent)  {
        app.load();
        for(int i=0;i<app.func.size();i++)
            menulabels.getItems().get(i).setText(app.func.get(i)+"="+app.last_result.get(i));
        counter=app.func.size();
        pcounter=0;
        EventHandler<ActionEvent> event1 = new
                EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e)
                    {
                        // set alert type
                        a.setAlertType(Alert.AlertType.ERROR);

                        // show the dialog
                        a.show();
                    }
                };
    }
}
