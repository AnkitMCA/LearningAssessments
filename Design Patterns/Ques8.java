/*
*
* Ques.8 Implement proxy design for accessing Record of a student and allow the access only to Admin.
 *
* */
interface Accessable {
    void access();
}

class User {
    private String userType;

    public User(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

class StudentRecords implements Accessable {
    protected User user;

    public StudentRecords(User user) {
        this.user = user;
    }

    @Override
    public void access() {
        System.out.println("Record Access");
    }
}

class StudentRecordsProxy extends StudentRecords {

    public StudentRecordsProxy(User user) {
        super(user);
    }

    @Override
    public void access(){
        if (user.getUserType()=="Admin") {
            System.out.println("You can access the student records .");
            super.access();
        }
        else System.out.println("You have not authorised to access records.");
    }
}

public class Ques8 {

    public static void main(String args[]) {
        User admin=new User("Admin");
        Accessable access=new StudentRecordsProxy(admin);
        access.access();

        User user=new User("User");
        Accessable access1=new StudentRecordsProxy(user);
        access1.access();
    }
}
