public class Emp extends Object
{   private int eno;
    public void setEno(int eno){
        this.eno=eno;
    }
    public int getEno(){
        return eno;
    }
    public int hashCode()
    {
        return (eno+74)*10;
    }
    public String toString()
    {
        return "["+eno+"]";
    }
}