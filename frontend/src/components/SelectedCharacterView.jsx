import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { useCharacter } from "../hooks/useCharacter.js";

export function SelectedCharacterView({ name, description, image }) {
    const { id } = useParams();
    const navigate = useNavigate();
    const { data: character, fetchById, loading, error } = useCharacter();

    useEffect(() => {
        if (id) {
            fetchById(id);
        }
    }, [id]);

    if (!character) {
        return null;
    }

    return (
        <section>
            <div>
                <button onClick={() => navigate("/")} style={{ cursor: "pointer"}}>Volver</button>
            </div>
            <div>
                <img src={character.image}/>
            </div>
            <h1>{character.name}</h1>
            <p>{character.description}</p>
        </section>
    )
}
