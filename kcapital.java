public class kcapital
{
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=4;j++)
            {
                if(j==1||j==5-i||i==4&&j==3||i==5&&j==4)
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