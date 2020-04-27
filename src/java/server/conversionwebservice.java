/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author FORTAS OUSSAMA ILYES
 */
@WebService(serviceName = "conversionwebservice")
public class conversionwebservice {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "conversion")
    public Double conversion(@WebParam(name = "dinars") double dinars, @WebParam(name = "cours") double cours) {
        //TODO write your implementation code here:
        return dinars*cours;
    }
}
