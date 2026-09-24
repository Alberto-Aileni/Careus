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

    console.log("Datos del backend:", data);
    console.log("Error de la API:", error);

    return(
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
                { data && data.map((country) => (
                    <CountrySlot
                        key={country.idCountry}
                        name={country.name}
                        description={country.description}
                        image={country.image}
                    />
                ))}
            </div>
        </section>
    )
}