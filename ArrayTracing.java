class ArrayTracing{
    public static void main(String args[]) {
        int [] myArray = new int[5];
        int [] b;
        int idx1 = 0, idx2 = 0;
        b =  myArray;
        while (idx1 < 5){
            myArray[idx1] = idx1 + 11;
            idx2 = 1;
            while (idx2 < idx1 ){
                myArray[idx1] = b[idx2 - 1] + myArray[idx2] - idx1;
                idx2 = idx2 + 1;
            }
            System.out.println(myArray[idx2]);
            idx1 = idx1 + 1;
        }
    }
}

