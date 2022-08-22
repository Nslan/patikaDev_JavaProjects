package InsuranceManagementSystem;

public class InvalidAuthenticationException extends Exception{

    private String message = "";

    public InvalidAuthenticationException(String message)
    {
        super(message);
    }

}
