public class RichaFirstProg {
    private int a1;

    public static void main(String[] args) {

       /* RichaFirstProg obj=new RichaFirstProg();
        obj.a1=10;
        Integer objA=new Integer(10);
        int a=10;
        changeValue(objA,a,obj);
        System.out.println(a+" "+objA+" "+obj.a1);*/
        boolean f=false;

        String str="abc";
        String str1=str;
        str=str+"d";
        Integer i=10;
        Integer i1=i;
        i1=i1+20;
        System.out.println(i+" "+i1);
        if(str==str1)
            f=true;
        System.out.println("str :"+str+"str1 :"+str1+" "+f);
        RichaFirstProg o=new RichaFirstProg();
        RichaFirstProg o1=o;
        o.a1=21;
        o1.a1=20;
        System.out.println(o.a1+" "+o1.a1);

        changeValue(o,i,str);
        System.out.println(o.a1+" "+i+" "+str);

    }

    private static void changeValue(RichaFirstProg objA, int a, String str) {
        objA.a1=2899999;
        a=20000;
        str="mintu";

    }


    public static String reverse(String str)
    {
        String inp[]=str.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=inp.length-1;i>0;i--)
        {
            sb.append(inp[i]+" ");
        }
        sb.append(inp[0]);
        return sb.toString();
    }

    //this method id for addition
    /*public void add() {

        int a=10;
        int b=20;
        System.out.println(a+b);

    }*/

}
