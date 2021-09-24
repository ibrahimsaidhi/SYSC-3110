public class BuddyInfo {

    private String name;
    private String address;
    private String number;

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public BuddyInfo(){}


    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getNumber(){
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Ibrahim", "123 LalaLand", "613-123-4567");
        System.out.println("Hello " + buddyInfo.getName() + "!");
    }
}
