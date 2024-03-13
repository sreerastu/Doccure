package com.Project.Hope.Exception;

public class InvalidDoctorIdException extends Exception {
    public InvalidDoctorIdException() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @param message
     */

    public InvalidDoctorIdException(String message){
        super(message);
        // TODO Auto-generated constructor stub

    }
    /**
     * @param message
     * @param cause
     */
    public InvalidDoctorIdException(String message,Throwable cause){
        super(message, cause);

        // TODO Auto-generated constructor stub

    }
    /**
     * @param cause
     *
     */

    public InvalidDoctorIdException(Throwable cause){
        super(cause);

        // TODO Auto-generated constructor stub
    }
}
