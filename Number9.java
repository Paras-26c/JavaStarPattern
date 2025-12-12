public class Number9
{
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j==5||i==3&&j>=2||i==1&&j>=2||i==2&&j==1||i==5)
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
