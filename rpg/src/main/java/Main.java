import database.DbEngine;

public class Main {

    /**
     * player
     *  	username VARCHAR(50), -- szöveg nem lehet AUTO_INCREMENT!!!!!!!!!!!!!
     * 	    email_address VARCHAR(100) UNIQUE,
     * 	    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     * 	    PRIMARY KEY (username)
     *
     * playable character
     *      character_id INT UNSIGNED AUTO_INCREMENT,
     *      character_name VARCHAR(50),
     * 	    character_class ENUM(
     * 		    'mage',		-- 1
     *         'warrior',	-- 2
     *         'rogue',	-- 3
     *         'priest',	-- 4
     *         'shaman'	-- 5
     *     ),
     * 	    character_race ENUM(
     * 		'human',
     *         'orc',
     *         'elf',
     *         'undead',
     *         'halfling'
     *     ),
     * 	character_img BLOB,
     * 	character_skill1 VARCHAR(50),
     * 	character_skill2 VARCHAR(50),
     * 	character_skill3 VARCHAR(50),
     *     PRIMARY KEY (character_id)
     *
     *
     * game session
     *  	id INT AUTO_INCREMENT,
     * 	    game_end_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     * 	    PRIMARY KEY (id)
     * @param args
     */
    public static void main(String[] args) {
        DbEngine dbEngine = new DbEngine();

        System.out.println(dbEngine.isConnected());
    }
}
