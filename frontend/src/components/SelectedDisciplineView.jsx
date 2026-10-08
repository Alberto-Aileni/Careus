import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import {useDiscipline} from "../hooks/useDiscipline.js";
import {CharacterSlot} from "./CharacterSlot.jsx";
import {useCharacter} from "../hooks/useCharacter.js";

export function SelectedDisciplineView({name, description}){
    const { id } = useParams();
    const navigate = useNavigate();
    const { data: discipline, fetchById, loading, error } = useDiscipline();
    const { data: character, fetchByCountry: fetchCharacters } = useCharacter();

    useEffect(() => {
        if (id) {
            fetchById(id);
            fetchCharacters(id);
        }
    }, [id]);

    if (!discipline) {
        return null;
    }

    return(
        <section>
            <div>
                <button onClick={() => navigate("/")} style={{ cursor: "pointer"}}>Volver</button>
            </div>
            <h1>{discipline.name}</h1>
            <p>{discipline.description}</p>
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