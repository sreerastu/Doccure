package com.Project.Hope.Exception;

public class InvalidPatientIdException extends Exception {


    public InvalidPatientIdException() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @param message
     */

    public InvalidPatientIdException(String message){
        super(message);
        // TODO Auto-generated constructor stub

    }
    /**
     * @param message
     * @param cause
     */
    public InvalidPatientIdException(String message,Throwable cause){
        super(message, cause);

        // TODO Auto-generated constructor stub

    }
    /**
     * @param cause
     *
     */

    public InvalidPatientIdException(Throwable cause){
        super(cause);

        // TODO Auto-generated constructor stub
    }
}
