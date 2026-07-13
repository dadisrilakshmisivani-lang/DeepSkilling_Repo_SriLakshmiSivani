import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);

  // Increment Counter
  const increment = () => {
    setCount(count + 1);
  };

  // Decrement Counter
  const decrement = () => {
    setCount(count - 1);
  };

  // Say Hello
  const sayHello = () => {
    alert("Hello! This is a static message.");
  };

  // Multiple methods
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // Welcome Message
  const sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic Event
  const handlePress = (event) => {
    alert("I was clicked");
    console.log(event);
  };

  return (
    <div style={{ margin: "20px" }}>
      <h1>Event Examples App</h1>

      <h2>Counter : {count}</h2>

      <button onClick={handleIncrement}>Increment</button>

      <button onClick={decrement} style={{ marginLeft: "10px" }}>
        Decrement
      </button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handlePress}>
        OnPress
      </button>

      <hr />

      <CurrencyConvertor />

    </div>
  );
}

export default App;