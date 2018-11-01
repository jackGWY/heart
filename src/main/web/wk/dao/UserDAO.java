package wk.dao;

import wk.entity.User;

import java.util.ArrayList;

public class UserDAO {
    public static void main(String[] args){
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.isLoginOk("123456","abc123456"));
    }
    public ArrayList<User> users;
    public UserDAO(){
        users = new ArrayList<User>();
        users.add(new User("123456","abc123456","codingma"));
        users.add(new User("654321","abcdef123","codemayq"));
    }
    public boolean isLoginOk(String phoneNumber,String password){
        for (User user : users){
            if(user.getPhoneNumber().equals(phoneNumber) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
