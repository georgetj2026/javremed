/***************************
 * file:posorneg
 * description: find positive or negative
 * author:jo
 * date :27/09/2023
 */

package remedial;
import java.util.Scanner;
public class posorneg
{
public static void main(String []args)
{
int no;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
no=sc.nextInt();
if(no>0)
 System.out.println("no is positive");
if(no<0)
 System.out.println("no is negative");
}}


