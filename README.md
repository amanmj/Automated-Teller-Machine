# Automated-Teller-Machine
An ATM Emulator GUI based Java applet.
#An ATM cash deliver emulator application that hasthe following functionalities :
a)  Authentication : Asks user to enter pin and password. Data is fetched from MySQL database.<br>
b)  Cash Withdrawl : Cash can be withdrawn in a muliple of 50 only. Promts if balance is less than the amount demanded.<br>
c)  Admin access   : Administrator access to see all accounts, add account, delete account, manipulate records.<br>

#Steps to run the application:
1.) If possible run the "atme.class" in netbeans.<br>
2.) If not available then set classpath to the jdbc driver manually.<br>
3.) Please change the username and password of your localhost if different from "root" and "" respectively in each of the java files where sql query has been run.<br>
4.) Export the database named "hpes" provided into your localhost using the GUI Tools.<br>
     
SQL current TABLE CONTENTS:

Administrator Account: PIN:0001 PASSWORD:1234

Sample Accounts: 
         PIN:0002 PASSWORD 1234<br>
	 PIN:0003 PASSWORD 1234<br>
	 PIN:0004 PASSWORD 1234<br>
	 PIN:0005 PASSWORD 1234<br>
	 PIN:0006 PASSWORD 1234<br>
				 
The account passwords can be changed by logging in to the admin account.
