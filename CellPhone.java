public class CellPhone {
    public String model;
    public String [] contacts = new String [0];
    public String name;
    public int contactCount;
    public int count;

    public void storeContact(String newContact){
        if(count<3){
            contacts[contactCount] = newContact;
			contactCount++;
            System.out.println("A contact has been Stored");
        }
        else{
            System.out.println("Memory full, cannot add a new contact");
        }
    }

    public void printDetails() {
		System.out.println("Phone Model:"+ model);
		System.out.println("Contacts Stored:"+contactCount);
		System.out.println("Stored Contacts:");
		
		for(int i=0; i<contactCount; i++) {
			System.out.println(contacts[i]);
		}
  }

}
