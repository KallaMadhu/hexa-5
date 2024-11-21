public class Emp extends Object
{   private int eno;
    private String ename;
    public void setEno(int eno){
        this.eno=eno;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public int getEno(){
        return eno;
    }
    public String getEname()
    {return ename;}
    public int hashCode()
    {
        return (eno+74)*10;
    }
    public String toString()
    {
        return "["+eno+","+ename+"]";
    }
}