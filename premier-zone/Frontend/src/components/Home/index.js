import React, { useEffect, useState } from 'react';
import Loader from 'react-loaders';
import { Link } from 'react-router-dom';
import "./index.scss";
import AnimatedLetters from "../AnimatedLetters";
import LogoPL from '../../assets/images/PL.webp';
import { useAuth } from '../../AuthContext';
import api from '../../api';

const Home = () => {
    const { user, logout } = useAuth();
    const [letterClass, setLetterClass] = useState('text-animate');
    const [msg, setMsg] = useState('');

    useEffect(() => {
        const timerId = setTimeout(() => setLetterClass('text-animate-hover'), 4000);
        return () => clearTimeout(timerId);
    }, []);

    const loadSecret = async () => {
        try {
            const { data } = await api.get('/api/demo/hello'); // JWT included automatically
            setMsg(data);
        } catch (err) {
            setMsg(err?.response?.data || 'Error fetching message');
        }
    };

    return (
        <>
            <div className="container home-page">
                <div className="text-zone">
                    <h1>
                        <img src={LogoPL} alt="PremierZone" />
                        <br />
                        <AnimatedLetters letterClass={letterClass} strArray={"Welcome to".split("")} idx={12} />
                        <br />
                        <AnimatedLetters letterClass={letterClass} strArray={"Premier Zone!".split("")} idx={15} />
                    </h1>
                    <h2>Your home for everything Premier League related!</h2>

                    {user ? (
                        <>
                            <button className="flat-button" onClick={logout}>Logout</button>
                            <Link to="/teams" className="flat-button">Go to Teams</Link>
                        </>
                    ) : (
                        <>
                            <Link to="/login" className="flat-button">Login</Link>
                            <Link to="/register" className="flat-button">Register</Link>
                            <Link to="/teams" className="flat-button">GET STARTED</Link>
                        </>
                    )}

                    <div style={{ marginTop: '20px' }}>
                        <button className="flat-button" onClick={loadSecret}>Call Protected API</button>
                        {msg && <p style={{ marginTop: '10px', color: '#ffd700' }}>{msg}</p>}
                    </div>
                </div>
            </div>
            <Loader type="pacman" />
        </>
    );
};

export default Home;