import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyCollection;

    public AddressBook(){
        this.buddyCollection = new ArrayList<BuddyInfo>();
    }

    public ArrayList<BuddyInfo> getBuddyCollection() {
        return buddyCollection;
    }

    public void setBuddyCollection(ArrayList<BuddyInfo> buddyCollection) {
        this.buddyCollection = buddyCollection;
    }

    public void addBuddy(BuddyInfo buddy){
        buddyCollection.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyCollection.remove(buddy);
    }



    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Ibrahim", "123 Lala Land", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println(addressBook.getBuddyCollection());
        System.out.println("Address Book.");
    }

}
