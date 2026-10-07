import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { useCountry } from "../hooks/useCountry.js";

export function SelectedCountryView({name, description, flagUrl}){
    const { id } = useParams();
    const navigate = useNavigate();
    const { data: country, fetchById, loading, error } = useCountry();

    useEffect(() => {
        if (id) {
            fetchById(id);
        }
    }, [id]);



    return(
        <section>
            <div>
                <button onClick={() => navigate("/")} style={{ cursor: "pointer"}}>Volver</button>
            </div>
            <div>
                <img src={country.flagUrl}/>
            </div>
            <h1>{country.name}</h1>
            <p>{country.description}</p>
        </section>
    )
}