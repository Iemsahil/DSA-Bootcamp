package com.sahil;
//     ***********IMPORTANT POINT*************
// anything that is initialised outside the block can be used inside the block
// BUT
// anything that is initialised inside the block can not be used outside the block
// AND
// Anything that is initialised outside the block cannot be initialised again inside the block
// anything that is initialised inside the block can definitely be initialised again outside the block

public class Scope {
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    String name = "Sahil";

        {
//            int a = 785; // already initialised outside the block in the same method, hence you cannot initiaised again
            a = 100; // reassign the origin ref variable to some other vale
            System.out.println(a);
            int c = 99;
            name = "No nAme";
            System.out.println(name);
            // values initialised in this block, will remain in block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block
//        System.out.println(marks);

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }
//        System.out.println(num); // cannot use 'num' outside because it is initialised inside the block

    }

    static void random (int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
