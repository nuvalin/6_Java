import React, { useState } from 'react';
import { useAuth } from '../../AuthContext';

export default function Register() {
    const { register } = useAuth();
    const [username, setUsername] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState(null);

    const onSubmit = async (e) => {
        e.preventDefault();
        try { await register(username, email, password); }
        catch (err) { setError('Registration failed'); }
    };

    return (
        <form onSubmit={onSubmit}>
            <input placeholder="Username" value={username} onChange={e=>setUsername(e.target.value)} />
            <input placeholder="Email" value={email} onChange={e=>setEmail(e.target.value)} />
            <input type="password" placeholder="Password" value={password} onChange={e=>setPassword(e.target.value)} />
            <button type="submit">Register</button>
            {error && <p>{error}</p>}
        </form>
    );
}