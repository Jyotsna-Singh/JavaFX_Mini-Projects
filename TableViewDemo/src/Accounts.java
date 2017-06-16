
import javafx.beans.property.SimpleStringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Accounts {
    public SimpleStringProperty UserName = new SimpleStringProperty("");
    public SimpleStringProperty Password = new SimpleStringProperty("");
    public SimpleStringProperty Type = new SimpleStringProperty("");
    public Accounts(String UserName, String Password, String Type){
        this.UserName.set(UserName);
        this.Password.set(Password);
        this.Type.set(Type);
    }
}
