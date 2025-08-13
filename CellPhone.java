public class CellPhone {
public String [] contacts;
public int contactCount;
public String model;

public CellPhone(){
   this.model = "Unknown";
   this.contactCount = 0;
   this.contacts = new String [3];
}

public void storeContact(String contact){
    if(contactCount < 3){
        contacts[contactCount] = contact;
        contactCount++;
    }
    else{
        System.out.println("Memory is full and  cannot add more of the contyacts");
    }
}

public void printDetails(){
    System.out.println("Phone Model: "+ model);
    System.out.println("Contact Count: "+ contactCount);
    System.out.println("The contacts are: ");
    if(contactCount > 0){
        for(int i = 0; i<contactCount; i++){
           System.out.println(contacts[i]);
        }
    }
}
}