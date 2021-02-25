package numbers;

public class Number {
   /* static byte a ;
    long s=1211111111111l;
    int b;
    char myChar = '\u0054';
    static boolean g ;
    char ch1;
    double u =3.1144444;
    short o;
    float t= 3.14f;
    char sinb1=1067;
    static char sinb2='Ы';
*/
    static int d;
    static int k;
    public static void main(String[] args) {
        Get get= new Get();
        get.setA((byte) 12);
        System.out.println(get.getA());
        //byte b=2;
        //byte c=3;
        //byte a=(byte) (c+b);
        int s=12;
        int b=17;
        Integer i=200;
        Integer in=new Integer(200);
        double d=Double.valueOf(i);
        String k= "200";
        double z= Double.parseDouble(k);
        System.out.println(in.equals(i));
    }
}
