package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String username;
    private String email_address;
    private Timestamp reg_date;

    private List<PlayableCharacter> characters = new ArrayList<>();

    public Player() {
    }

    public Player(String username, String email_address, Timestamp reg_date) {
        this.username = username;
        this.email_address = email_address;
        this.reg_date = reg_date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public Timestamp getReg_date() {
        return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", email_address='" + email_address + '\'' +
                ", reg_date=" + reg_date +
                ", characters=" + characters +
                '}';
    }
}
