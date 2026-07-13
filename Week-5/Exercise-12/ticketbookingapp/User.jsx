import React from "react";

function User(){

  function bookTicket(){
    alert("Ticket booked successfully!");
  }

  return(
    <div>

      <h2>User Page</h2>

      <p>Welcome User, you can book tickets.</p>

      <button onClick={bookTicket}>
        Book Ticket
      </button>

    </div>
  );
}

export default User;