import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { useCharacter } from "../hooks/useCharacter.js";
import { NavBar } from "./NavBar.jsx";

export function SelectedCountryView({name, description, flag, formationDate, dismatleDate, characters}){
    const { id } = useParams();
    const { data: character, fetchById, loading, error } = useCharacter();


    return(
        <section>
            <NavBar/>
            <div>
                <img src={flag}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
            <p>{formationDate}</p>
            <p>{dismatleDate}</p>
            <p>{characters}</p>
        </section>
    )
}