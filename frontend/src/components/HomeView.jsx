import {CharacterSlot} from "./CharacterSlot.jsx";
import {AppIcon} from "./AppIcon.jsx";
import {NavBar} from "./NavBar.jsx";
import {StartButton} from "./StartButton.jsx";
import {useCharacter} from "../hooks/useCharacter.js";
import {useEffect} from "react";

export function HomeView(){

    const { data, fetchAll, error, loading } = useCharacter();

    useEffect(() => {
            fetchAll();
        },
        []
    )

    console.log("Datos del backend:", data);
    console.log("Error de la API:", error);

    return(
        <div>
            <div>
                <NavBar/>
            </div>
            <div>
                <AppIcon/>
            </div>
            <div>
                <StartButton/>
            </div>
            <div>
                {data && data.map((character) => (
                    <CharacterSlot
                        key={character.id || character.idCharacter}
                        name={character.name}
                        description={character.description}
                        image={character.imageUrl || character.image}
                    />
                ))}
            </div>
        </div>
    )
}