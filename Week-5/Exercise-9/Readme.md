# CricketApp

## Objective

This React application demonstrates the usage of ES6 features such as:

- Array `map()`
- Array `filter()`
- Arrow Functions
- Destructuring
- Spread Operator (Merge Arrays)
- Conditional Rendering using `if-else`

---

## Components

### 1. ListofPlayers

- Stores details of 11 cricket players using an array of objects.
- Displays all player names and scores using the `map()` function.
- Filters and displays players whose score is below 70 using the `filter()` method and arrow functions.

### 2. IndianPlayers

- Displays Odd Team and Even Team players using array destructuring.
- Creates two arrays:
  - T20 Players
  - Ranji Trophy Players
- Merges both arrays using the spread operator (`...`) and displays the merged list.

---

## Project Structure

```
src
│
├── cricketapp
│   ├── App9.jsx
│   ├── ListofPlayers.jsx
│   └── IndianPlayers.jsx
│
├── main.jsx
└── App.jsx
```

---

## Installation

1. Clone or download the project.

2. Install dependencies.

```bash
npm install
```

3. Run the application.

```bash
npm run dev
```

4. Open the browser and navigate to:

```
http://localhost:5173
```

---

## Output

### When `flag = true`

- Displays all cricket players.
- Displays players with scores below 70.

### When `flag = false`

- Displays Odd Team Players.
- Displays Even Team Players.
- Displays merged T20 and Ranji Trophy players.

---

## Technologies Used

- React
- JavaScript (ES6)
- Vite

---

## ES6 Concepts Demonstrated

- `map()`
- `filter()`
- Arrow Functions
- Array Destructuring
- Spread Operator (`...`)
- Conditional Rendering


