/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MSI
 */
@WebService(serviceName = "facto")
public class facto {

    /**
     * This is a sample web service operation
     * @param n
     * @return 
     */
    @WebMethod(operationName =  "Facto")
    public int Facto(@WebParam(name = "n") int n) {
        if (n==0 || n==1){
            return 1 ;
        }else{
            return n * Facto(n-1);
        }
    }
}