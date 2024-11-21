public class CarConnect {
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.setEno(101);
        Emp e2=new Emp();
        e2.setEno(102);
        System.out.println("hashcode value of e1 object:\t"+e1.hashCode());
        System.out.println("hashcode in hexadecimal format of e1 object:\t"+Integer.toHexString(e1.hashCode()));
        System.out.println("e1.toString():\t"+e1.toString());

        System.out.println("hashcode value of e2 object:\t"+e2.hashCode());
        System.out.println("hashcode in hexadecimal format of e2 object:\t"+Integer.toHexString(e2.hashCode()));
        System.out.println("e2.toString():\t"+e2.toString());

        
    }
}
