package com.Project.Hope.Exception;

public class PatientNotFoundException extends Exception {
    public PatientNotFoundException() {

        super();
    }
    /**
     * @param message
     */

    public PatientNotFoundException(String message){
        super(message);
    }
    /**
     * @param message
     * @Param cause
     */

    public PatientNotFoundException(String message,Throwable cause){
        super(message,cause);

    }
    /**
     * @param cause
     *
     */

    public PatientNotFoundException(Throwable cause){
        super(cause);
    }
}

