# Captain Game

Captain Game is a simple Android game built with Jetpack Compose. The player takes on the role of a captain navigating the seas, searching for treasures while avoiding storms.

## Features

*   **Sail in Four Directions:** Explore by choosing to sail North, South, East, or West.
*   **Treasure Hunting:** Randomly discover treasures as you sail. Each treasure found increases your score.
*   **Avoid Storms:** Encountering a storm will reduce your Health Points (HP).
*   **HP Management:** Keep an eye on your HP. If it reaches zero, the game is over! Finding treasures can sometimes replenish a small amount of HP.
*   **Dynamic UI:** The game state (Treasures Found, Current Direction, HP, and last event) is displayed and updated in real-time.

## How to Play

1.  Launch the app on an Android device or emulator.
2.  The game screen will display your current status:
    *   Treasures Found
    *   Current Direction
    *   Event (Storm or Treasure)
    *   HP
3.  Tap one of the four direction buttons ("Sail North", "Sail East", "Sail South", "Sail West") to move your ship.
4.  Each move has a chance to either find a treasure or encounter a storm.
5.  If you find a treasure, your treasure count increases, and your HP might slightly recover if it's below maximum.
6.  If you encounter a storm, your HP decreases.
7.  The game ends if your HP drops to 0. Your treasure count will reset, and you'll return to the starting state.
8.  Try to collect as many treasures as possible before the game ends!

## Technologies Used

*   **Kotlin:** The programming language used for development.
*   **Jetpack Compose:** Android's modern toolkit for building native UI.
    *   `@Composable` functions for UI elements.
    *   `mutableStateOf` and `remember` for managing UI state.
    *   Basic layout components like `Column`, `Button`, and `Text`.
*   **Android Studio:** The official IDE for Android app development.

## Getting Started (For Developers)

1.  **Clone the repository:**
   <pre lang="bash">git clone https://your-repository-url/captain-game.git</pre>
3.  **Open in Android Studio:**
    *   Open Android Studio.
    *   Select "Open an existing Android Studio project".
    *   Navigate to the cloned `captain-game` directory and select it.
4.  **Build and Run:**
    *   Let Android Studio sync the project and download dependencies.
    *   Select an emulator or connect a physical device.
    *   Click the "Run" button (green play icon).

## Code Overview

The main game logic and UI are located in `MainActivity.kt` within the `CaptainGame` composable function.

*   **State Management:** Game variables like `treasuresFound`, `direction`, `hpLeft`, and `stormOrTreasure` are managed using `mutableStateOf` and `remember` to ensure the UI updates correctly when these values change.
*   **UI Layout:** A `Column` is used to arrange UI elements vertically. `Text` composables display game information, and `Button` composables handle player actions.
*   **Game Logic:** The `onClick` lambdas for each button contain the core game logic:
    *   Updating the current direction.
    *   Using `Random.nextBoolean()` to determine if a treasure is found or a storm is encountered.
    *   Updating game state variables accordingly (treasure count, HP).
    *   Handling the game over condition when HP reaches zero.

## Future Enhancements (Ideas)

*   More complex map or grid-based movement.
*   Different types of treasures with varying values.
*   Power-ups or special items.
*   More types of hazards or events.
*   Improved graphics and animations.
*   Persistent high scores.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

This project is open-source and available under the [Pradip1010100 License](LICENSE.md).

> Developed by [Pradip1010100](https://github.com/Pradip1010100)
