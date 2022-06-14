/*
* File: MainModel.java
* Author: Szilágyi Nikolett Viola
* Copyright: 2022, Szilágyi Nikolett Viola
* Group: Szoft_I-N
* Date: 2022-06-14
* Github: https://github.com/nikolettszilagyii/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Position[] positionArray = {
            new Position(1, "Tisztasági Menedzser"),
            new Position(2, "Ügyvéd"),
            new Position(3, "Web-Designer"),
            new Position(4, "Farmer"),
            new Position(5, "Méhész"),
            new Position(6, "Szoftverfejlesztő"),
            new Position(7, "Elektrológus"),
            new Position(8, "Körmös"),
            new Position(9, "Hivatalnok"),
            new Position(10, "Rendezvényszervező"),
    };

    public Vector<Position> positionVector = new Vector<>(Arrays.asList(positionArray));
}
