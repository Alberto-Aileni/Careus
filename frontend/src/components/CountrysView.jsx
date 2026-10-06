import {useCountry} from "../hooks/useCountry.js";
import {useEffect} from "react";
import {NavBar} from "./NavBar.jsx";
import {SectionTitle} from "./SectionTitle.jsx";
import {SearchCharacter} from "./SearchCharacter.jsx";
import {CountrySlot} from "./CountrySlot.jsx";


export function CountrysView(){

    const { data, fetchAll, error, loading } = useCountry();

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
                { data && data.map((country) => (
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