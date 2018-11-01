package wk.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int id;
    private String phoneNumber;
    private String password;
    private String username;
    private String emailAddress;
    private Date registerTime;
    //用于url传参数和取参数时候的key
    public static String PHONENUMBER = "phoneNumber";
    public static String PASSWORD = "password";
    public static String USERNAME = "userName";

    public User(String phoneNumber,String password,String userName){
        this.phoneNumber =phoneNumber;
        this.password = password;
        this.username = userName;
        registerTime = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public static String getPHONENUMBER() {
        return PHONENUMBER;
    }

    public static void setPHONENUMBER(String PHONENUMBER) {
        User.PHONENUMBER = PHONENUMBER;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        User.PASSWORD = PASSWORD;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String USERNAME) {
        User.USERNAME = USERNAME;
    }
}
