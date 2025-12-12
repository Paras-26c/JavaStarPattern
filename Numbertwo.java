public class Numbertwo
{
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==5||j==2&&(i==1||i==4)||j==3&&(i==2||i==3)||i==2&&j==1)
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
