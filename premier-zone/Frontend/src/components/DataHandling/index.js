import React, { useEffect, useState } from 'react';
import "./index.scss";
import api from '../../api';

const DataHandling = () => {
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const [playerData, setPlayerData] = useState([]);

    useEffect(() => {
        const params = new URLSearchParams(window.location.search);
        const teamValue = params.get('team');
        const nationValue = params.get('nation');

        let query = '';
        if (teamValue) query = `team=${encodeURIComponent(teamValue)}`;
        else if (nationValue) query = `nation=${encodeURIComponent(nationValue)}`;

        if (query) {
            api.get(`/api/v1/player?${query}`)
                .then(response => {
                    setPlayerData(response.data);
                    setLoading(false);
                })
                .catch(err => {
                    setError(err);
                    setLoading(false);
                });
        } else {
            setLoading(false);
        }
    }, []);

    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error: {error.message}</p>;

    return (
        <div className="table-container">
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
                {playerData.map(player => (
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
        </div>
    );
};

export default DataHandling;