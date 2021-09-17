import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyCollection;

    public AddressBook(){
        this.buddyCollection = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddyCollection.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyCollection.remove(buddy);    }

    public static void main(String[] args) {
        System.out.println("Address Book.");
    }

}
