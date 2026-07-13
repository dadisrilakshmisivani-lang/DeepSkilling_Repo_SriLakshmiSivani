import React from "react";

function ListofPlayers() {
  const players = [
    { name: "Virat", score: 90 },
    { name: "Rohit", score: 80 },
    { name: "Gill", score: 65 },
    { name: "Rahul", score: 72 },
    { name: "Hardik", score: 60 },
    { name: "Jadeja", score: 85 },
    { name: "Ashwin", score: 55 },
    { name: "Bumrah", score: 40 },
    { name: "Shami", score: 70 },
    { name: "Siraj", score: 68 },
    { name: "Kuldeep", score: 95 }
  ];

  const below70 = players.filter(player => player.score < 70);

  return (
    <>
      <h2>List of Players</h2>

      {players.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}

      <h3>Players with score below 70</h3>

      {below70.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}
    </>
  );
}

export default ListofPlayers;