import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { useCountry } from "../hooks/useCountry.js";
import {CharacterSlot} from "./CharacterSlot.jsx";
import {useCharacter} from "../hooks/useCharacter.js";

export function SelectedCountryView({name, description}){
    const { id } = useParams();
    const navigate = useNavigate();
    const { data: country, fetchById, loading, error } = useCountry();
    const { data: character, fetchByCountry: fetchCharacters } = useCharacter();

    useEffect(() => {
        if (id) {
            fetchById(id);
            fetchCharacters(id);
        }
    }, [id]);

    if (!country) {
        return null;
    }

    return(
        <section>
            <div>
                <button onClick={() => navigate("/")} style={{ cursor: "pointer"}}>Volver</button>
            </div>
            <h1>{country.name}</h1>
            <p>{country.description}</p>
            <div>
                {character && character.map((character) => (
                    <CharacterSlot
                        key={character.id}
                        id={character.id}
                        name={character.name}
                        description={character.description}
                        image={character.image}
                    />
                ))}
            </div>
        </section>
    )
}