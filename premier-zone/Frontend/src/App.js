// import Players from "./components/Players";
import React, { useEffect } from 'react';
import './App.scss';
import { Route, Routes } from 'react-router-dom';
import ProtectedRoute from './components/ProtectedRoute';
import Login from './components/Login';
import Register from './components/Register';
import Layout from './components/Layout';
import Home from './components/Home';
import Teams from './components/Teams';
import TeamData from './components/TeamData';
import Nation from "./components/Nation";
import Position from "./components/Position";
import Search from "./components/Search";

function App() {
  useEffect(() => {
    document.title = 'PremierZone';
  }, []);

  return (
      <Routes>
        {/* Layout wrapper for all authenticated pages */}
        <Route path="/" element={<Layout />}>
          {/* Public Home page */}
          <Route index element={<Home />} />

          {/* Protected pages */}
          <Route path="teams" element={<ProtectedRoute><Teams /></ProtectedRoute>} />
          <Route path="data" element={<ProtectedRoute><TeamData /></ProtectedRoute>} />
          <Route path="nation" element={<ProtectedRoute><Nation /></ProtectedRoute>} />
          <Route path="position" element={<ProtectedRoute><Position /></ProtectedRoute>} />
          <Route path="search" element={<ProtectedRoute><Search /></ProtectedRoute>} />
        </Route>

        {/* Auth pages (outside Layout if you want different styling) */}
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
      </Routes>
  );
}

export default App;