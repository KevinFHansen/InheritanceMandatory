public class Test {

    public static void main(String[] args) {

        HeadBookUser user1 = new HeadBookUser("werwerwer@whanbytsup.ok", "lukdigop");
        HeadBookUser user2 = new HeadBookUser("werwer@whatsuvccbbpb.ok", "ee");

        user1.addTooFriendList(user2);
        user1.displayAllFriends();
    }
}
