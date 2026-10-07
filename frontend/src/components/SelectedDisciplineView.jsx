import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import {useDiscipline} from "../hooks/useDiscipline.js";

export function SelectedDisciplineView({name, description}){
    const { id } = useParams();
    const navigate = useNavigate();
    const { data: discipline, fetchById, loading, error } = useDiscipline();

    useEffect(() => {
        console.log("ID recuperado con useParams():", id, "Tipo:", typeof id);
        if (id) {
            fetchById(id);
        }
    }, [id]);

    if (!discipline) {
        return null;
    }

    console.log("ID de la URL:", id);
    console.log("Error del hook:", error);
    console.log("Datos recibidos:", discipline);

    return(
        <section>
            <div>
                <button onClick={() => navigate("/")} style={{ cursor: "pointer"}}>Volver</button>
            </div>
            <h1>{discipline.name}</h1>
            <p>{discipline.description}</p>
        </section>
    )
}