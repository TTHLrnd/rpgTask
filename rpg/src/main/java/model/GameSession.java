package model;

import java.sql.Timestamp;

public class GameSession {
    private long id;
    private Timestamp gameEndDate;

    public GameSession() {
    }

    public GameSession(long id, Timestamp gameEndDate) {
        this.id = id;
        this.gameEndDate = gameEndDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getGameEndDate() {
        return gameEndDate;
    }

    public void setGameEndDate(Timestamp gameEndDate) {
        this.gameEndDate = gameEndDate;
    }
}
