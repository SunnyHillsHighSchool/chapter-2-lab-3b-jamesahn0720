[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=4709268&assignment_repo_type=AssignmentRepo)
# Chapter-2-Lab-3b


Lab Goal :   This lab was designed to review basic class creation and to introduce and demonstrate how to use an ArrayList.  


Lab Description :   Create a program that will store a list of Toys and keep track of how many times a particular toy occurs.

Files Needed ::
Toy.java
ToyStore.java
Main.java
.replit
run_button.sh

Sample Runner Code :  
ToyStore sto = new ToyStore();
System.out.println( sto );

String[] s;
s = "sorry bat sorry sorry sorry train train teddy teddy ball ball".split(" ");                 

sto.loadToys( s );
System.out.println( sto );	
System.out.println( "max == " + sto.getMostFrequentToy() );	
System.out.println( sto.getThatToy( "sorry" ) );


Sample Output : 
[]
[sorry 4, bat 1, train 2, teddy 2, ball 2]
max == sorry
sorry 4
