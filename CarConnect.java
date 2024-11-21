import java.util.ArrayList;

public class CarConnect {
    public static void main(String[] args) 
    {
        Emp e1=new Emp();
        e1.setEno(101);
        e1.setEname("Navadarshini");
        Emp e2=new Emp();
        e2.setEno(102);
        e2.setEname("Prasath");
        System.out.println("hashcode value of e1 object:\t"+e1.hashCode());
        System.out.println("hashcode in hexadecimal format of e1 object:\t"+Integer.toHexString(e1.hashCode()));
        System.out.println("e1.toString():\t"+e1.toString());
        System.out.println("e1:\t"+e1);//toString() method is invoking

        System.out.println("hashcode value of e2 object:\t"+e2.hashCode());
        System.out.println("hashcode in hexadecimal format of e2 object:\t"+Integer.toHexString(e2.hashCode()));
        System.out.println("e2.toString():\t"+e2.toString());
        System.out.println("e2:\t"+e2);//toString() method is invoking

        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(10);
        l1.add(10);
        l1.add(10);
        System.out.println("l1:\t"+l1); //toString() method is invoking


        int arr1[]=new int[10];  // a new class will be created with name [I and it is the Child class Object and object will be creted for it
        int arr2[]=new int[10];
        System.out.println(arr1.toString());
        System.out.println(arr2.getClass().getName());
                
    }
}
