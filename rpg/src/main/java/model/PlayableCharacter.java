package model;

public class PlayableCharacter {

    private long id;
    private String name;
    private CharacterClass characterClass;
    private CharacterRace characterRace;
    private byte[] img;
    private String skill1;
    private String skill2;
    private String skill3;

    public PlayableCharacter() {
    }

    public PlayableCharacter(long id, String name, CharacterClass characterClass, CharacterRace characterRace) {
        this.id = id;
        this.name = name;
        this.characterClass = characterClass;
        this.characterRace = characterRace;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public CharacterRace getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(CharacterRace characterRace) {
        this.characterRace = characterRace;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }
}
