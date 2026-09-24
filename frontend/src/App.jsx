import { useEffect } from 'react';
import { useCharacter } from './hooks/useCharacter.js';
import {HomeView} from "./components/HomeView.jsx";

export default function App() {


    return (
        <div>
            <HomeView/>
        </div>
    );
}