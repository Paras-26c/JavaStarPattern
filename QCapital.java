public class QCapital
{
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=6;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j==1&&(i==2||i==3||i==4)||j==5&&(i==2||i==3||i==4)||i==1&&(j==2||j==3||j==4)||i==5&&(j==2||j==3||j==4)||j==3&&i==4||j==4&&i==6)
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