# ToDoList
Overview
This Java-based To-Do List Application helps users manage tasks efficiently. It allows users to add tasks, view their list of tasks, and save them to a file. The program is menu-driven, making it simple and intuitive to use.

Features
Add Tasks:
Users can add new tasks to their to-do list interactively.
View Tasks:
Displays the list of all tasks with numbering for easy reference.
Save Tasks to File:
Saves the tasks to a specified file for later reference.
User-Friendly Menu:
Provides a clear menu with options for navigation.
Requirements
Java: JDK 8 or higher.
How to Use
Compile the Program:

bash
Copy code
javac ToDoList.java
Run the Program:

bash
Copy code
java ToDoList
Follow the Menu Options:

Option 1: Add a new task to your list.
Option 2: View all tasks currently in the list.
Option 3: Save tasks to a file (provide a filename like todo.txt).
Option 4: Quit the application.
Example
Program Start:

markdown
Copy code
_________
Go Hatters!!
Program by: Naya ADLA
_________

--- TO-DO LIST MENU ---
1. Add a task
2. View tasks
3. Save tasks to file
4. Quit
----------------------
Select an option (1-4): 
Adding a Task:

arduino
Copy code
Enter a task: Buy groceries
Task 'Buy groceries' added.
Viewing Tasks:

markdown
Copy code
--- Your To-Do List ---
1. Buy groceries
2. Finish homework
----------------------
Saving Tasks:

vbnet
Copy code
Enter the filename to save your tasks (e.g., 'todo.txt'): tasks.txt
Tasks saved to tasks.txt
Quitting:

Copy code
Quitting the application. Goodbye!
Customization
Modify the showMenu() method to add or change menu options.
Add more features such as:
Editing or deleting tasks.
Loading tasks from a file.
Adding due dates or priorities for tasks.
Notes
Ensure the filename provided in Option 3 is valid.
Saved files are plain text, making them easy to edit or share.
