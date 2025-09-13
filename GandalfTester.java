public class GandalfTester {
    public static void main(String [] args){

        Gandalf var1 = new Frodo();
        Gandalf var2 = new Bilbo();
        Gandalf var3 = new Gandalf();
        Bilbo var4 = new Bilbo();
        Bilbo var5 = new Frodo();
        Gollum var6 = new Gollum();

        var1.method1();          	
        var2.method1();           	
        var4.method1();          	
        var6.method1();          	
        var1.method2();          	
        var3.method2();          	
        var4.method2();          	
        var5.method2();          	
        var6.method2();          	

    }
}

