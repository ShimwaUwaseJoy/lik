class calculator{
    public int add (int n1,int n2){
        return n1+n2;
    }
    public int  sub (int n1 ,int n2){
        return n1- n2;
    }
    public int div (int n1,int n2){
        return n1/n2;
    }
}
public class joy{
    public static void main(String[] args) {
        calculator calc =new calculator();
        int f1=calc.add(7,8);
        int f2=calc.sub(7,8);
        int f3=calc.div(9,3);
        System.out.println(f1+":"+f3+":"+f2);
    }
}
