import { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();

    const rate = 90;

    const result = (Number(rupees) / rate).toFixed(2);

    setEuro(result);
  };

  return (
    <div>
      <h2>Currency Convertor</h2>

      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter Rupees"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />

        <button type="submit">
          Convert
        </button>
      </form>

      <h3>Euro : € {euro}</h3>
    </div>
  );
}

export default CurrencyConvertor;