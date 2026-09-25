import {useEffect} from "react";
import {useCharacter} from "../hooks/useCharacter.js";
import {NavBar} from "./NavBar.jsx";
import {SearchCharacter} from "./SearchCharacter.jsx";
import {SectionTitle} from "./SectionTitle.jsx";
import {CountrySlot} from "./CountrySlot.jsx";

export function DisciplinesView(){
    const { data, fetchAll, error, loading } = useCharacter();

    useEffect(() => {
            fetchAll();
        },
        []
    )
    return (
        <section>
            <div>
                <NavBar/>
            </div>
            <div>
                <SectionTitle/>
            </div>
            <div>
                <SearchCharacter/>
            </div>
            <div>
                {data && data.map( (discipline) => (
                    <CountrySlot
                        key={discipline.idDiscipline}
                        id={discipline.idDiscipline}
                        name={discipline.name}
                        description={discipline.description}
                        image={discipline.image}
                    />
                    ))}
            </div>
        </section>
    )
}