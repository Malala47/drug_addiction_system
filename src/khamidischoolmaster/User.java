package khamidischoolmaster;
/**
 *
 * @author Malala
 */
class User {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }
   String username ;
   String password ;
   String email ;
   int usertype ;

    public User(String username, int usertype) {
        this.username = username;
        this.usertype = usertype;
    }
   

//    User(String string, String string0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
   
}
