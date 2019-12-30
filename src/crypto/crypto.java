/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author fredm
 */
public class crypto {
    
    public crypto(int alea)
    {

    }
    public static SecretKey getNewCleSecrete()
    {
        try {
            KeyGenerator gen = KeyGenerator.getInstance("DES", "BC");
            gen.init(new SecureRandom());
            
            SecretKey cle = gen.generateKey();
            System.out.println("Cle generee : " + cle.getEncoded() + " long : " + cle.getEncoded().length);
            
            return cle;
        } catch (NoSuchAlgorithmException | NoSuchProviderException ex) {
            Logger.getLogger(crypto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
