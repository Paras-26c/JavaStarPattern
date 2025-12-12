public class NumberThree
{
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=6;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==1||i==6&&(j>=1&&j<=4)||j==4&&(i==2||i==4)||i==3&&j==3||i==5&&j==5)
                {
                    System.out.print(" *");
                }
                else
                
                {

                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
