import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { useCharacter } from "../hooks/useCharacter.js";
import { NavBar } from "./NavBar.jsx";

export function SelectedDisciplineView({name, description, characters}){
    const { id } = useParams();
    const { data: character, fetchById, loading, error } = useCharacter();


    return(
        <section>
            <NavBar/>
            <h1>{name}</h1>
            <p>{description}</p>
            <p>{characters}</p>
        </section>
    )
}