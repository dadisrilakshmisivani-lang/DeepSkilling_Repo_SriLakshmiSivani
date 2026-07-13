import React from "react";

function Login({login}) {

  return (
    <div>

      <h2>Login Page</h2>

      <input type="text" placeholder="Username"/>

      <br/><br/>

      <input type="password" placeholder="Password"/>

      <br/><br/>

      <button onClick={login}>
        Login
      </button>

    </div>
  );
}

export default Login;