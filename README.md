Java Assignment -1
Ques 1:- When was java developed and who is the inventor of java? Why we use java for programming?
Ans:- Java is an Object-Oriented programming language developed by James Gosling in the early 1990s. The team initiated this project to develop a language for digital devices such as set-top boxes, television, etc. Java was created on the principles like Robust, Portable, Platform Independent, High Performance, Multithread, etc. Currently, Java is used in internet programming, mobile devices, games, e-business solutions, etc.

Ques. 2. What are the features of java.
Ans:- Java is a feature rich language and with every new version, it is continously evolving. It is widely used across billions of devices. Following are the main features of the Java language –
1.	Object Oriented
2.	Platform Independent
3.	Simple
4.	Secure
5.	Architecture-neutral
6.	Portable
7.	Robust
8.	Multithreaded
9.	Interpreted
10.	High Performance
11.	Distributed
12.	Dynamic

Ques. 3. what is JDK, JRE, JVM?
Ans:-  JVM - JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine because it doesn't physically exist. It is a specification that provides a runtime environment in which Java bytecode can be executed. It can also run those programs which are written in other languages and compiled to Java bytecode.
JRE- The Java Runtime Environment is a set of software tools which are used for developing Java applications. It is used to provide the runtime environment. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.


JDK -The Java Development Kit (JDK) is a software development environment which is used to develop Java applications and applets. It physically exists. It contains JRE + development tools.
The JDK contains a private Java Virtual Machine (JVM) and a few other resources such as an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), etc. to complete the development of a Java Application.
Ques. 4. what is the structure of java program. write a program to print hello world.
Ans:- A structure of a Java program contains the following elements:
o	Documentation Section
o	Package Declaration
o	Import Statements
o	Interface Section
o	Class Definition
o	Class Variables and Variables
o	Main Method Class
o	Methods and Behaviour’s
Example:-  A program to print hello world.
package learningDSA_Java;                                   //package Declaration
public class first_program {                                  //Class Definition
    public static void main(String[] args) {           //Main Method
      System.out.println(“Hello World!”); 	         //Print Method
    }
}
Ques. 5. Define Variables in java. Explain different scope of variable.
Ans:- There are three types of variables in Java:
o	local variable - A variable declared inside the body of the method is called local variable. We can use this variable only within that method and the other methods in the class aren't even aware that the variable exists. A local variable cannot be defined with "static" keyword.
o	instance variable - A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static. It is called an instance variable because its value is instance-specific and is not shared among instances.
o	static variable - A variable that is declared as static is called a static variable. It cannot be local. We can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.
Ques. 6. Define data types in java.
Ans:- There are two types of data types in Java:
1.	Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
2.	Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
Ques. 7. What is type casting in java?
Ans:- type casting is a method or process that converts a data type into another data type.
Converting a lower data type into a higher one known as implicit conversion or casting down. It is done automatically. It is safe because there is no chance to lose data. It takes place when:
o	Both data types must be compatible with each other.
o	The target type must be larger than the source type.
byte -> short -> char -> int -> long -> float -> double  

Ques. 9. Define operator and its type?
Ans:- Operators in Java can be classified into 5 types:
1.	Arithmetic Operators 
2.	Assignment Operators
3.	Relational Operators
4.	Logical Operators
5.	Bitwise Operators
1. Arithmetic Operators: Arithmetic operators are used to perform arithmetic/mathematical operations on operands. 
•	Addition (‘+’) :  Adds two operands, like (A + B) or (8 + 3)
•	Subtraction (‘-‘):  Subtracts two operands, like (A – B) or (3 – 2) 
•	Multiplication (‘*’):  Multiplies two operands, like (A * B) or (5 * 2)
•	Division (‘/’): Divides the first operand by the second, like (A / B) or (8 / 2)
•	Modulus (‘%’): Returns the remainder when first operand is divided by the second
•	Increment (‘++’): Increment the value of an integer. 
•	Decrement (‘–‘): Decrement the value of an integer. 



2. Assignment Operators

Operator	Example	Equivalent to
=	a = b;	a = b;
+=	a += b;	a = a + b;
-=	a -= b;	a = a - b;
*=	a *= b;	a = a * b;
/=	a /= b;	a = a / b;
%=	a %= b;	a = a % b;


3. Relational Operators: The relational operators determine the relationship that one operand has to the other. The relational operators evaluate the relation between two operations and returns true if the relation exists else false. Here we compare two operands like they are equal or not? or which one is greater etc…
•	‘==’ operator:  checks whether the two given operands are equal or not. If so, it returns true. Otherwise, it returns false. 
•	‘!=’ operator:  checks whether the two given operands are equal or not. If not, it returns true. Otherwise, it returns false. 
•	‘>’ operator: checks whether the first operand is greater than the second operand. If so, it returns true. Otherwise, it returns false. 
•	‘<‘ operator: checks whether the first operand is lesser than the second operand. If so, it returns true. Otherwise, it returns false. 
•	‘>=’ operator: checks whether the first operand is greater than or equal to the second operand. If so, it returns true. Otherwise, it returns false. 
•	‘<=’ operator: checks whether the first operand is lesser than or equal to the second operand. If so, it returns true. Otherwise, it returns false. 
4. Logical Operators: Logical operators are used to check whether an expression is true or false. They are used in decision making.
Operator	Example	Meaning
&& (Logical AND)	expression1 && expression2	true only if both expression1 and expression2 are true
|| (Logical OR)	expression1 || expression2	true if either expression1 or expression2 is true
! (Logical NOT)	!expression	true if expression is false and vice versa
 
5. Bitwise Operator- The various bitwise operators present in Java are:
Operator	Description
~	Bitwise Complement
              <<	Left Shift
>>	Right Shift
>>>	Unsigned Right Shift
&	Bitwise AND
       ^	Bitwise exclusive OR







