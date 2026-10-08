import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { useCharacter } from "../hooks/useCharacter.js";
import {CountrySlot} from "./CountrySlot.jsx";
import {useDiscipline} from "../hooks/useDiscipline.js";
import {useCountry} from "../hooks/useCountry.js";

export function SelectedCharacterView({ name, description, image }) {
    const { id } = useParams();
    const navigate = useNavigate();
    const { data: character, fetchById, loading, error } = useCharacter();
    const { data: discipline , fetchByCharacter: fetchDisciplines } = useDiscipline();
    const { data: country, fetchByCharacter: fetchCountrys } = useCountry();

    useEffect(() => {
        if (id) {
            fetchById(id);
            fetchDisciplines(id);
            fetchCountrys(id);
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
            <div>
                {discipline && discipline.map((discipline) => (
                    <CountrySlot
                        key={discipline.id}
                        id={discipline.id}
                        name={discipline.name}
                        description={discipline.description}
                        image={discipline.image}
                    />
                ))}
            </div>
            <div>
                {country && country.map((country) => (
                    <CountrySlot
                        key={country.id}
                        id={country.id}
                        name={country.name}
                        description={country.description}
                        image={country.image}
                    />
                ))}
            </div>
        </section>
    )
}
