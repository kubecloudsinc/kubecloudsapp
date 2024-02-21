package io.kubecloudsinc.kubecloudsapp.exception;

public class ApiException extends Exception{

    public ApiException() {
        super("API Exception please check input body");
    }
}
