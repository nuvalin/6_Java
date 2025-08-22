import React, { createContext, useContext, useState } from "react";
import axios from "axios";

const AuthContext = createContext();

// Hook to consume the AuthContext
export const useAuth = () => useContext(AuthContext);

// Provider component
export const AuthProvider = ({ children }) => {
    const [user, setUser] = useState(null);

    // Register a new user
    const register = async (username, email, password) => {
        try {
            const res = await axios.post("http://localhost:8080/api/auth/signup", {
                username,
                email,
                password,
            });
            return res.data;
        } catch (err) {
            console.error("Registration error:", err.response?.data || err.message);
            throw err;
        }
    };

    // Login user
    const login = async (username, password) => {
        try {
            const res = await axios.post(
                "http://localhost:8080/api/auth/signin",
                { username, password }
            );

            // Log response to debug
            console.log("Login response:", res.data);

            // Store JWT token
            localStorage.setItem("token", res.data.token);

            // Store user info locally (username + roles)
            setUser({
                username: res.data.username,
                roles: res.data.roles || []
            });
        } catch (err) {
            console.error("Login error:", err.response?.data || err.message);
            throw err;
        }
    };

    // Logout user
    const logout = () => {
        localStorage.removeItem("token");
        setUser(null);
    };

    // Helper to attach JWT to axios requests
    const authAxios = axios.create({
        baseURL: "http://localhost:8080",
        headers: {
            Authorization: `Bearer ${localStorage.getItem("token")}`,
        },
    });

    return (
        <AuthContext.Provider value={{ user, register, login, logout, authAxios }}>
            {children}
        </AuthContext.Provider>
    );
};