import React from "react";
import "./App10.css";
import officeImage from "./office.jpg";

function App10() {

  const office = {
    name: "Skyline Business Center",
    rent: 55000,
    address: "M.G. Road, Bengaluru"
  };

  const officeList = [
    {
      name: "Skyline Business Center",
      rent: 55000,
      address: "M.G. Road, Bengaluru"
    },
    {
      name: "Tech Park Offices",
      rent: 75000,
      address: "Hitech City, Hyderabad"
    },
    {
      name: "Cyber Towers",
      rent: 62000,
      address: "Madhapur, Hyderabad"
    }
  ];

  return (
    <div className="container">

      <h1>Office Space Rental App</h1>

      <img src={officeImage} alt="Office Space" width="500" />

      <h2>Featured Office</h2>

      <p><b>Name:</b> {office.name}</p>

      <p>
        <b>Rent:</b>
        <span
          className={office.rent < 60000 ? "red" : "green"}
        >
          ₹ {office.rent}
        </span>
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeList.map((item, index) => (
          <div key={index} className="card">

            <h3>{item.name}</h3>

            <p>
              <b>Rent:</b>
              <span
                className={item.rent < 60000 ? "red" : "green"}
              >
                ₹ {item.rent}
              </span>
            </p>

            <p>
              <b>Address:</b> {item.address}
            </p>

          </div>
        ))
      }

    </div>
  );
}

export default App10;