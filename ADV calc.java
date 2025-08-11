class ADVcalc extends calculator{
    public ADVcalc(int n1,int n2){
        System.out.println("in ADVcalc");
    }
    public  double power(int n1,int n2){
    return Math.pow(n1, n2); 
}
public class KIKI {
    public static void main(String[] args) {
        ADVcalc adv=new ADVcalc( 9,7);
        System.out.println(adv);
    }
}
}

