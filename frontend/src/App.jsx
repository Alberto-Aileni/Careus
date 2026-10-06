import {HomeView} from "./components/HomeView.jsx";
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { SelectedCharacterView } from "./components/SelectedCharacterView.jsx";
import {NavBar} from "./components/NavBar.jsx";
import {CharactersView} from "./components/CharactersView.jsx";
import {CountrysView} from "./components/CountrysView.jsx";
import {DisciplinesView} from "./components/DisciplinesView.jsx";
import {SelectedCountryView} from "./components/SelectedCountryView.jsx";
import {SelectedDisciplineView} from "./components/SelectedDisciplineView.jsx";

export default function App() {


    return (
        <BrowserRouter>
            <NavBar/>
            <Routes>
                <Route path="/" element={<HomeView />} />
                <Route path="/character/characters" element={<CharactersView />} />
                <Route path="/country/countrys" element={<CountrysView />} />
                <Route path="/discipline/disciplines" element={<DisciplinesView />} />

                <Route path="/character/:id" element={<SelectedCharacterView />} />
                <Route path="/country/:id" element={<SelectedCountryView />} />
                <Route path="/discipline/:id" element={<SelectedDisciplineView />} />
            </Routes>
        </BrowserRouter>
    );
}