public class BracuStudent {
    private String name;
    private String location;
    private boolean hasPass;

    public BracuStudent(String Name, String Location){
        this.name = Name;
        this.location = Location;
        this.hasPass = false;
    }

    public void collectPass(){
        this.hasPass = true;
    }

    // Removed duplicate method definition

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public String getName(){
        return name;
    }

    public void showDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Locatin: "+location);
        System.out.println("Has Pass"+ hasPass);
    }

    public boolean hasPass() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasPass'");
    }
}
