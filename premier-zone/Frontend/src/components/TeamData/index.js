import React, { useEffect, useState } from 'react';
import "./index.scss";
import AnimatedLetters from "../AnimatedLetters";
import { api } from '../../api'; // 🔹 fixed import

const TeamData = () => {
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [playerData, setPlayerData] = useState([]);
  const [playersToShow, setPlayersToShow] = useState(10);
  const [letterClass] = useState('text-animate');

  useEffect(() => {
    const params = new URLSearchParams(window.location.search);
    const teamValue = params.get('team');
    const nationValue = params.get('nation');
    const positionValue = params.get('position');
    const nameValue = params.get('name');

    let query = '';
    if (teamValue) query = `team=${encodeURIComponent(teamValue)}`;
    else if (nationValue) query = `nation=${encodeURIComponent(nationValue)}`;
    else if (positionValue) query = `position=${encodeURIComponent(positionValue)}`;
    else if (nameValue) query = `name=${encodeURIComponent(nameValue)}`;

    if (query) {
      api.get(`/api/v1/player?${query}`)
          .then(response => setPlayerData(response.data))
          .catch(err => setError(err))
          .finally(() => setLoading(false));
    } else {
      setLoading(false);
    }
  }, []);

  if (loading) return <p>Loading...</p>;
  if (error) return <p>Error: {error.message}</p>;

  return (
      <div className="table-container fade-in">
        <h1 className="page-title">
          <AnimatedLetters letterClass={letterClass} strArray={"Player Data".split("")} idx={12} />
        </h1>
        <table>
          <thead>
          <tr>
            <th>Name</th>
            <th>Position</th>
            <th>Age</th>
            <th>Matches Played</th>
            <th>Starts</th>
            <th>Minutes Played</th>
            <th>Goals</th>
            <th>Assists</th>
            <th>Penalties Kicked</th>
            <th>Yellow Cards</th>
            <th>Red Cards</th>
            <th>Expected Goals (xG)</th>
            <th>Expected Assists (xAG)</th>
            <th>Team</th>
          </tr>
          </thead>
          <tbody>
          {playerData.slice(0, playersToShow).map(player => (
              <tr key={player.name}>
                <td>{player.name}</td>
                <td>{player.pos}</td>
                <td>{player.age}</td>
                <td>{player.mp}</td>
                <td>{player.starts}</td>
                <td>{player.min}</td>
                <td>{player.gls}</td>
                <td>{player.ast}</td>
                <td>{player.pk}</td>
                <td>{player.crdy}</td>
                <td>{player.crdr}</td>
                <td>{player.xg}</td>
                <td>{player.xag}</td>
                <td>{player.team}</td>
              </tr>
          ))}
          </tbody>
        </table>
        {playersToShow < playerData.length && (
            <button
                className="show-more-button"
                onClick={() => setPlayersToShow(playersToShow + 10)}
            >
              Show More
            </button>
        )}
      </div>
  );
};

export default TeamData;