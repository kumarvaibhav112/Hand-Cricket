# 🏏 Hand Cricket Game – Java Console Application
# 📜 Overview
This is a fun, console-based Hand Cricket game in Java, inspired by the popular game played using fingers during school days. It simulates the entire game experience, including toss, batting, bowling, scoring, and determining the winner — all using Java's Scanner and Random classes.

## 🎮 Game Sequence
The game follows a realistic sequence of play:
1. Toss by both players – Decide who wins the toss using "ODD or EVEN".
2. Choose to Bat or Bowl – The toss winner decides whether to bat or bowl first.
3. Play the First Inning – Bat until you get out (guess matches computer).
4. Second Player Plays – The opponent bats next.
5. Score Comparison – If the second player's score exceeds the first, they win.
6. Game Result – Declares the winner based on scores.

## 🪙 Toss Mechanism
- Player and computer alternately take turns to bat or bowl.
- The computer also picks a number from 1 to 6.
- The sum of both numbers is checked:
    - If it matches the player's choice (ODD/EVEN), the player wins the toss.
    - Toss winner chooses to Bat or Bowl.

## 🏏 Gameplay Rules
• Player and computer alternately take turns to bat or bowl.
• On batting:
    • Enter a number between 1 to 6.
    • The computer randomly selects a number.
    • If both numbers match → player is out.
    • Otherwise, the number is added to the score.
• The opponent then plays their inning with the same rules.
• The game continues until the opponent is out or the score is exceeded.

## 🔧 Technologies Used
• Java
• Scanner class for input
• Random class for opponent logic
• do-while loops and basic control structures

## 📸 Sample Output
Welcome to Hand Cricket!
Choose ODD or EVEN: odd
Enter your toss number (1-10): 5
Computer chose: 6
Sum is 11 — it's ODD
You won the toss!
Do you want to bat or bowl? bat

You are now batting:
Enter a number (1-10): 4
Computer: 2 → Not out! Score: 4
Enter a number (1-10): 6
Computer: 6 → You're OUT!

Your total score: 10
Computer needs 11 to win...
...
Result: You win!




