/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLID;

import java.io.Serializable;
import requetereponse.Requete;

/**
 *
 * @author fredm
 */
public class RequeteCONTROLID implements Requete, Serializable{
    public static final int CHECK = 1;
    public static final int LOGIN = 2;
    public static final int PERMIS = 3;
    public static final int IDENTITE = 4;
    public static final int IDENTITE_INFOS = 5;
    private int code;
    private String chargeUtile;
    private static final long serialVersionUID = 6529685098267757650L;
    public RequeteCONTROLID(int c, String charge)
    {
        code = c;
        chargeUtile = charge;
    }
    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String CodeToString() {
        if(code == CHECK)
            return "CHECK";
        return "";
    }
    public String getChargeUtile()
    {
        return chargeUtile;
    }
}
