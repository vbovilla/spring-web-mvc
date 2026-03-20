package in.weprolance.model;

import lombok.Data;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String confirmPassword;
}
