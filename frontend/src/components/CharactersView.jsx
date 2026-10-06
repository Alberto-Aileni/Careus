import {NavBar} from "./NavBar.jsx";
import {CharacterSlot} from "./CharacterSlot.jsx";
import {SectionTitle} from "./SectionTitle.jsx";
import {SearchCharacter} from "./SearchCharacter.jsx";
import {useCharacter} from "../hooks/useCharacter.js";
import {useEffect} from "react";

export function CharactersView(){

    const { data, fetchAll, error, loading } = useCharacter();

    useEffect(() => {
            fetchAll();
        },
        []
    )

    return(
        <section>
            <div>
                <SectionTitle/>
            </div>
            <div>
                <SearchCharacter/>
            </div>
            <div>
                { data && data.map((character) => (
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