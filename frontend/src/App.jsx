import { useEffect } from 'react';
import { useCharacter } from './hooks/useCharacter.js';
import {HomeView} from "./components/HomeView.jsx";
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { SelectedCharacterView } from "./components/SelectedCharacterView.jsx";
import {NavBar} from "./components/NavBar.jsx";

export default function App() {


    return (
        <BrowserRouter>
            <NavBar/>
            <Routes>
                <Route path="/" element={<HomeView />} />
                <Route path="/character/:id" element={<SelectedCharacterView />} />
            </Routes>
        </BrowserRouter>
    );
}