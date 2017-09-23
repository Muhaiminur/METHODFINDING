# METHODFINDING FROM A CLASS  
Write a program to recognize methods in a java program and output their names.  
Sample Input/Output:  
a. public class A {  
int x, int y;  
public int add(int a, int b)  
{  
return a+b;  
}  
public static int subtract(int a, int b)  
{  
return a-b;  
}  
public void add()  
{  
return x+y;  
}  
public static void main(String[]args) {  
System.out.println(subtract(10,5));  
A a=new A();  
a.add(20,10);  
}  
}  
Sample Output:  
Methods:  
add (int a, int b)  
add ()  
subtract ()  
Bonus: If you can output the methods name with their return type.  
Sample Output:  
Methods:  
add (int a, int b), return type: int  
add (), return type: void  
subtract (), return type: int    
#EXAMPLE  
run:  
public  
A  
{  
int  
x,  
int  
y;  
public  
{  
return  
a+b;  
}  
public  
{  
return  
a-b;  
}  
public  
{  
return  
x+y;  
}  
public  
{  
return  
x+y;  
}  
public  
{  
System.out.println(subtract(10,5));  
A  
a=new  
A();  
a.add(20,10);  
}  
}  
OUTPUT::  
PRINTING METHOD ::  
add(a,b)  
subtract(a,b)  
add() 
sub()  
voidmain(String[]args)   


BUILD SUCCESSFUL (total time: 0 seconds)  
