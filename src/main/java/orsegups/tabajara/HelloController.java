package orsegups.tabajara;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        //welcomeText.setText("Acertô, Mizeravi!");
    }

    @FXML
    private Button addName;

    public void addNameAction(){
        String  newName = nameTextField.getText();
        if(! newName.isEmpty()){
            Person newPerson = new Person();
            obsList.add(new Person(null, newName));
            nameTextField.clear();
            System.out.println("Nome adicionado:  " + newName);

        }

        //System.out.printf("TESTANDO, PORRAAAAA");

    }

    @FXML
    private Button removeName;

    public void removeNameAction(){

        System.out.println("Teste2");
    }

    @FXML
    private Button randName;

    public void randNameAction(){

        if(! obsList.isEmpty()){
            Random rand = new Random();
            int randomIndex = rand.nextInt(obsList.size());
            Person randPerson = obsList.get(randomIndex);
            String randomName = randPerson.getName();
            welcomeText.setText("E o sortudo foi... "  +  randomName);

        }

        //welcomeText.setText("Acertô, Mizeravi!");

    }

    @FXML
    public TextField nameTextField;

    @FXML
    private TableColumn<Person , Integer> idColumn;

    @FXML
    private TableColumn<Person,String> nameColumn;

    @FXML
    private ComboBox<Person> comboBoxPerson;

    private ObservableList<Person> obsList;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        List<Person> list =new ArrayList<>();
        list.add(new Person(1,"Aline Eni Olsson"));
        list.add(new Person(2,"Edson Paulo Prudencio Junior"));
        list.add(new Person(3,"Leonardo Correa de Abreu "));
        list.add(new Person(4,"Michel Borba Mauricio "));
        list.add(new Person(5,"Rafael de Souza "));
        list.add(new Person(6,"Anthony de Matos "));
        list.add(new Person(7,"Bruno Camargo "));
        list.add(new Person(8,"Bruno Pereira"));
        list.add(new Person(9,"Daniel Graminho "));
        list.add(new Person(10,"Evandro Mittanck "));
        list.add(new Person(11,"Guilherme Schmitz "));
        list.add(new Person(12,"Ivan Schmitt "));
        list.add(new Person(13,"Lucas Gandolfi "));
        list.add(new Person(14,"Marcos Fernando "));
        list.add(new Person(15,"Juan Theiss "));
        list.add(new Person(16,"Thiago Cirino Nunes"));
        list.add(new Person(16," Vinicius Claudino "));
        list.add(new Person(17,"Pedro Henrique Marques "));
        list.add(new Person(18,"Henrique Backes "));
        list.add(new Person(19,"Cristian Souza Ceolin "));
        list.add(new Person(20,"João Lucas de Pinho "));
        list.add(new Person(21,"Gabriel Jacques "));
        list.add(new Person(22,"Kayllane De Souza Coelho "));
        list.add(new Person(23,"Guilherme Freitas Nogueira "));
        list.add(new Person(24,"João Marcello Platt "));
        list.add(new Person(25,"Rafael de Oliveira "));
        list.add(new Person(26,"Rodolfo Spagnhol "));
        list.add(new Person(27,"Caio Augusto Malavota "));
        list.add(new Person(28,"Victor Rangel Farias "));
        list.add(new Person(29,"Matheus Arno Voigt "));
        list.add(new Person(30,"João Vitor Vieira "));
        list.add(new Person(31,"Lidiane Dos Santos Rosa "));
        list.add(new Person(32,"Juan Carlos Marquez Manzano "));

        obsList = FXCollections.observableArrayList(list);
        comboBoxPerson.setItems(obsList);



    }
}