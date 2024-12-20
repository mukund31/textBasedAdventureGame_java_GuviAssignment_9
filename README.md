# Text Based Adventure Game JAVA Guvi Assignment 9

## Overview
The **Text-Based Adventure Game** is a console-based interactive game where players explore a series of rooms, interact with NPCs, fight monsters, and collect items to achieve the ultimate goal: unlocking the treasure room. The game emphasizes logic-based navigation and decision-making.

---

## Features
1. **Game Navigation**
    - Explore rooms like Entrance, Forest, Dungeon, Store Room, and Treasure Room.
    - Use directional commands (`north`, `east`, `west`, `south`) to move between rooms.
    - Dynamic room descriptions and path options based on the player's location.

2. **Inventory System**
    - Collect and use items like a `potion`, `torch`, and `key` to progress through the game.
    - Check your inventory at any time.

3. **NPC Interaction**
    - Talk to characters like the **Wise Old Man**, **Mystic Elf**, and others for hints and tips.

4. **Combat System**
    - Fight venomous snakes, witches, and a goblin monster.
    - Monitor your health during battles and use a potion to heal.

5. **Win/Lose Conditions**
    - Win by defeating the goblin monster, using the key, and collecting the treasure.
    - Lose if your health drops to zero.

---

## How to Play
1. Run the program in a Java-supported environment.
2. Follow the prompts and enter commands for various options.

---

## Game Logic
1. **Room Connections**
    - Entrance: Connects to Store Room (west), Forest (north), Dungeon (east).
    - Forest: Connects to Entrance (south), Treasure Room (east).
    - Dungeon: Connects to Entrance (west).
    - Store Room: Connects to Entrance (east).
    - Treasure Room: Connects to Forest (west).

2. **Inventory Items Functions**
    - `Torch`: Use in the Dungeon to see in the dark.
    - `Potion`: Restores health to 100.
    - `Key`: Unlock the Treasure Room.

3. **Health Management**
    - Player health decreases during battles. If health reaches zero, the game ends.
    - Snake Fight drops health by 20 points
    - Witch Fight drops health by 60 points
    - Monster Fight drops health by 80 points
---

## Winning the Game
- Defeat the Goblin Monster in the treasure room.
- Use the `key` to unlock the treasure chest.

---

## Prerequisites
- Java Development Kit (JDK) installed.
- Any IDE or text editor supporting Java (e.g., IntelliJ IDEA, Eclipse, or VS Code).

---

## Running the Program
1. Copy the provided code into a `.java` file (e.g., `TextAdventureGame.java`).
2. Compile and run the file using your IDE or the terminal:
   ```bash
   javac TextAdventureGame.java
   java TextAdventureGame

---

## Sample Output Demo
```bash
----------------------------------------------
!! WELCOME TO THE TEXT BASED ADVENTURE GAME !!
----------------------------------------------

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

2
The Wise Old Man Says: Beware of the darkness in the dungeon

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

3
No one to attack here

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

5
Availabe Health: 100

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

6
Availabe Inventory: []

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

7
Your inventory is enpty

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

1
Which direction do you want to go?
north

Current Location: forest
Fight with venomnous snakes to get the torch
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

2
No one to talk to here

Current Location: forest
Fight with venomnous snakes to get the torch
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

3
You defeated the snakes
Availabe Health: 80
Torch Collected

Current Location: forest
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

5
Availabe Health: 80

Current Location: forest
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

6
Availabe Inventory: [torch]

Current Location: forest
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

7
Availabe Inventory: [torch]
What do you want to use?
torch
You cannot use torch here

Current Location: forest
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

1
Which direction do you want to go?
east

Current Location: treasure room
Fight with the Goblin Monster to get into the treasure room
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

4
You return to the Entrance

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

1
Which direction do you want to go?
west

Current Location: store room
Potion Collected
Talk to the Mystic Elf to get some tips
Available Paths: [east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

2
The Mystic Elf Says: Get the key to unlock your fortune

Current Location: store room
Talk to the Mystic Elf to get some tips
Available Paths: [east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

1
Which direction do you want to go?
east

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

1
Which direction do you want to go?
east

Current Location: dungeon
It's quite dark here get some light
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

2
The Guarding Witch Says: Face me to get your companion free

Current Location: dungeon
It's quite dark here get some light
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

7
Availabe Inventory: [torch, potion]
What do you want to use?
torch

Current Location: dungeon
Fight with the Witch to get your companion free and get the key to the treasure
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

2
The Guarding Witch Says: Face me to get your companion free

Current Location: dungeon
Fight with the Witch to get your companion free and get the key to the treasure
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

5
Availabe Health: 80

Current Location: dungeon
Fight with the Witch to get your companion free and get the key to the treasure
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

3
You defeated the witch
Availabe Health: 20
You got your companion free and collected the key to treasure
TIP from companion: The way to the Treasure Room goes through the forest

Current Location: dungeon
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

6
Availabe Inventory: [torch, potion, key]

Current Location: dungeon
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

7
Availabe Inventory: [torch, potion, key]
What do you want to use?
potion

Current Location: dungeon
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

1
Which direction do you want to go?
west

Current Location: entrance
Talk to the Wise Old Man to get some tips
Available Paths: [east, west, north]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

1
Which direction do you want to go?
north

Current Location: forest
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

5
Availabe Health: 100

Current Location: forest
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

6
Availabe Inventory: [torch, key]

Current Location: forest
Available Paths: [south, east]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

1
Which direction do you want to go?
east

Current Location: treasure room
Fight with the Goblin Monster to get into the treasure room
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

3
You defeated the monster
Availabe Health: 20
Nothing to collect here
Use the Key to unlock the treasure case

Current Location: treasure room
Available Paths: [west]

CHOOSE AN ACTION:
-----------------
1: Go to another room
2: Talk
3: Attack
4: Run
5: Check Health
6: Check Inventory
7: Use Inventory

7
Availabe Inventory: [torch, key]
What do you want to use?
key
-----------------------------
!! CONGRATULATIONS YOU WIN !!
-----------------------------```