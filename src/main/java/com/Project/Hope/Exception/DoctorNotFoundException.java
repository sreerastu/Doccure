package com.Project.Hope.Exception;



public class DoctorNotFoundException extends Exception {
    public DoctorNotFoundException() {

        super();
    }
    /**
     * @param message
     */

    public DoctorNotFoundException(String message){
        super(message);
    }
    /**
     * @param message
     * @Param cause
     */

    public DoctorNotFoundException(String message,Throwable cause){
        super(message,cause);

    }
    /**
     * @param cause
     *
     */

    public DoctorNotFoundException(Throwable cause){
        super(cause);
    }
}
