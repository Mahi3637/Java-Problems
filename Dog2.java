class Dog2 extends Animal2 {
    public String name;

    public Dog2() {
        
    }

    public String getName() {
        return name;
    }

    public void updateSound(String newSound) {
        sound = newSound; 
    }

    @Override
    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Legs: " + legs); 
        System.out.println("Sound: " + sound);
    }
}