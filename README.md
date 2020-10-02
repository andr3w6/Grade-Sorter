# Grade-Sorter
## This java program sorts grades that are scanned from a text file. The program counts the number of grades in each 25 point range from 0-200 and outputs the number of grades in each category. 
### Comments
This program begins with some text that do not affect the program. Comments are used to help people understand code by providing information within the code. Comments that span multiple lines are enclosed in a backslash star and end with a star backslash. A shorter comment that only affects the rest of the singular line are marked by two backslashes.
### Initial Identifiers
Packages hold similar Java classes and default to the name of the program in lower case.
This program uses import statements to accomplish some of the tasks of this program. The import java.io.IOException is used for errors. The capital IO litterally stands for Input Output. Therefore, this will be noted if there are any errors in the input or the output. The import java.nio.file.Paths is used to obtain the files that this program needs to function correctly. The import java.util.scanner lets users collect data anywhere from small numbers to entire files like in this program that uses a text file. 
### Other
A public class is a class that can be used by other classes. Class definitions are in use from the first brace to the last brace within the program. Java programs are defined by class definitions.
The processing of a program begins at the main method. All Java programs have a main method preceded by public, static, and void.
### Variables
Since this program groups numbers into separate categories, several count variables are needed for the various categories. The count variables are integers initialized to zero by having a zero after the single equals sign. I chose count variables are named by letters such as count_a instead of numbers to not confuse readers into thinking count1 is a count variable that has a value of one. Each count variable represents a 25 number range beginning with zero since a zero is a possible test score. The variable count_a represents the lowest range 0-24, count_b represents the next range 25-49, and this continues all the way to count_h representing highest range, 175-200. The integer variable number_students is left unintialized. This means it does not start with a value like the count variables. Instead, the number_students variable will hold the first number retrieved from the text file later in the program. 
### Input
After the variables, a Scanner object must be created with the new operator. In this line of code, Paths.get is followed by a set of parentheses that have the name of the file inside quotation marks The file used for this program is lab2_input.txt. This is a text file noted by the .txt at the end of the name. However, this can be replaced with another text file and the program will still sort the grades as long as the first number is the number of grades. The next line of code uses the number_students variable where it is assigned in.nextInt(). This line retrieves the first integer from the program. This is done so the number of numbers is not counted as a test score itself because that would mess up a count variable making that variable too high. 
### Loop Statement
A while loop repeats as long as a condition is true. This while loop executes as long as there is still an integer to read from the file. While loops are put in brackets that ensure the code executes all the steps. An integer, integer a, is declared inside the while loop that will be replaced by the next number in the file every time the loop runs. 
### Comparison and Count
The if statement tests a condition that is enclosed in the parentheses after the word if. This is, else-if, else statement tests the integer a against the range of variables. The first if tests to see if variable a is within the range of 0-24. The parentheses in this if statement test it by using less than and greater than symbols that work exactly like they do in math concepts. We can test a very specific range by using two ampersand symbols. This makes sure the integer is not only less than 25, but also makes sure it is not lower than zero. This will make sure that that each value meets both expectations. If the integer is in this range, then count_a is increased. Adding the ++ symbol at the end of the name of the variable increases its value by one. This is called an increment operator. It can be placed before or after the variable. If it is placed before the variable, it is applied before being evaluated. In this program it was placed after the name of the variable, so it will not be applied until after the evaluation. An if statement feeds through all the ifs and else ifs until it reaches the corresponding else as long as each preceding one is false. The statement ends when an if, else if, or else is true. True means, in this context, that the variable is within that specified range. The else ifs that follow the first if work like an if statement they will just test different conditions. The last part of this statement is an else clause. The else clause does not require a range of values because it is understood that the else statement executes if the preceding statements were not true e.g. the value was not between 0 and 174. Therefore, else executes when a value is greater than 174, and its corresponding count variable increases. 
### Output
The last and one of the most important parts of the program are the print statements. A print statement displays the information users need to see. System.out is an object that outputs information. The println method can be used by the System.out object that sends whatever is in the parentheses that proceed it to be displayed. System.out.print means output of things such as text or variables. Using println instead of print is useful if you want what is after this statement to be displayed on the next line. When something is in quotation marks, that text is displayed just like it appears in the code. If you want blank space between multiple items, place a space at the end of what is in quotation marks because other space is not displayed as space once it has been output. Strings can be displayed along with variables as long as they are separated by a plus sign.
