# DigitalLogicSimulator

A simple Command-Line Digital Logic Simulator developed as a 3rd Semester Digital 
Logic Design (DLD) project. This program allows users to simulate basic logic 
gates and view their truth tables using binary inputs.

📌 Description
The DigitalLogicSimulator is a Java-based CUI (Character User Interface) application 
that demonstrates the working of fundamental digital logic gates. 
It is designed for educational purposes to help students understand how logic gates 
operate and how truth tables are formed.

✨ Features
* Supports basic logic gates:
  * AND
  * OR
  * NOT
  * NAND
  * NOR
  * XOR
  * XNOR
* Accepts valid binary inputs only (0 or 1)
* Interactive menu-driven interface
* Generates truth tables for all supported gates
* Continuous execution until the user chooses to exit

🛠️ Technologies Used

* Language: Java
* Concepts: Digital Logic Design, Bitwise Operations, Control Structures
* Interface: Command Line (CUI)

📋 Requirements

* Java JDK / JRE 8 or above
* Basic knowledge of logic gates and Java

Make sure `java` and `javac` are added to your system PATH.

▶️ How to Run
If you have the source file (`DigitalLogicSimulator.java`):

```bash
javac DigitalLogicSimulator.java
java DigitalLogicSimulator
```
If you have only the compiled file (`DigitalLogicSimulator.class`):

```bash
java -cp . DigitalLogicSimulator
```
🧪 Usage Instructions

1. Run the program.
2. Select a gate from the menu (1–7).
3. Enter binary input(s) when prompted.
4. View the output.
5. Use option 8 to display a truth table for any gate.
6. Select 9 or press n when asked to exit.

📊 Example
Choose a gate:
1) AND
2) OR
3) NOT
...
Enter input A (0 or 1): 1
Enter input B (0 or 1): 0
Result: 0
```
🚀 Future Improvements

* Add GUI using *Swing or JavaFX*
* Implement enum-based gate structure
* Add command-line arguments for direct execution
* Include unit testing using *JUnit*
* Support multi-input logic gates

🎓 Academic Use
This project is suitable for:
* DLD Lab / Theory Project
* Java Programming Practice
* Logic Gate Demonstrations

👤 Author
Student Name: Pirbhu Ji
Semester: 3rd Semester
Course: Digital Logic Design (DLD)

📄 License
This project is for educational purposes only.

Feel free to modify and extend this project for learning and academic submissions.
