public class AssignmentTester{
    public static void main(String [] args){
      Assignment as1 = new Assignment(4,"Hard",true);
      as1.printDetails();
      System.out.println("1---------------");
      
      as1.printDetails();
      System.out.println("2---------------");
       as1.makeOptional();
      System.out.println("3---------------");
      as1.printDetails();
      System.out.println("4---------------");
      Assignment as2 = new Assignment(12,"Moderate",true);
      
      as2.printDetails();
      System.out.println("5---------------");
       as2.makeOptional();
    }
  }
  
  