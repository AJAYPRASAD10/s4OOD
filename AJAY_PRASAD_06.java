public class Patternhollow 
{   
public static void main(String[] args)
{
for (int i=1; i<=11; i++)
{
for (int j=1; j<=(2*11)-i-1; j++)
System.out.print(" ");
for (int j=1; j<=(2*i)-1; j++)
System.out.print("1");
System.out.println();
}

for (int i=1; i<=11-1; i++) 
{
for (int j=1; j<=11-i-1; j++)
System.out.print(" ");
for (int j=1; j<=11; j++)
System.out.print("1");
for (int j=1; j<=(2*i)-1; j++)
System.out.print(" ");
for (int j=1; j<=11; j++)
System.out.print("1");

System.out.println();
}

for (int i=1; i<=11-2; i++) 
{
for (int j=1; j<=i; j++)
System.out.print(" ");
for (int j=1; j<=11; j++)
System.out.print("1");
for (int j=1; j<=((2*11)-3)-(2*i); j++)
System.out.print(" ");
for (int j=1; j<=11; j++)
System.out.print("1");
System.out.println();
}

for (int i=1; i<=11; i++)
{
for (int j=1; j<=9+i; j++)
System.out.print(" ");
for (int j=1; j<=((2*11)+1-(2*i)); j++)
System.out.print("1");
System.out.println();
}
        
}
} 