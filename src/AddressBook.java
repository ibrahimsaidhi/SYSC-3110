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
        if (buddy != null){
            buddyCollection.add(buddy);
            // adds a buddy
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < buddyCollection.size()) {
            return buddyCollection.remove(index);
        }
        return null;
    }



    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Ibrahim", "123 Lala Land", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

}
