public class UCapital
{
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j==1&&i<=4||j==5&&i<=4||i==5&&j>=2&&j<=4)
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
