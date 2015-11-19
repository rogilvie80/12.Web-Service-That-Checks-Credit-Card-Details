/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tma03q3d;

import java.util.regex.Pattern;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author rosco_000
 */
@WebService()
public class CardChecker {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cardChecker")
    public Boolean cardChecker(@WebParam(name = "cardNumber")
    String cardNumber) {
        //TODO write your implementation code here:
        int number = 0;
        for(int i = 0; i < cardNumber.length() - 1; i++)
        {
            System.out.println(i);
            number = number + Integer.parseInt("" + cardNumber.charAt(i));
            System.out.println(number);
        }
        String totalNumber = Integer.toString(number);
        System.out.println(cardNumber + " / " + totalNumber);
        if(totalNumber.charAt(totalNumber.length() - 1) == cardNumber.charAt(cardNumber.length() - 1))
        {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validName")
    public Boolean validName(@WebParam(name = "name")
    String name) {
        //TODO write your implementation code here:
        if(Pattern.matches("[a-zA-Z]+", name) && name.length() > 1)
        {
            return true;
        }
        return false;
    }

}
