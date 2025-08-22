import React, { useState } from 'react';
import { useAuth } from '../../AuthContext';

export default function Login() {
    const { login } = useAuth();
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState(null);

    const onSubmit = async (e) => {
        e.preventDefault();
        try { await login(username, password); }
        catch (err) { setError('Login failed'); }
    };

    return (
        <form onSubmit={onSubmit}>
            <input placeholder="Username" value={username} onChange={e=>setUsername(e.target.value)} />
            <input type="password" placeholder="Password" value={password} onChange={e=>setPassword(e.target.value)} />
            <button type="submit">Sign in</button>
            {error && <p>{error}</p>}
        </form>
    );
}