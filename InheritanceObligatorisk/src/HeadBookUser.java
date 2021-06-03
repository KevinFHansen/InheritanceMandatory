import java.util.ArrayList;

public class HeadBookUser {

    private String email;
    private String password;
    private ArrayList<HeadBookUser> friends;

        public HeadBookUser(String email, String password){
            this.email = email;
            this.password = password;
            this.friends = new ArrayList<HeadBookUser>();
        }

        public void addTooFriendList (HeadBookUser user){
            this.friends.add(user);
        }

        public void displayAllFriends (){
            System.out.println(friends.toString());
        }

        @Override
        public String toString() {
            return "HeadBookUser{" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", friendList=" + friends +
                    '}';
        }
    }

