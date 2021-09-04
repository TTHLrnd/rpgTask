package model;

public class PlayerCharacter {

    private long id;
    private String player_name;
    private long character_id;


    public PlayerCharacter() {
    }

    public PlayerCharacter(long id, String player_name, long character_id) {
        this.id = id;
        this.player_name = player_name;
        this.character_id = character_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public long getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(long character_id) {
        this.character_id = character_id;
    }
}
