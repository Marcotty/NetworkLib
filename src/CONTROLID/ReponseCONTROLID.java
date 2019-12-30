/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLID;

import java.io.Serializable;
import requetereponse.Reponse;

/**
 *
 * @author fredm
 */
public class ReponseCONTROLID implements Reponse, Serializable{
    
    public static final int ACK = 10;
    public static final int FAIL = 11;
    private int code;
    private String chargeUtile;
    private static final long serialVersionUID = 6529685098267757651L;
    public ReponseCONTROLID(int c, String charge)
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
        if(code == ACK)
            return "ACK";
        else if(code == FAIL)
            return "FAIL";
        return "";
    }
    public String getChargeUtile()
    {
        return chargeUtile;
    }
}
