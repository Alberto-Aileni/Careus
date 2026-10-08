import {CharacterSlot} from "./CharacterSlot.jsx";
import {AppIcon} from "./AppIcon.jsx";
import {StartButton} from "./StartButton.jsx";
import {useCharacter} from "../hooks/useCharacter.js";
import {useEffect} from "react";

export function HomeView(){

    const { data, fetchAll, error, loading } = useCharacter();
    let sortedCharacters = []

    if (data) {
        sortedCharacters = [...data].sort(() => Math.random() - 0.5).slice(0, 4);
    }

    useEffect(() => {
            fetchAll();
        },
        []
    )

    return(
        <div>
            <div>
                <AppIcon/>
            </div>
            <h1>Careus</h1>
            <div>
                <StartButton/>
            </div>
            <div>
                {sortedCharacters.map((character) => (
                    <CharacterSlot
                        key={character.id}
                        id={character.id}
                        name={character.name}
                        description={character.description}
                        image={character.image}
                    />
                ))}
            </div>
        </div>
    )
}