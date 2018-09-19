package ArrayPractice;

/*An element is said to be a leader if all the elements on it’s right side are smaller than it. Rightmost element is always a leader.
 *For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.
 */
public class leadersInArray {


        public static void main(String args[])
        {
            int[] input={14, 9, 11, 7, 8, 5, 3};
            String a=new String("abc");
            String b="abc";
            System.out.println(a==b);
            a=a.concat("pqr");
            System.out.println(a);
            printLeadersInArray(input);
        }

        private static void printLeadersInArray(int[] input) {
            // TODO Auto-generated method stub
            boolean isLeader=true;
           // System.out.println(input[input.length-1]);
            for(int i=0;i<input.length;i++)
            {
                for(int j=i+1;j<input.length;j++)
                {
                    if(input[i]<input[j])
                    {
                        isLeader=false;
                        break;

                    }
                }
                if(isLeader)
                {  System.out.println(" "+input[i]);

                }
                isLeader=true;
            }

        }

}
