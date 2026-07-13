import React, { useState } from "react";
import Guest from "./Guest";
import Login from "./Login";
import User from "./User";


function App12() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [showLogin, setShowLogin] = useState(false);


  function loginHandler() {
    setIsLoggedIn(true);
    setShowLogin(false);
  }


  function logoutHandler() {
    setIsLoggedIn(false);
  }


  return (

    <div>

      <h1>Flight Ticket Booking App</h1>


      {
        isLoggedIn ?

        (
          <>
            <button onClick={logoutHandler}>
              Logout
            </button>

            <User />
          </>
        )

        :

        (
          <>
            <button onClick={() => setShowLogin(true)}>
              Login
            </button>


            {
              showLogin ?

              <Login login={loginHandler} />

              :

              <Guest />

            }

          </>
        )

      }


    </div>

  );

}


export default App12;