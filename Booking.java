import java.util.*;
import java.text.*;
import java.text.*;
public class Booking
{
public static void main(String e)
{
Scanner in = new Scanner(System.in);
String n,k,aw,j,r,f;
int i,g,w;
double nm,h;
char ch;
String password=e;
ch=password.charAt(0);
if((int)ch==65)
{
ch=password.charAt(1);

if((int)ch==109)
{
ch=password.charAt(2);
if((int)ch==101)
{
ch=password.charAt(3);
if((int)ch==101)

{
ch=password.charAt(4);
if((int)ch==115)
{
ch=password.charAt(5);
if((int)ch==104)
{
System.out.println("Enter your Name");
n=in.nextLine();
System.out.println("Hi "+n+" do you want to book a taxi (yes/no)");
k=in.nextLine();
if(k.equalsIgnoreCase("yes"))
{
System.out.println("Enter how many passenger");
i=in.nextInt();
if(i==1)
{
System.out.println("You will get a MINI cab");
System.out.println("You will be charged Rs.6.00 per km");
}
if(i==2)
{
System.out.println("You will get sedan taxi");
System.out.println("You will be charged Rs.6.00 per km");
}

if(i==3)
{
System.out.println("You will get sedan taxi");
System.out.println("You will be charged Rs.6.00 per km");
}
if(i==4)
{
System.out.println("You will get sedan taxi");
System.out.println("You will be charged Rs.6.00 per km");
}
if(i==5)
{
System.out.println("You will get SUV taxi");
System.out.println("You will be charged Rs.6.00 per km");
}
if(i==6)
{
System.out.println("You will get SUV taxi ");
System.out.println("You will be charged Rs.6.00 per km");
}
if(i==7)
{
System.out.println("You will get SUV taxi");
System.out.println("You will be charged Rs.6.00 per km");
}

if(i>=7 && i<=32)
{
System.out.println("You will get MINI bus");
System.out.println("You will be charged Rs.6.00 per km");
}
if(i>=32&&i<=50)
{
System.out.println("You will get a MEGA bus");
System.out.println("You will be charged Rs.6.00 per km");
}

else
{
System.out.println("Where do you want the Taxi");
j=in.next();

Date dNow = new Date( );
SimpleDateFormat ft =
new SimpleDateFormat ("hh:mm a");
System.out.println("Current time: " + ft.format(dNow));
System.out.println("IF YOU WANT THE TAXI AT THE CURRENT INSTANCE TYPE YES");
System.out.println("IF YOU DONT WANT THE TAXI AT THE CURRENT INSTANCE TYPE NO");
r=in.next();
if(r.equalsIgnoreCase("yes"))
{

System.out.println("YOUR TAXI IS ARRIVING IN NEXT 10 MINUTES ");
}
if(r.equalsIgnoreCase("no"))
{
System.out.println("WHEN DO YOU WANT THE TAXI");
nm=in.nextDouble();
{
if(nm==12.00)
System.out.println("Your taxi is arriving before 12:05 am/pm at " +j);
if(nm==12.10)
System.out.println("Your taxi is arriving before 12:15 am/pm at " +j);
if(nm==12.20)
System.out.println("Your taxi is arriving before 12:25 am/pm at " +j);
if(nm==12.30)
System.out.println("Your taxi is arriving before 1:35 am/pm at " +j);
if(nm==12.40)
System.out.println("Your taxi is arriving before 1:45 am/pm at " +j);
if(nm==12.50)
System.out.println("Your taxi is arriving before 2:55 am/pm at " +j);
}
{
if(nm==1.00)
System.out.println("Your taxi is arriving before 1:05 am/pm at " +j);
if(nm==1.10)
System.out.println("Your taxi is arriving before 1:15 am/pm at " +j);

if(nm==1.20)
System.out.println("Your taxi is arriving before 1:25 am/pm at " +j);
if(nm==1.30)
System.out.println("Your taxi is arriving before 1:35 am/pm at " +j);
if(nm==1.40)
System.out.println("Your taxi is arriving before 1:45 am/pm at " +j);
if(nm==1.50)
System.out.println("Your taxi is arriving before 1:55 am/pm at " +j);
}
{
if(nm==2.00)
System.out.println("Your taxi is arriving before 2:05 am/pm at " +j);
if(nm==2.10)
System.out.println("Your taxi is arriving before 2:15 am/pm at " +j);
if(nm==2.20)
System.out.println("Your taxi is arriving before 2:25 am/pm at " +j);
if(nm==2.30)
System.out.println("Your taxi is arriving before 2:35 am/pm at " +j);
if(nm==2.40)
System.out.println("Your taxi is arriving before 2:45 am/pm at " +j);
if(nm==2.50)
System.out.println("Your taxi is arriving before 2:55 am/pm at " +j);
}
{
if(nm==3.00)

System.out.println("Your taxi is arriving before 3:05 am/pm at " +j);
if(nm==3.10)
System.out.println("Your taxi is arriving before 3:15 am/pm at " +j);
if(nm==3.20)
System.out.println("Your taxi is arriving before 3:25 am/pm at " +j);
if(nm==3.30)
System.out.println("Your taxi is arriving before 3:35 am/pm at " +j);
if(nm==3.40)
System.out.println("Your taxi is arriving before 3:45 am/pm at " +j);
if(nm==3.50)
System.out.println("Your taxi is arriving before 3:55 am/pm at " +j);
}
{
if(nm==4.00)
System.out.println("Your taxi is arriving before 4:05 am/pm at " +j);
if(nm==4.10)
System.out.println("Your taxi is arriving before 4:15 am/pm at " +j);
if(nm==4.20)
System.out.println("Your taxi is arriving before 4:25 am/pm at " +j);
if(nm==4.30)
System.out.println("Your taxi is arriving before 4:35 am/pm at " +j);
if(nm==4.40)
System.out.println("Your taxi is arriving before 4:45 am/pm at " +j);
if(nm==4.50)
System.out.println("Your taxi is arriving before 4:55 am/pm at " +j);

}
{
if(nm==5.00)
System.out.println("Your taxi is arriving before 5:05 am/pm at " +j);
if(nm==5.10)
System.out.println("Your taxi is arriving before 5:15 am/pm at " +j);
if(nm==5.20)
System.out.println("Your taxi is arriving before 5:25 am/pm at " +j);
if(nm==5.30)
System.out.println("Your taxi is arriving before 5:35 am/pm at " +j);
if(nm==5.40)
System.out.println("Your taxi is arriving before 5:45 am/pm at " +j);
if(nm==5.50)
System.out.println("Your taxi is arriving before 5:55 am/pm at " +j);
}
{
if(nm==6.00)
System.out.println("Your taxi is arriving before 6:05 am/pm at " +j);
if(nm==6.10)
System.out.println("Your taxi is arriving before 6:15 am/pm at " +j);
if(nm==6.20)
System.out.println("Your taxi is arriving before 6:25 am/pm at " +j);
if(nm==6.30)
System.out.println("Your taxi is arriving before 6:35 am/pm at " +j);
if(nm==6.40)

System.out.println("Your taxi is arriving before 6:45 am/pm at " +j);
if(nm==6.50)
System.out.println("Your taxi is arriving before 6:55 am/pm at " +j);
}
{
if(nm==7.00)
System.out.println("Your taxi is arriving before 7:05 am/pm at " +j);
if(nm==7.10)
System.out.println("Your taxi is arriving before 7:15 am/pm at " +j);
if(nm==7.20)
System.out.println("Your taxi is arriving before 7:25 am/pm at " +j);
if(nm==7.30)
System.out.println("Your taxi is arriving before 7:35 am/pm at " +j);
if(nm==7.40)
System.out.println("Your taxi is arriving before 7:45 am/pm at " +j);
if(nm==7.50)
System.out.println("Your taxi is arriving before 7:55 am/pm at " +j);
}
{
if(nm==8.00)
System.out.println("Your taxi is arriving before 8:05 am/pm at " +j);
if(nm==8.10)
System.out.println("Your taxi is arriving before 8:15 am/pm at " +j);
if(nm==8.20)
System.out.println("Your taxi is arriving before 8:25 am/pm at " +j);

if(nm==8.30)
System.out.println("Your taxi is arriving before 8:35 am/pm at " +j);
if(nm==8.40)
System.out.println("Your taxi is arriving before 8:45 am/pm at " +j);
if(nm==8.50)
System.out.println("Your taxi is arriving before 8:55 am/pm at " +j);
}
{
if(nm==9.00)
System.out.println("Your taxi is arriving before 9:05 am/pm at " +j);
if(nm==9.10)
System.out.println("Your taxi is arriving before 9:15 am/pm at " +j);
if(nm==9.20)
System.out.println("Your taxi is arriving before 9:25 am/pm at " +j);
if(nm==9.30)
System.out.println("Your taxi is arriving before 9:35 am/pm at " +j);
if(nm==9.40)
System.out.println("Your taxi is arriving before 9:45 am/pm at " +j);
if(nm==9.50)
System.out.println("Your taxi is arriving before 9:55 am/pm at " +j);
}
{
if(nm==10.00)
System.out.println("Your taxi is arriving before 10:05 am/pm at " +j);
if(nm==10.10)

System.out.println("Your taxi is arriving before 10:15 am/pm at " +j);
if(nm==10.20)
System.out.println("Your taxi is arriving before 10:25 am/pm at " +j);
if(nm==10.30)
System.out.println("Your taxi is arriving before 10:35 am/pm at " +j);
if(nm==10.40)
System.out.println("Your taxi is arriving before 10:45 am/pm at " +j);
if(nm==10.50)
System.out.println("Your taxi is arriving before 10:55 am/pm at " +j);
}
{
if(nm==11.00)
System.out.println("Your taxi is arriving before 11:05 am/pm at " +j);
if(nm==11.10)
System.out.println("Your taxi is arriving before 11:15 am/pm at " +j);
if(nm==11.20)
System.out.println("Your taxi is arriving before 11:25 am/pm at " +j);
if(nm==11.30)
System.out.println("Your taxi is arriving before 11:35 am/pm at " +j);
if(nm==11.40)
System.out.println("Your taxi is arriving before 11:45 am/pm at " +j);
if(nm==11.50)
System.out.println("Your taxi is arriving before 11:55 am/pm at " +j);
}
}

else
{
System.out.println("YOUR TAXI NUMBER IS MH 46 AU 6525");
System.out.println("YOUR DRIVER DETAILS ARE :");
System.out.println("MANE: MR GANESH");
System.out.println("CONTACT NUMBER: 7021111111");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println("Only for the driver");
System.out.println("NOT FOR PASSENGERS");
System.out.println("Enter how many kilometers you have travelled");
int t=in.nextInt();
double u=t*6.00;
System.out.println("YOUR TOTAL BILL IS Rs."+u);
System.out.println("");
System.out.println(" ");
System.out.println("FOR THE PASSENGERS ONLY");
System.out.println("What is the mode a payment ?");
System.out.println("IF IT IS CREDIT CARD PLEASE PRESS 1");
System.out.println("IF IT IS CASH PAYMENT PLEASE PRESS 2");

int x=in.nextInt();
if(x==1)
{
System.out.println("PLEASE ENTER YOUR CARD NUMBER OF 8 NUMBERS.");
int y=in.nextInt();
System.out.println("PLEASE ENTER THE PIN NUMBER OF 6 DIGITS.");
int v=in.nextInt();
System.out.println("YOUR PAYMENT IS SUCCESSFUL");
System.out.println("YOU WILL GET A CALL FROM OUR COMPANY.");
System.out.println("PLEASE COPERATE");
System.out.println("THE NUMBER IS 7021451683");
}
if(x==2)
{
System.out.println("MR.GANESH WILL RECIEVE THE PAYMENT");
System.out.println("IF THE PAYMENT IS SUCESSFUL THEN YOU MAY GET A CALL");
System.out.println("PLEASE COPERATE AND THE NUMBER");
System.out.println("THE NUMBER IS 7021483563");
}
System.out.println("TAHNK YOU FOR RELING ON AJINKYA TAXI SERVICE");
System.out.println("IF ANY ISSUE PLEASE CONTACT THE HEAD OF THE COMAPANY MR.AJINKYA ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println("All copyrights reserved");
System.out.println("Any issues contact AJINKYA  10 A mobile no **********");
}
}
}
}
}
}
}
}
}
}
}