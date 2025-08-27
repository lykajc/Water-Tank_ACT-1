
# Water-Tank_ACT-1
Water Tank Monitoring System: A Java application that resembles water tanks (HomeTank 200L, BuildingTank 1000L) using abstraction and inheritance. With JOptionPane, users can see the status (Full, Empty, In use) of the water and fill or uses water with limits.

# Water Tank Management System (Java Swing GUI)

- Description
This Java project simulates a Water Tank Management System using OOP principles with abstract classes, inheritance, and a Swing-based GUI interface for user interaction. It models two types of water tanks:

**Home Tank** with a capacity of 200 liters
**Building Tank** with a capacity of 1000 liters

Users can:
* Fill the tank with a specific amount of water
* Use water from the tank
* Check the tank's current status

🌟 Features
* Abstract class `WaterTank` to define common behaviors
* Two concrete implementations: `Home_tank` and `Building_Tank`
* Real-time user interaction via `JOptionPane` dialogs
* Error handling for overflow and insufficient water
* Auto-termination if tank becomes **full** or **empty**

 📂 Project Structure

WaterTank_1.java     <-- Main class with GUI logic
WaterTank            <-- Abstract base class
Home_tank            <-- Inherits WaterTank (capacity: 200L)
Building_Tank        <-- Inherits WaterTank (capacity: 1000L)

 ✅ How to Run

1. Ensure you have **Java JDK 8 or higher** installed.

2. Compile the program:
   ```
    javac WaterTank_1.java
   ```
4. Run the program:
   ```
   java WaterTank_1
   ```
5. Interact via pop-up dialogs:
   
   * Choose tank type
   * Select actions (fill, use water, check status)
   * Program will terminate when the tank is full or empty

**Screenshots of Execution**

+ [SCREENSHOTS/ DOCS LINK](https://docs.google.com/document/d/17w1uYPLXLhJqHFqMM7V_Hde2BxMtXEgY4YbjlSdxmJY/edit?usp=sharing)



## 📚 Concepts Used

* Abstract Classes & Inheritance
* Polymorphism
* Swing GUI with JOptionPane
* Control flow and input validation
* Encapsulation with protected variables


## Customization Ideas

* Add more tank types with different capacities
* Implement graphical water level indicators
* Save usage logs to a file
* Add language localization support



Author

Created by: **LYKA JANE L. CABILLAN**
